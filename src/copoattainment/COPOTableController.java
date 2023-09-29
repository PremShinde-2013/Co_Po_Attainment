/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package copoattainment;

//import com.sun.istack.internal.logging.Logger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
         

/**
 *
 * @author ASUS
 */
public class COPOTableController implements Initializable {
    @FXML 
    private Label label;
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
    private TextArea com1;
    @FXML
    private TextArea com2;
    @FXML
    private TextArea com3;
    @FXML
    private TextArea com4;
     @FXML
    private TextArea com5;
    @FXML
    private TextArea ind1;
    @FXML
    private TextArea ind2;
    @FXML
    private TextArea ind3;
    @FXML
    private TextArea ind4;
    @FXML
    private TextArea ind5;
  
    
    @FXML
    private TextField w1;
    @FXML
    private TextField w2;
    @FXML
    private TextField w3;
    @FXML
    private TextField w4;
    @FXML
    private TextField w5;
    @FXML
    private TextField wtotal;
     @FXML
    private TextField co11;
     @FXML
    private TextField co12;
     @FXML
    private TextField co13;
     @FXML
    private TextField co14;
     @FXML
    private TextField co15;
     @FXML
    private TextField co21;
     @FXML
    private TextField co22;
     @FXML
    private TextField co23;
     @FXML
    private TextField co24;
     @FXML
    private TextField co25;
     @FXML
    private TextField co31;
     @FXML
    private TextField co32;
     @FXML
    private TextField co33;
     @FXML
    private TextField co34;
     @FXML
    private TextField co35;
     @FXML
    private TextField co41;
     @FXML
    private TextField co42;
     @FXML
    private TextField co43;
     @FXML
    private TextField co44;
     @FXML
    private TextField co45;
     @FXML
    private TextField co51;
      @FXML
    private TextField co52;
       @FXML
    private TextField co53;
        @FXML
    private TextField co54;
         @FXML
    private TextField co55;
          @FXML
    private TextField co1total;
          @FXML
    private TextField co2total;
          @FXML
    private TextField co3total;
          @FXML
    private TextField co4total;
          @FXML
    private TextField co5total;
          
     
     
     
     
     
     
     @FXML
    private Button btnAdd;
    @FXML
    private Button btndelete;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btnmapping;
       
      @FXML
     void Add(ActionEvent event) {

//         String com1,com2,com3,com4,ind1,ind2,ind3,ind4,ind5,w1,w2,w3,w4,w5,co11,
//            co12,co13,co14,co15,co21,co22,co23,co24,co25,co31,co32,co33,co34,co35,
//            co41,co42,co43,co44,co45,co51,co52,co53,co54,co55,co1total,co2total,co3total,
//            co4total,co5total;
  String program11,program12,program13,program14,program15 ,competency1,competency2,competency3,competency4,competency5,indicator1,indicator2,indicator3,indicator4,indicator5,weight1,weight2,weight3,weight4,weight5,course11,
            course12,course13,course14,course15,course21,course22,course23,course24,course25,course31,course32,course33,course34,course35,
            course41,course42,course43,course44,course45,course51,course52,course53,course54,course55,course1total,course2total,course3total,
            course4total,course5total;
//String competency ,indicators,weight, co1,co2,co3,co4,co5, co1tot,co2tot,co3tot,co4tot,co5tot;
program11 = po11.getText();
program12 = po12.getText();
program13 = po13.getText();
program14 = po14.getText();
program15 = po15.getText();

competency1 = com1.getText();
competency2 = com2.getText();
competency3= com3.getText();
competency4 = com4.getText();
competency5 = com5.getText();
         
indicator1 = ind1.getText();
indicator2 = ind2.getText();
indicator3 = ind3.getText();
indicator4 = ind4.getText();
indicator5 = ind5.getText();

weight1 = w1.getText();
weight2 = w2.getText();
weight3 = w3.getText();
weight4= w4.getText();
weight5= w5.getText();

course11 = co11.getText();
course12= co12.getText();
course13= co13.getText();
course14= co14.getText();
course15= co15.getText();

course21= co21.getText();
course22= co22.getText();
course23= co23.getText();
course24= co24.getText();
course25= co25.getText();

course31= co31.getText();
course32= co32.getText();
course33= co33.getText();
course34= co34.getText();
course35= co35.getText();

course41= co41.getText();
course42= co42.getText();
course43= co43.getText();
course44= co44.getText();
course45= co45.getText();

course51= co51.getText();
course52= co52.getText();
course53= co53.getText();
course54= co54.getText();
course55= co55.getText();

course1total = co1total.getText();
course2total = co2total.getText();
course3total = co3total.getText();
course4total = co4total.getText();
course5total = co5total.getText();



         
         
         
         
         
                           
try{
        pst1 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

       pst1.setString(1,program11);
    pst1.setString(2,competency1);
    pst1.setString(3,indicator1);
    pst1.setString(4, weight1);
    pst1.setString(5, course11);
    pst1.setString(6,course21 );
    pst1.setString(7, course31);
    pst1.setString(8, course41);
    pst1.setString(9, course51);
    pst1.setString(10, course1total);
pst1.executeUpdate();

        pst2 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

   pst2.setString(1,program12);
    pst2.setString(2,competency2);
    pst2.setString(3,indicator2);
    pst2.setString(4, weight2);
    pst2.setString(5, course12);
    pst2.setString(6,course22 );
    pst2.setString(7, course32);
    pst2.setString(8, course42);
    pst2.setString(9, course52);
    pst2.setString(10, course2total);
pst2.executeUpdate();

pst3 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

   pst3.setString(1,program13);
    pst3.setString(2,competency3);
    pst3.setString(3,indicator3);
    pst3.setString(4, weight3);
    pst3.setString(5, course13);
    pst3.setString(6,course23 );
    pst3.setString(7, course33);
    pst3.setString(8, course43);
    pst3.setString(9, course53);
    pst3.setString(10, course3total);
pst3.executeUpdate();

  pst4 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

   pst4.setString(1,program14);
    pst4.setString(2,competency4);
    pst4.setString(3,indicator4);
    pst4.setString(4, weight4);
    pst4.setString(5, course14);
    pst4.setString(6,course24 );
    pst4.setString(7, course34);
    pst4.setString(8, course44);
    pst4.setString(9, course54);
    pst4.setString(10, course4total);
pst4.executeUpdate();

 pst5 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

   pst5.setString(1,program15);
    pst5.setString(2,competency5);
    pst5.setString(3,indicator5);
    pst5.setString(4, weight5);
    pst5.setString(5, course15);
    pst5.setString(6,course25 );
    pst5.setString(7, course35);
    pst5.setString(8, course45);
    pst5.setString(9, course55);
    pst5.setString(10, course5total);
pst5.executeUpdate();


Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("Text Connection");
alert.setHeaderText("Table Inserted");
alert.setContentText("Added");
alert.showAndWait();



}  catch(SQLException ex){
        Logger.getLogger(COPOTableController.class.getName()).log(Level.SEVERE,null,ex);
//            ex.printStackTrace();

}     
         
         
    }

