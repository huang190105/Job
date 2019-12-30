package com.company;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.company.keystore.wallet.WalletUtility;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //分割
        /*String str = "a|b|c";
        String[] split = str.split("\\|");
        System.out.println(String.valueOf(split.length));
        for (int i= 0; i<split.length ;i++){
            System.out.println(String.valueOf(split[i]));
        }
        System.out.println("---------------------------------");*/


      System.out.println("请输入数字");
        Scanner s=new Scanner(System.in);

        System.out.println("输入2");
        int i = s.nextInt();
        System.out.println("输入3");
        int j= s.nextInt();

      /*   System.out.printf("输入1");
        int a = s.nextInt();
        System.out.printf("输入2");
        int b =  s.nextInt();
        System.out.printf("输入3");
        int c = s.nextInt();

        int y = (a > b)? a : b;
        int z = (y > c)? y : c;

        System.out.printf(String.valueOf(z));*/

        /*System.out.printf("i=");
        int i = s.nextInt();
        System.out.printf("j=");
        int j = s.nextInt();

        System.out.printf(String.valueOf(i==j));*/

        try {
        String msg = s.next();

    //    if (msg !=""){

            String[] splitMsg = msg.split("\\+",0);

            if (splitMsg.length>1 ) {
                int temp = Integer.valueOf(splitMsg[0]) + Integer.valueOf(splitMsg[1]);
                System.out.printf(String.valueOf(temp));
            }
            else
            {
                System.out.println("请不要挑战我智商");

            }
            //System.out.println(msg);
        /*}else {
            System.out.println("请输入有效字符");
        }*/
        }catch (Exception e){
            System.out.println("请输入两数加法数字");
        }
    }
}
