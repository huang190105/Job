package com.company;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ：Huang
 * @since : 2019/12/25
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入1");
        Scanner s = new Scanner(System.in);

        //int 类型相加
        /*int i = s.nextInt();
        int j = s.nextInt();
        System.out.println(i+j);*/

        //String 字符串拼接
        /*String n = s.next();
        String t = s.next();
        System.out.println(n+t);*/

/*        String next = s.next();
        String[] split = next.split("\\+");
        if (split.length>1){
            String join = StringUtils.join(split);
            int num=0;
            String srt = "";
            for (int i=0; i<split.length ;i++){
                if (!Character.isAlphabetic(join.charAt(i))){
                    int tmp = Integer.valueOf(split[i]);
                    num+=tmp;
                }else {
                    srt = srt + split[i];
                    //System.out.println("字符串拼接 ："+ split[0]+split[1]);
                }
            }
            System.out.println("字符串拼接："+srt);

            System.out.println("数字相加 ："+ num);
        }*/

        String val = s.next();
        String[] split = val.split("\\+");
        String[] split2 = val.split("\\-");
        String[] split3 = val.split("\\*");
        String[] split4 = val.split("\\/");

        /*String s1 = split[0];
        String s2 = split2[0];
        String s3 = split3[0];
        String s4 = split4[0];*/

        int result  = 0 ;
        switch (val){

            case "+" :
                        int ride = Integer.parseInt(split[0]);
                        for (int i=1;i<split.length;i++){
                            Pattern compile = Pattern.compile("[0-9]{1,}");
                            Matcher matcher = compile.matcher(split[i]);
                            if (matcher.matches()){
                                ride = ride+ Integer.parseInt(split[i]);
                            }
                        }
                        result = ride;
                        break;
            case "-":
                        int sub = Integer.parseInt(split2[0]);
                        //根据索引来遍历的
                        for (int i=1; i<split2.length;i++){
                            Pattern compile = Pattern.compile("[0-9]{1,}");
                            Matcher matcher = compile.matcher((CharSequence)split2[i]);
                            if (matcher.matches()){
                                sub =sub - Integer.parseInt(split2[i]);
                            }
                        }
                        //System.out.println(sub);
                        result = sub;
                        break;
            case "*":
                        int ri = Integer.parseInt(split3[0]);
                        //根据索引来遍历的
                        for (int i=1; i<split3.length;i++){
                            Pattern compile = Pattern.compile("[0-9]{1,}");
                            Matcher matcher = compile.matcher((CharSequence)split3[i]);
                            if (matcher.matches()){
                                ri =ri * Integer.parseInt(split3[i]);
                            }
                        }
                        System.out.println(ri);
                        break;
            case "/":
                        int sum=Integer.parseInt(split4[0]);
                        for (int i=1;i<split4.length;i++)
                        {
                            Pattern pattern = Pattern.compile("[0-9]{1,}");
                            Matcher matcher = pattern.matcher((CharSequence)split4[i]);
                            if(matcher.matches())
                            {
                                sum=sum/Integer.parseInt(split4[i]);
                            }
                        }
                        System.out.println(sum);
                        break;
            default:
                String str = "";
                for (int i=0; i<split.length;i++){
                     if (!Character.isLetter(i)){
                         str = str+split[i];
                     }
                }
                System.out.println(str);
        }












      /*  String join = StringUtils.join(split);
        if (split.length>1) {
            int a = 0;
            String str= "";
            for (int i = 0; i < split.length; i++) {
                if (!Character.isAlphabetic(join.charAt(i))) {
                    Integer temp = Integer.parseInt(split[i]);
                    a += temp;
                    System.out.println("加法值为:" + a);
                }else {
                    str=str+split[i];
                    System.out.println("字符串拼接为:" + str);
                }
            }
        }else if (split2.length>1){
            String join2 = StringUtils.join(split2);
            int b = 0;
            for (int i=0;i<split2.length-1; i++ ){
                 b= Integer.parseInt(split2[i]);
                if (!Character.isAlphabetic(join2.charAt(i))) {
                    Integer temp = Integer.parseInt(split2[i+1]);
                    b = b-temp;
                }
            }
            System.out.println("减法值为:"+ b);
        }else if (split3.length>1){
            String join3= StringUtils.join(split3);
            int ride= 1;
            for (int i=0;i<split3.length;i++){
                if (!Character.isAlphabetic(join3.charAt(i))){
                    Integer d = Integer.parseInt(split3[i]);
                    ride = ride*d;
                }
            }
            System.out.println("乘法值为:"+ ride);
        }else  if (split4.length>1) {
            String join4 = StringUtils.join(split4);
            int exc = 0;
            for (int i = 0; i < split4.length-1; i++) {
                if (i==0){
                    exc = Integer.parseInt(split4[i]);
                }else {
                    exc = Integer.parseInt(split4[i--]);
                }
                if (!Character.isAlphabetic(join4.charAt(i))) {
                    Integer e = Integer.parseInt(split4[i+1]);
                    exc = exc/e;
                }
            }
            System.out.println("除法值为:"+ exc);
        }*/

/*        System.out.println("请输入第二个数字");
        Scanner sc = new Scanner(System.in);
        String val2 = sc.next();
        String charstr="\\+";
        String[] split1 = val2.split(charstr);
        int sum=0;
        for (int k=0;k<split1.length; k++){
            Integer intK = Integer.parseInt(split1[k]);
            sum=sum+intK;
        }*/
        //System.out.printf(String.valueOf(sum));


    }
}
