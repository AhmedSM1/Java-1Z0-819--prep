package com.ahmed.chapter5;

import java.sql.*;

public class DBConnectivity {

    public static void main(String[] args) {
        System.out.println("Database Connectivity");
        connectToDB();
    }

    private static void connectToDB()  {
        try {

            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost/classicmodels?useUnicode=yes&characterEncoding=UTF-8",
                            "mysqluser",
                            "mysqlpw");
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            c.close();
        }catch(Exception e){ System.out.println(e);}
}

}



