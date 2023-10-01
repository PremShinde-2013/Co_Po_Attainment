///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
// */
//package copoattainment;
//
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ResourceBundle;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.XYChart;
//import javafx.scene.layout.AnchorPane;
//import static utils.ConnectionUtils.conDB;
//
///**
// * FXML Controller class
// *
// * @author ASUS
// */
//public class POCOGraphController implements Initializable {
//
//    @FXML
//    private AnchorPane main_form;
//    @FXML
//    private BarChart<?, ?> BarChart;
//
//    private Connection connect;
//    private PreparedStatement prepare;
//    private ResultSet result;
//    
//    public class ConnectionUtils {
//    Connection conn = null;
//    
//    public  Connection conDB()
//    {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copoattainment", "root","");
//            return con;
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.err.println("ConnectionUtils : "+ex.getMessage());
//           return null;
//        }
//    }
//    //make sure you add the lib
//}
//    
//    public void chart(){
//        String chartSql = "SELECT `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping` FROM `copotable`ORDER BY timestamp ASC LIMIT 12";
//        
//         conDB();
//         
//         try{
//             XYChart.Series chartData =  new XYChart.Series();
//             prepare = connect.prepareStatement(chartSql);
//             result = prepare.executeQuery();
//             while(result.next()){
//                 chartData.getData().add(new XYChart.Data(result.getInt(1),result.getInt(2),result.getInt(3)));
//                 
//             }
//             BarChart.getData().add(chartData);
//         }catch(Exception e){e.printStackTrace();
//         
//         }
//                 
//               
//        
//        
//        
//        
//        
//    }
//
//            
//    /**
//     * Initializes the controller class.
//     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//        chart();
//    }    
//    
//}


package copoattainment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class POCOGraphController implements Initializable {

    @FXML
    private AnchorPane main_form;
    @FXML
    private BarChart<?, ?> BarChart;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    public Connection conDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Note the change in the driver class name.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copoattainment", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ConnectionUtils : " + ex.getMessage());
            return null;
        }
    }

    public void chart() {

        String chartSql = "SELECT `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping` FROM `copotable` ORDER BY timestamp ASC LIMIT 12";
//                String chartSql = "SELECT `height`, `weight` FROM `table`  LIMIT 12";

        connect = conDB();

        try {
            XYChart.Series chartData = new XYChart.Series();
            prepare = connect.prepareStatement(chartSql);
            result = prepare.executeQuery();
            while (result.next()) {
                chartData.getData().add(new XYChart.Data(result.getString(1), result.getInt(2)));
            }
            BarChart.getData().add(chartData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) result.close();
                if (prepare != null) prepare.close();
                if (connect != null) connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chart();
    }
}
