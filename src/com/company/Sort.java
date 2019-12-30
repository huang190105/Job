package com.company;

import sun.util.resources.cldr.uk.CurrencyNames_uk;

import java.awt.*;

/**
 * @author ：Huang
 * @since : 2019/12/24
 */
public class Sort {
    public static void main(String[] args) {









        //排序
        int[] num={10,4,7,2};
        for (int j=0;j<num.length-1;j++){
            for (int i=0;i<num.length-1;i++){
                if(num[i]>num[i+1]){
                    int n=num[i];
                    num[i]=num[i+1];
                    num[i+1]=n;
                }
            }
        }
        for (int i : num){
            System.out.print(i+" ");
        }





        System.out.println();
        int[] buf =  {94,76,84,79,51,31,44,83,26,60};//数组
        for (int j = 0; j < buf.length-1; j++) {//要比较的轮数为：数组元素个数-1
            for (int i = 0; i < buf.length-1-j; i++) {//每比较完一轮下一轮就可以少比较一次
                if(buf[i] < buf[i+1]) {//前一个元素和其后面一个比较
                    //如果前一个元素<其后一个 交换两个元素（从大到小排序）
                    buf[i] = buf[i] ^ buf[i+1];
                    buf[i+1] = buf[i] ^ buf[i+1];
                    buf[i] = buf[i] ^ buf[i+1];
                    // ^ 表示异或 a^a=0 a^0=a
                }
            }
        }
        for(int i : buf) {//数组遍历
            System.out.print(i + " ");//输出
        }

    }


    //插入排序
     public int[] inst(int[] a){
        int arr =a.length;

         for (int i=0; i<arr;i++){
             for (int j=i; j>0 && a[j]<a[j-1];j--){
                 int temp=a[j];
                 a[j] = a[j-1];
                 a[j-1]= temp;
             }
         }
         for (int i:a){
             System.out.print(i+" ");
         }
         return a;
     }
}