    @FXML
     void Delete(ActionEvent event) {
        // Code to handle the "Delete" button click
    }

    @FXML
     void Update(ActionEvent event) {
        // Code to handle the "Update" button click
    }

    @FXML
     void Mapping(ActionEvent event) {
        // Code to handle the "Get Mapping Level" button click
         float AddWeight1 = Float.valueOf(w1.getText());
             
       float AddWeight2 = Float.valueOf(w2.getText());
        float AddWeight3 = Float.valueOf(w3.getText());
        float AddWeight4 = Float.valueOf(w4.getText());
        float AddWeight5= Float.valueOf(w5.getText());

        float TotalWeight = AddWeight1+AddWeight2+AddWeight3+AddWeight4+AddWeight5;
     
        int Addco11 = Integer.parseInt(co11.getText());
         int Addco12 = Integer.parseInt(co12.getText());
        int Addco13 = Integer.parseInt(co13.getText());
        int Addco14 = Integer.parseInt(co14.getText());
        int Addco15= Integer.parseInt(co15.getText());
        
        int TotalCo1 = Addco11+Addco12+Addco13+Addco14+Addco15;
        
        int Addco21 = Integer.parseInt(co21.getText());
         int Addco22 = Integer.parseInt(co22.getText());
        int Addco23 = Integer.parseInt(co23.getText());
        int Addco24 = Integer.parseInt(co24.getText());
        int Addco25= Integer.parseInt(co25.getText());
        
        int Totalco2 = Addco21+Addco22+Addco23+Addco24+Addco25;
        
         int Addco31 = Integer.parseInt(co31.getText());
         int Addco32 = Integer.parseInt(co32.getText());
        int Addco33 = Integer.parseInt(co33.getText());
        int Addco34 = Integer.parseInt(co34.getText());
        int Addco35= Integer.parseInt(co35.getText());
        
        int Totalco3 = Addco31+Addco32+Addco33+Addco34+Addco35;
        
        
        
 int Addco41 = Integer.parseInt(co41.getText());
         int Addco42 = Integer.parseInt(co42.getText());
        int Addco43 = Integer.parseInt(co43.getText());
        int Addco44 = Integer.parseInt(co44.getText());
        int Addco45= Integer.parseInt(co45.getText());
        
        int Totalco4 = Addco41+Addco42+Addco43+Addco44+Addco45;
        
         int Addco51 = Integer.parseInt(co51.getText());
         int Addco52 = Integer.parseInt(co52.getText());
        int Addco53 = Integer.parseInt(co53.getText());
        int Addco54 = Integer.parseInt(co54.getText());
        int Addco55= Integer.parseInt(co55.getText());
        
        int Totalco5 = Addco51+Addco52+Addco53+Addco54+Addco55;
        
           wtotal.setText(String.valueOf(TotalWeight));
        co1total.setText(String.valueOf(TotalCo1));
                co2total.setText(String.valueOf(Totalco2));
                co3total.setText(String.valueOf(Totalco3));
                                co4total.setText(String.valueOf(Totalco4));
                                co5total.setText(String.valueOf(Totalco5));


        
                
    }

    
    Connection con ;
    PreparedStatement pst1;
        PreparedStatement pst2;
    PreparedStatement pst3;
    PreparedStatement pst4;
    PreparedStatement pst5;

    int myIndex;
    int id;
    public void Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/copoattainment", "root","");
            
            
        }catch(ClassNotFoundException ex){
            
        }
        catch(SQLException ex){
        ex.printStackTrace();
    }
            
            
    }
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connect();
    }    
    
}