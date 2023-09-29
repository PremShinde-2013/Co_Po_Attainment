/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author oXCToo
 */
public class ConnectionUtils {
    Connection conn = null;
    public static Connection conDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copouser", "root","");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ConnectionUtils : "+ex.getMessage());
           return null;
        }
    }
    //make sure you add the lib
}

// public void Connect(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copoattainment", "root","");
//            
//            
//        }catch(ClassNotFoundException ex){
//            
//        }
//        catch(SQLException ex){
//        ex.printStackTrace();
//    }