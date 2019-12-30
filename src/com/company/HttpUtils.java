package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 
 * @author xie aiqun 2018年3月30日   下午6:02:25
 *    模拟Http请求中的 GET或POST方式
 */
public class HttpUtils {  
    /** 
     * 发送GET请求 
     *  
     * @param url 
     *            目的地址 
     * @param parameters 
     *            请求参数，Map类型。 
     * @return 远程响应结果 
     */  
    public static String sendGet(String url,String par) { 
        String result="";
        BufferedReader in = null;// 读取响应输入流  
        //StringBuffer sb = new StringBuffer();// 存储参数  
        //String params = "";// 编码之后的参数
        try {
            // 编码请求参数  
            //if(parameters.size()==1){
               // for(String name:parameters.keySet()){
                  //  sb.append(name).append("=").append(
                      //      java.net.URLEncoder.encode(parameters.get(name),  
                    //        "UTF-8"));
                //}
               // params=sb.toString();
            //}else{
               // for (String name : parameters.keySet()) {  
                //    sb.append(name).append("=").append(  
                //            java.net.URLEncoder.encode(parameters.get(name),  
                    //                "UTF-8")).append("&");  
               // }  
                String temp_params = par;  
              //  params = temp_params.substring(0, temp_params.length() - 1);  
          //  }
            String full_url = url  + temp_params; 
            System.out.println(full_url); 
            // 创建URL对象  
            java.net.URL connURL = new java.net.URL(full_url);  
            // 打开URL连接  
            java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL  
                    .openConnection();  
            // 设置通用属性  
            httpConn.setRequestProperty("Accept", "*/*");  
            httpConn.setRequestProperty("Connection", "Keep-Alive");  
            httpConn.setRequestProperty("User-Agent",  
                    "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");  
            
            //传入
            httpConn.setRequestProperty("token", "NUMtD0dEXungVX7eLuXkEurH5BCJzw");
            
            // 建立实际的连接  
            httpConn.connect();  
            // 响应头部获取  
            //Map<String, List<String>> headers = httpConn.getHeaderFields();  
            // 遍历所有的响应头字段  
            /*for (String key : headers.keySet()) {  
                System.out.println(key + "\t：\t" + headers.get(key));  
            } */ 
            // 定义BufferedReader输入流来读取URL的响应,并设置编码方式  
            in = new BufferedReader(new InputStreamReader(httpConn  
                    .getInputStream(), "UTF-8"));  
            String line;  
            // 读取返回的内容  
            while ((line = in.readLine()) != null) {  
                result += line;  
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {  
                if (in != null) {  
                    in.close();  
                }  
            } catch (IOException ex) {  
                ex.printStackTrace();  
            }  
        }
        return result ;
    }  
  
    /** 
     * 发送POST请求 
     *  
     * @param url 
     *            目的地址 
     * @param parameters 
     *            请求参数，Map类型。 
     * @return 远程响应结果 
     */  
    public static String sendPost(String url, Map<String, String> parameters) {  
        String result = "";// 返回的结果  
        BufferedReader in = null;// 读取响应输入流  
        PrintWriter out = null;  
        StringBuffer sb = new StringBuffer();// 处理请求参数  
        String params = "";// 编码之后的参数  
        System.out.println("请求地址是:"+url);
        try {  
        	if(parameters.size()>0){
            // 编码请求参数  
            if (parameters.size() == 1) {  
                for (String name : parameters.keySet()) {  
                    sb.append(name).append("=").append(  
                            java.net.URLEncoder.encode(parameters.get(name),  
                                    "UTF-8"));  
                }  
                params = sb.toString();  
            } else {  
                for (String name : parameters.keySet()) {  
                    sb.append(name).append("=").append(  
                            java.net.URLEncoder.encode(parameters.get(name),  
                                    "UTF-8")).append("&");  
                }  
                String temp_params = sb.toString();  
                params = temp_params.substring(0, temp_params.length() - 1);  
            }  
        	}
            System.out.println("发送的请求参数是:"+params);
            // 创建URL对象  
            java.net.URL connURL = new java.net.URL(url);  
            // 打开URL连接  
            java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL  
                    .openConnection();  
            // 设置通用属性  
            httpConn.setRequestProperty("Accept", "*/*");  
            httpConn.setRequestProperty("Connection", "Keep-Alive");  
            httpConn.setRequestProperty("User-Agent",  
                    "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");  
           //httpConn.setRequestProperty("Content-Type","application/json");//设定 请求格式 json，也可以设定xml格式的
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            //传入
            httpConn.setRequestProperty("token", "NUMtD0dEXungVX7eLuXkEurH5BCJzw");
            //
            
            // 设置POST方式  
            httpConn.setDoInput(true);  
            httpConn.setDoOutput(true);  
            // 获取HttpURLConnection对象对应的输出流  
            out = new PrintWriter(httpConn.getOutputStream());  
            // 发送请求参数  
            out.write(params);  
            // flush输出流的缓冲  
            out.flush();  
            // 定义BufferedReader输入流来读取URL的响应，设置编码方式  
            in = new BufferedReader(new InputStreamReader(httpConn  
                    .getInputStream(), "UTF-8"));  
            String line;  
            // 读取返回的内容  
            while ((line = in.readLine()) != null) {  
                result += line;  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (out != null) {  
                    out.close();  
                }  
                if (in != null) {  
                    in.close();  
                }  
            } catch (IOException ex) {  
                ex.printStackTrace();  
            }  
        }  
        System.out.println("返回结果是:"+result);
        return result;  
    }  
    
    
    public static String getResult(String xml ){
    	Integer begin = xml.indexOf("{");
		Integer end = xml.indexOf("}");
		String result = xml.substring(begin, end+1);
		System.out.println(xml.length());
		System.out.println(result);
		return result;
    }
    
    
    
    public static void main(String[] args) {
		String xml = "sf,<{\"result\":\"0x38ac2bb2b0a27d46d71e7b4ae395eb5787534f9e\",\"error\":null}sdgf>" ;
		Integer begin = xml.indexOf("{");
		Integer end = xml.indexOf("}");
		String result = xml.substring(begin, end+1);
		System.out.println(result);
	}
    
    
}
  
