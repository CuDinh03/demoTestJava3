package com.example.demotest;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDao {

    protected static Connection conn;

    public ConnectionDao()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/demotest";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "Password.1");
            System.out.println("Kết nối thành công!");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection(){
        new ConnectionDao();
        return conn;
    }

    public static void main(String[] args) {
//        new ConnectionDao();

        System.out.println(ConnectionDao.conn);
    }
}
