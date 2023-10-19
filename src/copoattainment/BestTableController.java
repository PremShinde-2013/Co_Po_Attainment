/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package copoattainment;

import java.net.URL; 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import utils.ConnectionUtils;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class BestTableController implements Initializable {
    

    @FXML
    private TextArea po1com1;
    @FXML
    private TextArea po1com2;
    @FXML
    private TextArea po1com3;
    @FXML
    private TextArea po1com4;
    @FXML
    private TextArea po1ind1;
    @FXML
    private TextArea po1ind2;
    @FXML
    private TextArea po1ind3;
    @FXML
    private TextArea po1ind4;
    @FXML
    private TextArea po1ind5;
    @FXML
    private TextField po1w1;
    @FXML
    private TextField po1w2;
    @FXML
    private TextField po1w3;
    @FXML
    private TextField po1w4;
    @FXML
    private TextField po1w5;
    @FXML
    private TextField po1co11;
    @FXML
    private TextField po1co12;
    @FXML
    private TextField po1co13;
    @FXML
    private TextField po1co14;
    @FXML
    private TextField po1co15;
    @FXML
    private TextField po1co21;
    @FXML
    private TextField po1co22;
    @FXML
    private TextField po1co23;
    @FXML
    private TextField po1co24;
    @FXML
    private TextField po1co25;
    @FXML
    private TextField po1co31;
    @FXML
    private TextField po1co33;
    @FXML
    private TextField po1co32;
    @FXML
    private TextField po1co34;
    @FXML
    private TextField po1co35;
    @FXML
    private TextField po1co41;
    @FXML
    private TextField po1co42;
    @FXML
    private TextField po1co43;
    @FXML
    private TextField po1co44;
    @FXML
    private TextField po1co45;
    @FXML
    private TextField po1co51;
    @FXML
    private TextField po1co52;
    @FXML
    private TextField po1co53;
    @FXML
    private TextField po1co54;
    @FXML
    private TextField po1co55;
    @FXML
    private TextField po1wtotal;
    @FXML
    private TextField po1co1total;
    @FXML
    private TextField po1co2total;
    @FXML
    private TextField po1co3total;
    @FXML
    private TextField po1co4total;
    @FXML
    private TextField po1co5total;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btndelete;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btnmapping;
    @FXML
    private TextArea po11;
    @FXML
    private TextArea po12;
    @FXML
    private TextArea po13;
    @FXML
    private TextArea po14;
    @FXML
    private TextArea po15;
    @FXML
    private TextArea po1com5;
    @FXML
    private TextField dbtablename;
    
    private Label lblUsername;
     private String username;
     

    public void setUsername(String username) {
        this.username = username;
//        lblUsername.setText("Welcome, " + username + "!");
    }
    /**
     * Initializes the controller class.
     */
      
//// string for po's
//    String program11, program12, program13, program14, program15;
//String program21, program22, program23, program24, program25;
//
////  unique names  for competency
//
//String program1com1, program1com2, program1com3, program1com4, program1com5;
//String program2com1, program2com2, program2com3, program2com4, program2com5;
//
////  unique names  for weights
//String po1w1Value, po1w2Value, po1w3Value, po1w4Value, po1w5Value;
//String po2w1Value, po2w2Value, po2w3Value, po2w4Value, po2w5Value;
    
    
//    String program11, program12, program13, program14, program15;
//    String program1com1, program1com2, program1com3, program1com4, program1com5;
//    String po1w1Value, po1w2Value, po1w3Value, po1w4Value, po1w5Value;
//    String program1co11, program1co12, program1co13, program1co14, program1co15;
//
//    // For Program 2
//    String program21, program22, program23, program24, program25;
//    String program2com1, program2com2, program2com3, program2com4, program2com5;
//    String po2w1Value, po2w2Value, po2w3Value, po2w4Value, po2w5Value;
//    String program2co11, program2co12, program2co13, program2co14, program2co15;

    
    @FXML
    private void Add(ActionEvent event) {
        
 

        
        
    String program11, program12, program13, program14, program15;
    String program1com1, program1com2, program1com3, program1com4, program1com5;
    String program1ind1, program1ind2, program1ind3, program1ind4, program1ind5;
    String po1w1Value, po1w2Value, po1w3Value, po1w4Value, po1w5Value ,po1wtotalvalue;
    String program1co11, program1co12, program1co13, program1co14, program1co15, program1co1total;
    String program1co21, program1co22, program1co23, program1co24, program1co25,program1co2total;
    String program1co31, program1co32, program1co33, program1co34, program1co35 ,program1co3total;
    String program1co41, program1co42, program1co43, program1co44, program1co45 ,program1co4total;
    String program1co51, program1co52, program1co53, program1co54, program1co55 ,program1co5total;

    // For Program 2
    String program21, program22, program23, program24, program25;
    String program2com1, program2com2, program2com3, program2com4, program2com5;
    String program2ind1, program2ind2, program2ind3, program2ind4, program2ind5;
    String po2w1Value, po2w2Value, po2w3Value, po2w4Value, po2w5Value,po2wtotalvalue;
    String program2co11, program2co12, program2co13, program2co14, program2co15,program2co1total;
    String program2co21, program2co22, program2co23, program2co24, program2co25,program2co2total;
    String program2co31, program2co32, program2co33, program2co34, program2co35,program2co3total;
    String program2co41, program2co42, program2co43, program2co44, program2co45,program2co4total;
    String program2co51, program2co52, program2co53, program2co54, program2co55,program2co5total;
    
//    for Program 3 
    String program31, program32, program33, program34, program35;
    String program3com1, program3com2, program3com3, program3com4, program3com5;
    String program3ind1, program3ind2, program3ind3, program3ind4, program3ind5;
    String po3w1Value, po3w2Value, po3w3Value, po3w4Value, po3w5Value, po3wtotalvalue;
    String program3co11, program3co12, program3co13, program3co14, program3co15, program3co1total;
    String program3co21, program3co22, program3co23, program3co24, program3co25, program3co2total;
    String program3co31, program3co32, program3co33, program3co34, program3co35, program3co3total;
    String program3co41, program3co42, program3co43, program3co44, program3co45, program3co4total;
    String program3co51, program3co52, program3co53, program3co54, program3co55, program3co5total;


//    for program 4
    String program41, program42, program43, program44, program45;
    String program4com1, program4com2, program4com3, program4com4, program4com5;
    String program4ind1, program4ind2, program4ind3, program4ind4, program4ind5;
    String po4w1Value, po4w2Value, po4w3Value, po4w4Value, po4w5Value, po4wtotalvalue;
    String program4co11, program4co12, program4co13, program4co14, program4co15, program4co1total;
    String program4co21, program4co22, program4co23, program4co24, program4co25, program4co2total;
    String program4co31, program4co32, program4co33, program4co34, program4co35, program4co3total;
    String program4co41, program4co42, program4co43, program4co44, program4co45, program4co4total;
    String program4co51, program4co52, program4co53, program4co54, program4co55, program4co5total;
    
//    for p5

 String program51, program52, program53, program54, program55;
    String program5com1, program5com2, program5com3, program5com4, program5com5;
    String program5ind1, program5ind2, program5ind3, program5ind4, program5ind5;
    String po5w1Value, po5w2Value, po5w3Value, po5w4Value, po5w5Value, po5wtotalvalue;
    String program5co11, program5co12, program5co13, program5co14, program5co15, program5co1total;
    String program5co21, program5co22, program5co23, program5co24, program5co25, program5co2total;
    String program5co31, program5co32, program5co33, program5co34, program5co35, program5co3total;
    String program5co41, program5co42, program5co43, program5co44, program5co45, program5co4total;
    String program5co51, program5co52, program5co53, program5co54, program5co55, program5co5total;

//  for p6
String program61, program62, program63, program64, program65;
    String program6com1, program6com2, program6com3, program6com4, program6com5;
    String program6ind1, program6ind2, program6ind3, program6ind4, program6ind5;
    String po6w1Value, po6w2Value, po6w3Value, po6w4Value, po6w5Value, po6wtotalvalue;
    String program6co11, program6co12, program6co13, program6co14, program6co15, program6co1total;
    String program6co21, program6co22, program6co23, program6co24, program6co25, program6co2total;
    String program6co31, program6co32, program6co33, program6co34, program6co35, program6co3total;
    String program6co41, program6co42, program6co43, program6co44, program6co45, program6co4total;
    String program6co51, program6co52, program6co53, program6co54, program6co55, program6co5total;
    
//    for p7
String program71, program72, program73, program74, program75;
String program7com1, program7com2, program7com3, program7com4, program7com5;
String program7ind1, program7ind2, program7ind3, program7ind4, program7ind5;
String po7w1Value, po7w2Value, po7w3Value, po7w4Value, po7w5Value, po7wtotalvalue;
String program7co11, program7co12, program7co13, program7co14, program7co15, program7co1total;
String program7co21, program7co22, program7co23, program7co24, program7co25, program7co2total;
String program7co31, program7co32, program7co33, program7co34, program7co35, program7co3total;
String program7co41, program7co42, program7co43, program7co44, program7co45, program7co4total;
String program7co51, program7co52, program7co53, program7co54, program7co55, program7co5total;
//for po8
String program81, program82, program83, program84, program85;
String program8com1, program8com2, program8com3, program8com4, program8com5;
String program8ind1, program8ind2, program8ind3, program8ind4, program8ind5;
String po8w1Value, po8w2Value, po8w3Value, po8w4Value, po8w5Value, po8wtotalvalue;
String program8co11, program8co12, program8co13, program8co14, program8co15, program8co1total;
String program8co21, program8co22, program8co23, program8co24, program8co25, program8co2total;
String program8co31, program8co32, program8co33, program8co34, program8co35, program8co3total;
String program8co41, program8co42, program8co43, program8co44, program8co45, program8co4total;
String program8co51, program8co52, program8co53, program8co54, program8co55, program8co5total;

// p9
 
        String program91, program92, program93, program94, program95;
        String program9com1, program9com2, program9com3, program9com4, program9com5;
        String program9ind1, program9ind2, program9ind3, program9ind4, program9ind5;
        String po9w1Value, po9w2Value, po9w3Value, po9w4Value, po9w5Value, po9wtotalvalue;
        String program9co11, program9co12, program9co13, program9co14, program9co15, program9co1total;
        String program9co21, program9co22, program9co23, program9co24, program9co25, program9co2total;
        String program9co31, program9co32, program9co33, program9co34, program9co35, program9co3total;
        String program9co41, program9co42, program9co43, program9co44, program9co45, program9co4total;
        String program9co51, program9co52, program9co53, program9co54, program9co55, program9co5total;
//        p10

String program101, program102, program103, program104, program105;
        String program10com1, program10com2, program10com3, program10com4, program10com5;
        String program10ind1, program10ind2, program10ind3, program10ind4, program10ind5;
        String po10w1Value, po10w2Value, po10w3Value, po10w4Value, po10w5Value, po10wtotalvalue;
        String program10co11, program10co12, program10co13, program10co14, program10co15, program10co1total;
        String program10co21, program10co22, program10co23, program10co24, program10co25, program10co2total;
        String program10co31, program10co32, program10co33, program10co34, program10co35, program10co3total;
        String program10co41, program10co42, program10co43, program10co44, program10co45, program10co4total;
        String program10co51, program10co52, program10co53, program10co54, program10co55, program10co5total;

//po11
 
        String program111, program112, program113, program114, program115;
        String program11com1, program11com2, program11com3, program11com4, program11com5;
        String program11ind1, program11ind2, program11ind3, program11ind4, program11ind5;
        String po11w1Value, po11w2Value, po11w3Value, po11w4Value, po11w5Value, po11wtotalvalue;
        String program11co11, program11co12, program11co13, program11co14, program11co15, program11co1total;
        String program11co21, program11co22, program11co23, program11co24, program11co25, program11co2total;
        String program11co31, program11co32, program11co33, program11co34, program11co35, program11co3total;
        String program11co41, program11co42, program11co43, program11co44, program11co45, program11co4total;
        String program11co51, program11co52, program11co53, program11co54, program11co55, program11co5total;

//        po12
String program121, program122, program123, program124, program125;
        String program12com1, program12com2, program12com3, program12com4, program12com5;
        String program12ind1, program12ind2, program12ind3, program12ind4, program12ind5;
        String po12w1Value, po12w2Value, po12w3Value, po12w4Value, po12w5Value, po12wtotalvalue;
        String program12co11, program12co12, program12co13, program12co14, program12co15, program12co1total;
        String program12co21, program12co22, program12co23, program12co24, program12co25, program12co2total;
        String program12co31, program12co32, program12co33, program12co34, program12co35, program12co3total;
        String program12co41, program12co42, program12co43, program12co44, program12co45, program12co4total;
        String program12co51, program12co52, program12co53, program12co54, program12co55, program12co5total;

    String inputtableName;    
        
        // ... (retrieve other fields)
program11 = po11.getText();
program12 = po12.getText();
program13 = po13.getText();
program14 = po14.getText();
program15 = po15.getText();

program1com1 = po1com1.getText();
program1com2 = po1com2.getText();
program1com3 = po1com3.getText();
program1com4 = po1com4.getText();
program1com5 = po1com5.getText();

program1ind1 = po1ind1.getText();
program1ind2 = po1ind2.getText();
program1ind3 = po1ind3.getText();
program1ind4 = po1ind4.getText();
program1ind5 = po1ind5.getText();

po1w1Value = po1w1.getText();
po1w2Value = po1w2.getText();
po1w3Value = po1w3.getText();
po1w4Value = po1w4.getText();
po1w5Value = po1w5.getText();
po1wtotalvalue = po1wtotal.getText();

program1co11 = po1co11.getText();
program1co12 = po1co12.getText();
program1co13 = po1co13.getText();
program1co14 = po1co14.getText();
program1co15 = po1co15.getText();
program1co1total = po1co1total.getText();

program1co21 = po1co21.getText();
program1co22 = po1co22.getText();
program1co23 = po1co23.getText();
program1co24 = po1co24.getText();
program1co25 = po1co25.getText();
program1co2total = po1co2total.getText();

program1co31 = po1co31.getText();
program1co32 = po1co32.getText();
program1co33 = po1co33.getText();
program1co34 = po1co34.getText();
program1co35 = po1co35.getText();
program1co3total = po1co3total.getText();

program1co41 = po1co41.getText();
program1co42 = po1co42.getText();
program1co43 = po1co43.getText();
program1co44 = po1co44.getText();
program1co45 = po1co45.getText();
program1co4total = po1co4total.getText();

program1co51 = po1co51.getText();
program1co52 = po1co52.getText();
program1co53 = po1co53.getText();
program1co54 = po1co54.getText();
program1co55 = po1co55.getText();
program1co5total = po1co5total.getText();

         inputtableName = dbtablename.getText(); 




try{
//                Connection con = ConnectionUtils.conDB(ConnectionHolder.getConnectedDBName());
        Connection con = ConnectionUtils.conDB(ConnectionHolder.getConnectedDBName());

            String connectedDBName = ConnectionHolder.getConnectedDBName();

    
//        pst1 = con.prepareStatement("INSERT INTO  " + tableName + " (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `POMapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//        pst1 = con.prepareStatement("INSERT INTO  " + tableName + " (PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
System.out.println("connectedDBName: " + connectedDBName);
//System.out.println("tableName: " + inputtableName);

 String tableName = inputtableName;
        
        // Modify the SQL statement to create a new table
        DatabaseMetaData metaData = con.getMetaData();
        ResultSet tables = metaData.getTables(null, connectedDBName, tableName, null);
        if (!tables.next()) {
            // Table doesn't exist, create it
            String createTableSQL = "CREATE TABLE " + connectedDBName + "." + tableName + " (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "PO VARCHAR(255), " +
                    "Competency VARCHAR(255), " +
                    "Indicators VARCHAR(255), " +
                    "Weight FLOAT, " +
                    "CO1 INT, " +
                    "CO2 INT, " +
                    "CO3 INT, " +
                    "CO4 INT, " +
                    "CO5 INT, " +
                    "POMapping INT)";

            PreparedStatement createTableStmt = con.prepareStatement(createTableSQL);
            createTableStmt.executeUpdate();
        } else {
            // Table exists, truncate it
            Statement truncateTableStmt = con.createStatement();
            truncateTableStmt.executeUpdate("TRUNCATE TABLE " + connectedDBName + "." + tableName);
        }




                pst1 = con.prepareStatement("INSERT INTO " + connectedDBName + "." + tableName + " " +
                "(PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

      pst1.setString(1, program11);
        pst1.setString(2, program1com1);
        pst1.setString(3, program1ind1);
        pst1.setString(4, po1w1Value);
        pst1.setString(5, program1co11);
        pst1.setString(6, program1co12);
        pst1.setString(7, program1co13);
        pst1.setString(8, program1co14);
        pst1.setString(9, program1co15);
        pst1.setString(10, program1co1total);
pst1.executeUpdate();



// pst2 = con.prepareStatement("INSERT INTO " + tableName + " (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `POMapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//        pst2 = con.prepareStatement("INSERT INTO  " + tableName + " (PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
pst2 = con.prepareStatement("INSERT INTO " + connectedDBName + "." + tableName + " " +
                "(PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               

      pst2.setString(1, program12);
        pst2.setString(2, program1com2);
        pst2.setString(3, program1ind2);
        pst2.setString(4, po1w2Value);
        pst2.setString(5, program1co21);
        pst2.setString(6, program1co22);
        pst2.setString(7, program1co23);
        pst2.setString(8, program1co24);
        pst2.setString(9, program1co25);
        pst2.setString(10, program1co2total);
pst2.executeUpdate();


// pst3 = con.prepareStatement("INSERT INTO " + tableName + "  (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `POMapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//        pst3 = con.prepareStatement("INSERT INTO  " + tableName + " (PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
pst3 = con.prepareStatement("INSERT INTO " + connectedDBName + "." + tableName + " " +
                "(PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               

      pst3.setString(1, program13);
        pst3.setString(2, program1com3);
        pst3.setString(3, program1ind3);
        pst3.setString(4, po1w3Value);
        pst3.setString(5, program1co31);
        pst3.setString(6, program1co32);
        pst3.setString(7, program1co33);
        pst3.setString(8, program1co34);
        pst3.setString(9, program1co35);
        pst3.setString(10, program1co3total);
pst3.executeUpdate();


// pst4 = con.prepareStatement("INSERT INTO " + tableName + "  (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `POMapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//        pst4 = con.prepareStatement("INSERT INTO  " + tableName + " (PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
pst4 = con.prepareStatement("INSERT INTO " + connectedDBName + "." + tableName + " " +
                "(PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               

      pst4.setString(1, program14);
        pst4.setString(2, program1com4);
        pst4.setString(3, program1ind4);
        pst4.setString(4, po1w4Value);
        pst4.setString(5, program1co41);
        pst4.setString(6, program1co42);
        pst4.setString(7, program1co43);
        pst4.setString(8, program1co44);
        pst4.setString(9, program1co45);
        pst4.setString(10, program1co4total);
pst4.executeUpdate();

// pst5 = con.prepareStatement("INSERT INTO " + tableName + " (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `POMapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//        pst5 = con.prepareStatement("INSERT INTO  " + tableName + " (PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
pst5 = con.prepareStatement("INSERT INTO " + connectedDBName + "." + tableName + " " +
                "(PO, Competency, Indicators, Weight, CO1, CO2, CO3, CO4, CO5, POMapping) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               

      pst5.setString(1, program15);
        pst5.setString(2, program1com5);
        pst5.setString(3, program1ind5);
        pst5.setString(4, po1w5Value);
        pst5.setString(5, program1co51);
        pst5.setString(6, program1co52);
        pst5.setString(7, program1co53);
        pst5.setString(8, program1co54);
        pst5.setString(9, program1co55);
        pst5.setString(10, program1co5total);
pst5.executeUpdate();


        con.close();

Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("Text Connection");
alert.setHeaderText("Table Inserted");
alert.setContentText("Added");
 alert.setContentText("Table '" + tableName + "' has been created.");

alert.showAndWait();



}  catch(SQLException ex){
        Logger.getLogger(COPOTableController.class.getName()).log(Level.SEVERE,null,ex);
//            ex.printStackTrace();
        Logger.getLogger(COPOTableController.class.getName()).log(Level.SEVERE, null, ex);


}     
     
        
    }

    @FXML
    private void Delete(ActionEvent event) {
    }

    @FXML
    private void Update(ActionEvent event) {
    }

    @FXML
private void Mapping(ActionEvent event) {
    float AddWeight1 = Float.valueOf(po1w1.getText());
    float AddWeight2 = Float.valueOf(po1w2.getText());
    float AddWeight3 = Float.valueOf(po1w3.getText());
    float AddWeight4 = Float.valueOf(po1w4.getText());
    float AddWeight5 = Float.valueOf(po1w5.getText());

    float TotalWeight = AddWeight1 + AddWeight2 + AddWeight3 + AddWeight4 + AddWeight5;

    int Addco11 = Integer.parseInt(po1co11.getText());
    int Addco12 = Integer.parseInt(po1co12.getText());
    int Addco13 = Integer.parseInt(po1co13.getText());
    int Addco14 = Integer.parseInt(po1co14.getText());
    int Addco15 = Integer.parseInt(po1co15.getText());

    int TotalCo1 = Addco11 + Addco12 + Addco13 + Addco14 + Addco15;

    int Addco21 = Integer.parseInt(po1co21.getText());
    int Addco22 = Integer.parseInt(po1co22.getText());
    int Addco23 = Integer.parseInt(po1co23.getText());
    int Addco24 = Integer.parseInt(po1co24.getText());
    int Addco25 = Integer.parseInt(po1co25.getText());

    int Totalco2 = Addco21 + Addco22 + Addco23 + Addco24 + Addco25;

    int Addco31 = Integer.parseInt(po1co31.getText());
    int Addco32 = Integer.parseInt(po1co32.getText());
    int Addco33 = Integer.parseInt(po1co33.getText());
    int Addco34 = Integer.parseInt(po1co34.getText());
    int Addco35 = Integer.parseInt(po1co35.getText());

    int Totalco3 = Addco31 + Addco32 + Addco33 + Addco34 + Addco35;

    int Addco41 = Integer.parseInt(po1co41.getText());
    int Addco42 = Integer.parseInt(po1co42.getText());
    int Addco43 = Integer.parseInt(po1co43.getText());
    int Addco44 = Integer.parseInt(po1co44.getText());
    int Addco45 = Integer.parseInt(po1co45.getText());

    int Totalco4 = Addco41 + Addco42 + Addco43 + Addco44 + Addco45;

    int Addco51 = Integer.parseInt(po1co51.getText());
    int Addco52 = Integer.parseInt(po1co52.getText());
    int Addco53 = Integer.parseInt(po1co53.getText());
    int Addco54 = Integer.parseInt(po1co54.getText());
    int Addco55 = Integer.parseInt(po1co55.getText());

    int Totalco5 = Addco51 + Addco52 + Addco53 + Addco54 + Addco55;

    po1wtotal.setText(String.valueOf(TotalWeight));
    po1co1total.setText(String.valueOf(TotalCo1));
    po1co2total.setText(String.valueOf(Totalco2));
    po1co3total.setText(String.valueOf(Totalco3));
    po1co4total.setText(String.valueOf(Totalco4));
    po1co5total.setText(String.valueOf(Totalco5));
    



}

    

 Connection con ;
    PreparedStatement pst1;
        PreparedStatement pst2;
    PreparedStatement pst3;
    PreparedStatement pst4;
    PreparedStatement pst5;
PreparedStatement pst10;
    
        

//    int myIndex;
//    int id;
//    public void Connect(){
////         Connection userConnection = ConnectionHolder.getUserConnection();
////        String connectedDBName = ConnectionHolder.getConnectedDBName();
////        Connection userConnection = ConnectionHolder.getUserConnection();
////        String connectedDBName = ConnectionHolder.getConnectedDBName();
//
//        Connection userConnection = ConnectionHolder.getUserConnection();
//        String connectedDBName = ConnectionHolder.getConnectedDBName();
//
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/"+ connectedDBName, "root","");
//            
//            
//        }catch(ClassNotFoundException ex){
//            
//        }
//        catch(SQLException ex){
//        ex.printStackTrace();
//    }
//            
//            
//    }
//    
//    
//    
    
    
//     @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
//        String dbName = "user_database_" + user_username;
        String dbName = "user_" + username;

        
         Connection connection = ConnectionUtils.conDB(dbName);

        if (connection != null) {
            System.out.println("Connected to database: " + dbName);
            // Perform operations on the connected database
            // ...
        } else {
            System.err.println("Failed to connect to database: " + dbName);
        }

//        Connect();
    }    
//    
}