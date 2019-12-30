package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author ：Huang
 * @since : 2019/12/25
 */
public class DataBase {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.driver";
        String user ="root";
        String password = "root";
        String url="http://localhost:8080";

        try {
            //加载驱动
            Class.forName("driver");
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接成功");

            //创建Statement对象
            Statement statement = con.createStatement();
            //建立结果集
            ResultSet resultSet = statement.executeQuery("SELECT * FROM  user");
            System.out.println("查询成功");
            while (resultSet.next()){
                System.out.printf(resultSet.getString(1)+" "+resultSet.getString("userName"));
            }

            //关闭流
            con.close();
            statement.close();
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
