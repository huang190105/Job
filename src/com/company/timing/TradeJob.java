package com.company.timing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.company.Block;
import com.company.HttpUtils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;



/**
 * 孵化同步
 * @author csp
 *
 */
@Configuration
@EnableScheduling
@Component 
public class TradeJob {

	//private static Logger logger = LoggerFactory.getLogger(TradeJob.class);

	@Scheduled(fixedDelay = 1000 * 90) // 上一次开始执行时间点之后1分钟再执行
	//public static void main(String[] args){
    public void detailFactoryBean( ) throws ParseException {// ScheduleTask为需要执行的任务
    	//logger.info("----------------------进入孵化同步区块的方法---------------------");

		for (int i = 1; i <= 100; i++) {
			JSONObject jsonobj = interfaceUtil("http://47.244.52.251:19585/block/" + i + "");//get请求
			// TODO: 2019/11/19  我要插入区块信息
			Block block = JSON.toJavaObject(jsonobj, Block.class);
			JSONArray bodyJson = jsonobj.getJSONArray("body");
			block.setRemarks(String.valueOf(bodyJson.size()));
			String url = "http://127.0.0.1:8080/block/add";
			try {
				HttpUtils.sendPost(url, (Map) JSON.parse(JSONObject.toJSONString(block)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

    	

	}

	public static JSONObject interfaceUtil(String path) {
		JSONObject jsonResult = null;
		try {
			URL url = new URL(path);
			//打开和url之间的连接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			PrintWriter out = null;
			/**设置URLConnection的参数和普通的请求属性****start***/
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");

			/**设置URLConnection的参数和普通的请求属性****end***/
			//设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
			//最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
			//post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod("GET");//GET和POST必须全大写
			/**
			 * 如果只是发送GET方式请求，使用connet方法建立和远程资源之间的实际连接即可；
			 * 如果发送POST方式的请求，需要获取URLConnection实例对应的输出流来发送请求参数。
			 * */
			conn.connect();
            /*out = new PrintWriter(conn.getOutputStream());//获取URLConnection对象对应的输出流
            out.print(data);//发送请求参数即数据
            out.flush();//缓冲数据
            */

			//获取URLConnection对象对应的输入流
			InputStream is = conn.getInputStream();
			//构造一个字符流缓存
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = "";
			String joinStr = "";
			while ((str = br.readLine()) != null) {
				str = new String(str.getBytes(), "UTF-8");//解决中文乱码问题
				joinStr += str;
			}
			System.out.println(joinStr);
			//关闭流
			is.close();
			//断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
			//固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
			conn.disconnect();
			System.out.println("完整结束");
			jsonResult = JSONObject.parseObject(joinStr);
			//jsonobject = JSONObject.fromObject(joinStr);


		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("sssssss");
		return jsonResult;
	}
	
	
	

}
