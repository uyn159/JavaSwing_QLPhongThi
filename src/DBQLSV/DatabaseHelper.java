/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBQLSV;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DatabaseHelper {    
    public static final String connectionUrl = "jdbc:sqlserver://localhost;databaseName=QLPhongThi;user=sa;password=260720";
    public static Connection getDBConnect(){
        Connection conn= null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(Exception e){
            System.out.println("Chưa có Driver"+e.toString());
        }
        try{
            conn = DriverManager.getConnection(connectionUrl);
            return conn;
        }catch(Exception e){
            System.out.println("Lỗi connect"+e.toString());
        }
        return null;
    }
}

