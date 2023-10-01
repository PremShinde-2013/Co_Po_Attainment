///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package utils;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// *
// * @author oXCToo
// */
//public class ConnectionUtils {
//    Connection conn = null;
//    public static Connection conDB(String dbName)
//    {
////        try {
////            Class.forName("com.mysql.jdbc.Driver");
////            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/"+ dbName, "root","");
////            return con;
////        } catch (ClassNotFoundException | SQLException ex) {
////            System.err.println("ConnectionUtils : "+ex.getMessage());
////           return null;
////        }
//         try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + dbName, "root", "");
//            return con;
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.err.println("ConnectionUtils : " + ex.getMessage());
//            return null;
//        }
//    }
//
//    public static Connection createNewDatabase(String dbName) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/", "root", "");
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
//            con.close();
//            return conDB(dbName);
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.err.println("ConnectionUtils : " + ex.getMessage());
//            return null;
//        }
//    }
//
//
//    }
//    //make sure you add the lib
//
//
//// public void Connect(){
////        try{
////            Class.forName("com.mysql.jdbc.Driver");
////            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copoattainment", "root","");
////            
////            
////        }catch(ClassNotFoundException ex){
////            
////        }a
////        catch(SQLException ex){
////        ex.printStackTrace();
////    }

package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtils {
    public static Connection conDB(String dbName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + dbName, "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ConnectionUtils : " + ex.getMessage());
            return null;
        }
    }

    public static Connection createNewDatabase(String dbName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
            stmt.executeUpdate("USE " + dbName); // Select the newly created database

            // Create the users table if it doesn't exist
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "firstname VARCHAR(255),"
                    + "lastname VARCHAR(255),"
                    + "username VARCHAR(255),"
                    + "password VARCHAR(255)"
                    + ")";
            stmt.executeUpdate(createTableQuery);

            con.close();
            return conDB(dbName);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ConnectionUtils : " + ex.getMessage());
            return null;
        }
    }
}
