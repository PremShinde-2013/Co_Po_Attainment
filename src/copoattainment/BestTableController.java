/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package copoattainment;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    private TextArea po2com1;
    @FXML
    private TextArea po2com2;
    @FXML
    private TextArea po2com3;
    @FXML
    private TextArea po2com4;
    @FXML
    private TextArea po2ind1;
    @FXML
    private TextArea po2ind2;
    @FXML
    private TextArea po2ind3;
    @FXML
    private TextArea po2ind4;
    @FXML
    private TextArea po2ind5;
    @FXML
    private TextField po2w1;
    @FXML
    private TextField po2w2;
    @FXML
    private TextField po2w3;
    @FXML
    private TextField po2w4;
    @FXML
    private TextField po2w5;
    @FXML
    private TextField po2co11;
    @FXML
    private TextField po2co12;
    @FXML
    private TextField po2co13;
    @FXML
    private TextField po2co14;
    @FXML
    private TextField po2co15;
    @FXML
    private TextField po2co21;
    @FXML
    private TextField po2co22;
    @FXML
    private TextField po2co23;
    @FXML
    private TextField po2co24;
    @FXML
    private TextField po2co25;
    @FXML
    private TextField po2co31;
    @FXML
    private TextField po2co33;
    @FXML
    private TextField po2co32;
    @FXML
    private TextField po2co34;
    @FXML
    private TextField po2co35;
    @FXML
    private TextField po2co41;
    @FXML
    private TextField po2co42;
    @FXML
    private TextField po2co43;
    @FXML
    private TextField po2co44;
    @FXML
    private TextField po2co45;
    @FXML
    private TextField po2co51;
    @FXML
    private TextField po2co52;
    @FXML
    private TextField po2co53;
    @FXML
    private TextField po2co54;
    @FXML
    private TextField po2co55;
    @FXML
    private TextField po2wtotal;
    @FXML
    private TextField po2co1total;
    @FXML
    private TextField po2co2total;
    @FXML
    private TextField po2co3total;
    @FXML
    private TextField po2co4total;
    @FXML
    private TextField po2co5total;
    @FXML
    private Button btnAdd1;
    @FXML
    private Button btndelete1;
    @FXML
    private Button btnupdate1;
    @FXML
    private Button btnmapping1;
    @FXML
    private TextArea po21;
    @FXML
    private TextArea po22;
    @FXML
    private TextArea po23;
    @FXML
    private TextArea po24;
    @FXML
    private TextArea po25;
    @FXML
    private TextArea po2com5;
    @FXML
    private TextArea po3com1;
    @FXML
    private TextArea po3com2;
    @FXML
    private TextArea po3com3;
    @FXML
    private TextArea po3com4;
    @FXML
    private TextArea po3ind1;
    @FXML
    private TextArea po3ind2;
    @FXML
    private TextArea po3ind3;
    @FXML
    private TextArea po3ind4;
    @FXML
    private TextArea po3ind5;
    @FXML
    private TextField po3w1;
    @FXML
    private TextField po3w2;
    @FXML
    private TextField po3w3;
    @FXML
    private TextField po3w4;
    @FXML
    private TextField po3w5;
    @FXML
    private TextField po3co11;
    @FXML
    private TextField po3co12;
    @FXML
    private TextField po3co13;
    @FXML
    private TextField po3co14;
    @FXML
    private TextField po3co15;
    @FXML
    private TextField po3co21;
    @FXML
    private TextField po3co22;
    @FXML
    private TextField po3co23;
    @FXML
    private TextField po3co24;
    @FXML
    private TextField po3co25;
    @FXML
    private TextField po3co31;
    @FXML
    private TextField po3co33;
    @FXML
    private TextField po3co32;
    @FXML
    private TextField po3co34;
    @FXML
    private TextField po3co35;
    @FXML
    private TextField po3co41;
    @FXML
    private TextField po3co42;
    @FXML
    private TextField po3co43;
    @FXML
    private TextField po3co44;
    @FXML
    private TextField po3co45;
    @FXML
    private TextField po3co51;
    @FXML
    private TextField po3co52;
    @FXML
    private TextField po3co53;
    @FXML
    private TextField po3co54;
    @FXML
    private TextField po3co55;
    @FXML
    private TextField po3wtotal;
    @FXML
    private TextField po3co1total;
    @FXML
    private TextField po3co2total;
    @FXML
    private TextField po3co3total;
    @FXML
    private TextField po3co4total;
    @FXML
    private TextField po3co5total;
    @FXML
    private Button btnAdd11;
    @FXML
    private Button btndelete11;
    @FXML
    private Button btnupdate11;
    @FXML
    private Button btnmapping11;
    @FXML
    private TextArea po31;
    @FXML
    private TextArea po32;
    @FXML
    private TextArea po33;
    @FXML
    private TextArea po34;
    @FXML
    private TextArea po35;
    @FXML
    private TextArea po3com5;
    @FXML
    private TextArea po4com1;
    @FXML
    private TextArea po4com2;
    @FXML
    private TextArea po4com3;
    @FXML
    private TextArea po4com4;
    @FXML
    private TextArea po4ind1;
    @FXML
    private TextArea po4ind2;
    @FXML
    private TextArea po4ind3;
    @FXML
    private TextArea po4ind4;
    @FXML
    private TextArea po4ind5;
    @FXML
    private TextField po4w1;
    @FXML
    private TextField po4w2;
    @FXML
    private TextField po4w3;
    @FXML
    private TextField po4w4;
    @FXML
    private TextField po4w5;
    @FXML
    private TextField po4co11;
    @FXML
    private TextField po4co12;
    @FXML
    private TextField po4co13;
    @FXML
    private TextField po4co14;
    @FXML
    private TextField po4co15;
    @FXML
    private TextField po4co21;
    @FXML
    private TextField po4co22;
    @FXML
    private TextField po4co23;
    @FXML
    private TextField po4co24;
    @FXML
    private TextField po4co25;
    @FXML
    private TextField po4co31;
    @FXML
    private TextField po4co33;
    @FXML
    private TextField po4co32;
    @FXML
    private TextField po4co34;
    @FXML
    private TextField po4co35;
    @FXML
    private TextField po4co41;
    @FXML
    private TextField po4co42;
    @FXML
    private TextField po4co43;
    @FXML
    private TextField po4co44;
    @FXML
    private TextField po4co45;
    @FXML
    private TextField po4co51;
    @FXML
    private TextField po4co52;
    @FXML
    private TextField po4co53;
    @FXML
    private TextField po4co54;
    @FXML
    private TextField po4co55;
    @FXML
    private TextField po4wtotal;
    @FXML
    private TextField po4co1total;
    @FXML
    private TextField po4co2total;
    @FXML
    private TextField po4co3total;
    @FXML
    private TextField po4co4total;
    @FXML
    private TextField po4co5total;
    @FXML
    private Button btnAdd112;
    @FXML
    private Button btndelete112;
    @FXML
    private Button btnupdate112;
    @FXML
    private Button btnmapping112;
    @FXML
    private TextArea po41;
    @FXML
    private TextArea po42;
    @FXML
    private TextArea po43;
    @FXML
    private TextArea po44;
    @FXML
    private TextArea po45;
    @FXML
    private TextArea po4com5;
    @FXML
    private TextArea po5com1;
    @FXML
    private TextArea po5com2;
    @FXML
    private TextArea po5com3;
    @FXML
    private TextArea po5com4;
    @FXML
    private TextArea po5ind1;
    @FXML
    private TextArea po5ind2;
    @FXML
    private TextArea po5ind3;
    @FXML
    private TextArea po5ind4;
    @FXML
    private TextArea po5ind5;
    @FXML
    private TextField po5w1;
    @FXML
    private TextField po5w2;
    @FXML
    private TextField po5w3;
    @FXML
    private TextField po5w4;
    @FXML
    private TextField po5w5;
    @FXML
    private TextField po5co11;
    @FXML
    private TextField po5co12;
    @FXML
    private TextField po5co13;
    @FXML
    private TextField po5co14;
    @FXML
    private TextField po5co15;
    @FXML
    private TextField po5co21;
    @FXML
    private TextField po5co22;
    @FXML
    private TextField po5co23;
    @FXML
    private TextField po5co24;
    @FXML
    private TextField po5co25;
    @FXML
    private TextField po5co31;
    @FXML
    private TextField po5co33;
    @FXML
    private TextField po5co32;
    @FXML
    private TextField po5co34;
    @FXML
    private TextField po5co35;
    @FXML
    private TextField po5co41;
    @FXML
    private TextField po5co42;
    @FXML
    private TextField po5co43;
    @FXML
    private TextField po5co44;
    @FXML
    private TextField po5co45;
    @FXML
    private TextField po5co51;
    @FXML
    private TextField po5co52;
    @FXML
    private TextField po5co53;
    @FXML
    private TextField po5co54;
    @FXML
    private TextField po5co55;
    @FXML
    private TextField po5wtotal;
    @FXML
    private TextField po5co1total;
    @FXML
    private TextField po5co2total;
    @FXML
    private TextField po5co3total;
    @FXML
    private TextField po5co4total;
    @FXML
    private TextField po5co5total;
    @FXML
    private Button btnAdd111;
    @FXML
    private Button btndelete111;
    @FXML
    private Button btnupdate111;
    @FXML
    private Button btnmapping111;
    @FXML
    private TextArea po51;
    @FXML
    private TextArea po52;
    @FXML
    private TextArea po53;
    @FXML
    private TextArea po54;
    @FXML
    private TextArea po55;
    @FXML
    private TextArea po5com5;
    @FXML
    private TextArea po6com1;
    @FXML
    private TextArea po6com2;
    @FXML
    private TextArea po6com3;
    @FXML
    private TextArea po6com4;
    @FXML
    private TextArea po6ind1;
    @FXML
    private TextArea po6ind2;
    @FXML
    private TextArea po6ind3;
    @FXML
    private TextArea po6ind4;
    @FXML
    private TextArea po6ind5;
    @FXML
    private TextField po6w1;
    @FXML
    private TextField po6w2;
    @FXML
    private TextField po6w3;
    @FXML
    private TextField po6w4;
    @FXML
    private TextField po6w5;
    @FXML
    private TextField po6co11;
    @FXML
    private TextField po6co12;
    @FXML
    private TextField po6co13;
    @FXML
    private TextField po6co14;
    @FXML
    private TextField po6co15;
    @FXML
    private TextField po6co21;
    @FXML
    private TextField po6co22;
    @FXML
    private TextField po6co23;
    @FXML
    private TextField po6co24;
    @FXML
    private TextField po6co25;
    @FXML
    private TextField po6co31;
    @FXML
    private TextField po6co33;
    @FXML
    private TextField po6co32;
    @FXML
    private TextField po6co34;
    @FXML
    private TextField po6co35;
    @FXML
    private TextField po6co41;
    @FXML
    private TextField po6co42;
    @FXML
    private TextField po6co43;
    @FXML
    private TextField po6co44;
    @FXML
    private TextField po6co45;
    @FXML
    private TextField po6co51;
    @FXML
    private TextField po6co52;
    @FXML
    private TextField po6co53;
    @FXML
    private TextField po6co54;
    @FXML
    private TextField po6co55;
    @FXML
    private TextField po6wtotal;
    @FXML
    private TextField po6co1total;
    @FXML
    private TextField po6co2total;
    @FXML
    private TextField po6co3total;
    @FXML
    private TextField po6co4total;
    @FXML
    private TextField po6co5total;
    @FXML
    private Button btnAdd1122;
    @FXML
    private Button btndelete11223;
    @FXML
    private Button btnupdate115;
    @FXML
    private Button btnmapping118;
    @FXML
    private TextArea po61;
    @FXML
    private TextArea po62;
    @FXML
    private TextArea po63;
    @FXML
    private TextArea po64;
    @FXML
    private TextArea po65;
    @FXML
    private TextArea po6com5;
    @FXML
    private TextArea po7com1;
    @FXML
    private TextArea po7com2;
    @FXML
    private TextArea po7com3;
    @FXML
    private TextArea po7com4;
    @FXML
    private TextArea po7ind1;
    @FXML
    private TextArea po7ind2;
    @FXML
    private TextArea po7ind3;
    @FXML
    private TextArea po7ind4;
    @FXML
    private TextArea po7ind5;
    @FXML
    private TextField po7w1;
    @FXML
    private TextField po7w2;
    @FXML
    private TextField po7w3;
    @FXML
    private TextField po7w4;
    @FXML
    private TextField po7w5;
    @FXML
    private TextField po7co11;
    @FXML
    private TextField po7co12;
    @FXML
    private TextField po7co13;
    @FXML
    private TextField po7co14;
    @FXML
    private TextField po7co15;
    @FXML
    private TextField po7co21;
    @FXML
    private TextField po7co22;
    @FXML
    private TextField po7co23;
    @FXML
    private TextField po7co24;
    @FXML
    private TextField po7co25;
    @FXML
    private TextField po7co31;
    @FXML
    private TextField po7co33;
    @FXML
    private TextField po7co32;
    @FXML
    private TextField po7co34;
    @FXML
    private TextField po7co35;
    @FXML
    private TextField po7co41;
    @FXML
    private TextField po7co42;
    @FXML
    private TextField po7co43;
    @FXML
    private TextField po7co44;
    @FXML
    private TextField po7co45;
    @FXML
    private TextField po7co51;
    @FXML
    private TextField po7co52;
    @FXML
    private TextField po7co53;
    @FXML
    private TextField po7co54;
    @FXML
    private TextField po7co55;
    @FXML
    private TextField po7wtotal;
    @FXML
    private TextField po7co1total;
    @FXML
    private TextField po7co2total;
    @FXML
    private TextField po7co3total;
    @FXML
    private TextField po7co4total;
    @FXML
    private TextField po7co5total;
    @FXML
    private Button btnAdd181;
    @FXML
    private Button btndelete911;
    @FXML
    private Button btnupdate181;
    @FXML
    private Button btnmapping171;
    @FXML
    private TextArea po71;
    @FXML
    private TextArea po72;
    @FXML
    private TextArea po73;
    @FXML
    private TextArea po74;
    @FXML
    private TextArea po75;
    @FXML
    private TextArea po7com5;
    @FXML
    private TextArea po8com1;
    @FXML
    private TextArea po8com2;
    @FXML
    private TextArea po8com3;
    @FXML
    private TextArea po8com4;
    @FXML
    private TextArea po8ind1;
    @FXML
    private TextArea po8ind2;
    @FXML
    private TextArea po8ind3;
    @FXML
    private TextArea po8ind4;
    @FXML
    private TextArea po8ind5;
    @FXML
    private TextField po8w1;
    @FXML
    private TextField po8w2;
    @FXML
    private TextField po8w3;
    @FXML
    private TextField po8w4;
    @FXML
    private TextField po8w5;
    @FXML
    private TextField po8co11;
    @FXML
    private TextField po8co12;
    @FXML
    private TextField po8co13;
    @FXML
    private TextField po8co14;
    @FXML
    private TextField po8co15;
    @FXML
    private TextField po8co21;
    @FXML
    private TextField po8co22;
    @FXML
    private TextField po8co23;
    @FXML
    private TextField po8co24;
    @FXML
    private TextField po8co25;
    @FXML
    private TextField po8co31;
    @FXML
    private TextField po8co33;
    @FXML
    private TextField po8co32;
    @FXML
    private TextField po8co34;
    @FXML
    private TextField po8co35;
    @FXML
    private TextField po8co41;
    @FXML
    private TextField po8co42;
    @FXML
    private TextField po8co43;
    @FXML
    private TextField po8co44;
    @FXML
    private TextField po8co45;
    @FXML
    private TextField po8co51;
    @FXML
    private TextField po8co52;
    @FXML
    private TextField po8co53;
    @FXML
    private TextField po8co54;
    @FXML
    private TextField po8co55;
    @FXML
    private TextField po8wtotal;
    @FXML
    private TextField po8co1total;
    @FXML
    private TextField po8co2total;
    @FXML
    private TextField po8co3total;
    @FXML
    private TextField po8co4total;
    @FXML
    private TextField po8co5total;
    @FXML
    private Button btnAdd151;
    @FXML
    private Button btndelete161;
    @FXML
    private Button btnupdate191;
    @FXML
    private Button btnmapping181;
    @FXML
    private TextArea po81;
    @FXML
    private TextArea po82;
    @FXML
    private TextArea po83;
    @FXML
    private TextArea po84;
    @FXML
    private TextArea po85;
    @FXML
    private TextArea po8com5;
    @FXML
    private TextArea po9com1;
    @FXML
    private TextArea po9com2;
    @FXML
    private TextArea po9com3;
    @FXML
    private TextArea po9com4;
    @FXML
    private TextArea po9ind1;
    @FXML
    private TextArea po9ind2;
    @FXML
    private TextArea po9ind3;
    @FXML
    private TextArea po9ind4;
    @FXML
    private TextArea po9ind5;
    @FXML
    private TextField po9w1;
    @FXML
    private TextField po9w2;
    @FXML
    private TextField po9w3;
    @FXML
    private TextField po9w4;
    @FXML
    private TextField po9w5;
    @FXML
    private TextField po9co11;
    @FXML
    private TextField po9co12;
    @FXML
    private TextField po9co13;
    @FXML
    private TextField po9co14;
    @FXML
    private TextField po9co15;
    @FXML
    private TextField po9co21;
    @FXML
    private TextField po9co22;
    @FXML
    private TextField po9co23;
    @FXML
    private TextField po9co24;
    @FXML
    private TextField po9co25;
    @FXML
    private TextField po9co31;
    @FXML
    private TextField po9co33;
    @FXML
    private TextField po9co32;
    @FXML
    private TextField po9co34;
    @FXML
    private TextField po9co35;
    @FXML
    private TextField po9co41;
    @FXML
    private TextField po9co42;
    @FXML
    private TextField po9co43;
    @FXML
    private TextField po9co44;
    @FXML
    private TextField po9co45;
    @FXML
    private TextField po9co51;
    @FXML
    private TextField po9co52;
    @FXML
    private TextField po9co53;
    @FXML
    private TextField po9co54;
    @FXML
    private TextField po9co55;
    @FXML
    private TextField po9wtotal;
    @FXML
    private TextField po9co1total;
    @FXML
    private TextField po9co2total;
    @FXML
    private TextField po9co3total;
    @FXML
    private TextField po9co4total;
    @FXML
    private TextField po9co5total;
    @FXML
    private Button btnAdd711;
    @FXML
    private Button btndelete181;
    @FXML
    private Button btnupdate171;
    @FXML
    private Button btnmapping1121;
    @FXML
    private TextArea po91;
    @FXML
    private TextArea po92;
    @FXML
    private TextArea po93;
    @FXML
    private TextArea po94;
    @FXML
    private TextArea po95;
    @FXML
    private TextArea po9com5;
    @FXML
    private TextArea po10com1;
    @FXML
    private TextArea po10com2;
    @FXML
    private TextArea po10com3;
    @FXML
    private TextArea po10com4;
    @FXML
    private TextArea po10ind1;
    @FXML
    private TextArea po10ind2;
    @FXML
    private TextArea po10ind3;
    @FXML
    private TextArea po10ind4;
    @FXML
    private TextArea po10ind5;
    @FXML
    private TextField po10w1;
    @FXML
    private TextField po10w2;
    @FXML
    private TextField po10w3;
    @FXML
    private TextField po10w4;
    @FXML
    private TextField po10w5;
    @FXML
    private TextField po10co11;
    @FXML
    private TextField po10co12;
    @FXML
    private TextField po10co13;
    @FXML
    private TextField po10co14;
    @FXML
    private TextField po10co15;
    @FXML
    private TextField po10co21;
    @FXML
    private TextField po10co22;
    @FXML
    private TextField po10co23;
    @FXML
    private TextField po10co24;
    @FXML
    private TextField po10co25;
    @FXML
    private TextField po10co31;
    @FXML
    private TextField po10co33;
    @FXML
    private TextField po10co32;
    @FXML
    private TextField po10co34;
    @FXML
    private TextField po10co35;
    @FXML
    private TextField po10co41;
    @FXML
    private TextField po10co42;
    @FXML
    private TextField po10co43;
    @FXML
    private TextField po10co44;
    @FXML
    private TextField po10co45;
    @FXML
    private TextField po10co51;
    @FXML
    private TextField po10co52;
    @FXML
    private TextField po10co53;
    @FXML
    private TextField po10co54;
    @FXML
    private TextField po10co55;
    @FXML
    private TextField po10wtotal;
    @FXML
    private TextField po10co1total;
    @FXML
    private TextField po10co2total;
    @FXML
    private TextField po10co3total;
    @FXML
    private TextField po10co4total;
    @FXML
    private TextField po10co5total;
    @FXML
    private Button btnAdd1561;
    @FXML
    private Button btndelete113;
    @FXML
    private Button btnupdate121;
    @FXML
    private Button btnmapping131;
    @FXML
    private TextArea po101;
    @FXML
    private TextArea po102;
    @FXML
    private TextArea po103;
    @FXML
    private TextArea po104;
    @FXML
    private TextArea po105;
    @FXML
    private TextArea po10com5;
    @FXML
    private TextArea po11com1;
    @FXML
    private TextArea po11com2;
    @FXML
    private TextArea po11com3;
    @FXML
    private TextArea po11com4;
    @FXML
    private TextArea po11ind1;
    @FXML
    private TextArea po11ind2;
    @FXML
    private TextArea po11ind3;
    @FXML
    private TextArea po11ind4;
    @FXML
    private TextArea po11ind5;
    @FXML
    private TextField po11w1;
    @FXML
    private TextField po11w2;
    @FXML
    private TextField po11w3;
    @FXML
    private TextField po11w4;
    @FXML
    private TextField po11w5;
    @FXML
    private TextField po11co11;
    @FXML
    private TextField po11co12;
    @FXML
    private TextField po11co13;
    @FXML
    private TextField po11co14;
    @FXML
    private TextField po11co15;
    @FXML
    private TextField po11co21;
    @FXML
    private TextField po11co22;
    @FXML
    private TextField po11co23;
    @FXML
    private TextField po11co24;
    @FXML
    private TextField po11co25;
    @FXML
    private TextField po11co31;
    @FXML
    private TextField po11co33;
    @FXML
    private TextField po11co32;
    @FXML
    private TextField po11co34;
    @FXML
    private TextField po11co35;
    @FXML
    private TextField po11co41;
    @FXML
    private TextField po11co42;
    @FXML
    private TextField po11co43;
    @FXML
    private TextField po11co44;
    @FXML
    private TextField po11co45;
    @FXML
    private TextField po11co51;
    @FXML
    private TextField po11co52;
    @FXML
    private TextField po11co53;
    @FXML
    private TextField po11co54;
    @FXML
    private TextField po11co55;
    @FXML
    private TextField po11wtotal;
    @FXML
    private TextField po11co1total;
    @FXML
    private TextField po11co2total;
    @FXML
    private TextField po11co3total;
    @FXML
    private TextField po11co4total;
    @FXML
    private TextField po11co5total;
    @FXML
    private Button btnAdd1891;
    @FXML
    private Button btndelete191;
    @FXML
    private Button btnupdate1741;
    @FXML
    private Button btnmapping611;
    @FXML
    private TextArea po111;
    @FXML
    private TextArea po112;
    @FXML
    private TextArea po113;
    @FXML
    private TextArea po114;
    @FXML
    private TextArea po115;
    @FXML
    private TextArea po11com5;
    @FXML
    private TextArea po12com1;
    @FXML
    private TextArea po12com2;
    @FXML
    private TextArea po12com3;
    @FXML
    private TextArea po12com4;
    @FXML
    private TextArea po12ind1;
    @FXML
    private TextArea po12ind2;
    @FXML
    private TextArea po12ind3;
    @FXML
    private TextArea po12ind4;
    @FXML
    private TextArea po12ind5;
    @FXML
    private TextField po12w1;
    @FXML
    private TextField po12w2;
    @FXML
    private TextField po12w3;
    @FXML
    private TextField po12w4;
    @FXML
    private TextField po12w5;
    @FXML
    private TextField po12co11;
    @FXML
    private TextField po12co12;
    @FXML
    private TextField po12co13;
    @FXML
    private TextField po12co14;
    @FXML
    private TextField po12co15;
    @FXML
    private TextField po12co21;
    @FXML
    private TextField po12co22;
    @FXML
    private TextField po12co23;
    @FXML
    private TextField po12co24;
    @FXML
    private TextField po12co25;
    @FXML
    private TextField po12co31;
    @FXML
    private TextField po12co33;
    @FXML
    private TextField po12co32;
    @FXML
    private TextField po12co34;
    @FXML
    private TextField po12co35;
    @FXML
    private TextField po12co41;
    @FXML
    private TextField po12co42;
    @FXML
    private TextField po12co43;
    @FXML
    private TextField po12co44;
    @FXML
    private TextField po12co45;
    @FXML
    private TextField po12co51;
    @FXML
    private TextField po12co52;
    @FXML
    private TextField po12co53;
    @FXML
    private TextField po12co54;
    @FXML
    private TextField po12co55;
    @FXML
    private TextField po12wtotal;
    @FXML
    private TextField po12co1total;
    @FXML
    private TextField po12co2total;
    @FXML
    private TextField po12co3total;
    @FXML
    private TextField po12co4total;
    @FXML
    private TextField po12co5total;
    @FXML
    private Button btnAdd811;
    @FXML
    private Button btndelete1991;
    @FXML
    private Button btnupdate119;
    @FXML
    private Button btnmapping161;
    @FXML
    private TextArea po121;
    @FXML
    private TextArea po122;
    @FXML
    private TextArea po123;
    @FXML
    private TextArea po124;
    @FXML
    private TextArea po125;
    @FXML
    private TextArea po12com5;

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

//  for program 2
program21 = po21.getText();
program22 = po22.getText();
program23 = po23.getText();
program24 = po24.getText();
program25 = po25.getText();

program2com1 = po2com1.getText();
program2com2 = po2com2.getText();
program2com3 = po2com3.getText();
program2com4 = po2com4.getText();
program2com5 = po2com5.getText();

program2ind1 = po2ind1.getText();
program2ind2 = po2ind2.getText();
program2ind3 = po2ind3.getText();
program2ind4 = po2ind4.getText();
program2ind5 = po2ind5.getText();

po2w1Value = po2w1.getText();
po2w2Value = po2w2.getText();
po2w3Value = po2w3.getText();
po2w4Value = po2w4.getText();
po2w5Value = po2w5.getText();
po2wtotalvalue = po2wtotal.getText();

program2co11 = po2co11.getText();
program2co12 = po2co12.getText();
program2co13 = po2co13.getText();
program2co14 = po2co14.getText();
program2co15 = po2co15.getText();
program2co1total = po2co1total.getText();

program2co21 = po2co21.getText();
program2co22 = po2co22.getText();
program2co23 = po2co23.getText();
program2co24 = po2co24.getText();
program2co25 = po2co25.getText();
program2co2total = po2co2total.getText();

program2co31 = po2co31.getText();
program2co32 = po2co32.getText();
program2co33 = po2co33.getText();
program2co34 = po2co34.getText();
program2co35 = po2co35.getText();
program2co3total = po2co3total.getText();

program2co41 = po2co41.getText();
program2co42 = po2co42.getText();
program2co43 = po2co43.getText();
program2co44 = po2co44.getText();
program2co45 = po2co45.getText();
program2co4total = po2co4total.getText();

program2co51 = po2co51.getText();
program2co52 = po2co52.getText();
program2co53 = po2co53.getText();
program2co54 = po2co54.getText();
program2co55 = po2co55.getText();
program2co5total = po2co5total.getText();


//program 3 
 program31 = po31.getText();
    program32 = po32.getText();
    program33 = po33.getText();
    program34 = po34.getText();
    program35 = po35.getText();

    program3com1 = po3com1.getText();
    program3com2 = po3com2.getText();
    program3com3 = po3com3.getText();
    program3com4 = po3com4.getText();
    program3com5 = po3com5.getText();

    program3ind1 = po3ind1.getText();
    program3ind2 = po3ind2.getText();
    program3ind3 = po3ind3.getText();
    program3ind4 = po3ind4.getText();
    program3ind5 = po3ind5.getText();

    po3w1Value = po3w1.getText();
    po3w2Value = po3w2.getText();
    po3w3Value = po3w3.getText();
    po3w4Value = po3w4.getText();
    po3w5Value = po3w5.getText();
    po3wtotalvalue = po3wtotal.getText();

    program3co11 = po3co11.getText();
    program3co12 = po3co12.getText();
    program3co13 = po3co13.getText();
    program3co14 = po3co14.getText();
    program3co15 = po3co15.getText();
    program3co1total = po3co1total.getText();

    program3co21 = po3co21.getText();
    program3co22 = po3co22.getText();
    program3co23 = po3co23.getText();
    program3co24 = po3co24.getText();
    program3co25 = po3co25.getText();
    program3co2total = po3co2total.getText();

    program3co31 = po3co31.getText();
    program3co32 = po3co32.getText();
    program3co33 = po3co33.getText();
    program3co34 = po3co34.getText();
    program3co35 = po3co35.getText();
    program3co3total = po3co3total.getText();

    program3co41 = po3co41.getText();
    program3co42 = po3co42.getText();
    program3co43 = po3co43.getText();
    program3co44 = po3co44.getText();
    program3co45 = po3co45.getText();
    program3co4total = po3co4total.getText();

    program3co51 = po3co51.getText();
    program3co52 = po3co52.getText();
    program3co53 = po3co53.getText();
    program3co54 = po3co54.getText();
    program3co55 = po3co55.getText();
    program3co5total = po3co5total.getText();
    
//    for program 4

program41 = po41.getText();
    program42 = po42.getText();
    program43 = po43.getText();
    program44 = po44.getText();
    program45 = po45.getText();

    program4com1 = po4com1.getText();
    program4com2 = po4com2.getText();
    program4com3 = po4com3.getText();
    program4com4 = po4com4.getText();
    program4com5 = po4com5.getText();

    program4ind1 = po4ind1.getText();
    program4ind2 = po4ind2.getText();
    program4ind3 = po4ind3.getText();
    program4ind4 = po4ind4.getText();
    program4ind5 = po4ind5.getText();

    po4w1Value = po4w1.getText();
    po4w2Value = po4w2.getText();
    po4w3Value = po4w3.getText();
    po4w4Value = po4w4.getText();
    po4w5Value = po4w5.getText();
    po4wtotalvalue = po4wtotal.getText();

    program4co11 = po4co11.getText();
    program4co12 = po4co12.getText();
    program4co13 = po4co13.getText();
    program4co14 = po4co14.getText();
    program4co15 = po4co15.getText();
    program4co1total = po4co1total.getText();

    program4co21 = po4co21.getText();
    program4co22 = po4co22.getText();
    program4co23 = po4co23.getText();
    program4co24 = po4co24.getText();
    program4co25 = po4co25.getText();
    program4co2total = po4co2total.getText();

    program4co31 = po4co31.getText();
    program4co32 = po4co32.getText();
    program4co33 = po4co33.getText();
    program4co34 = po4co34.getText();
    program4co35 = po4co35.getText();
    program4co3total = po4co3total.getText();

    program4co41 = po4co41.getText();
    program4co42 = po4co42.getText();
    program4co43 = po4co43.getText();
    program4co44 = po4co44.getText();
    program4co45 = po4co45.getText();
    program4co4total = po4co4total.getText();

    program4co51 = po4co51.getText();
    program4co52 = po4co52.getText();
    program4co53 = po4co53.getText();
    program4co54 = po4co54.getText();
    program4co55 = po4co55.getText();
    program4co5total = po4co5total.getText();
    
//    for P5

program51 = po51.getText();
    program52 = po52.getText();
    program53 = po53.getText();
    program54 = po54.getText();
    program55 = po55.getText();

    program5com1 = po5com1.getText();
    program5com2 = po5com2.getText();
    program5com3 = po5com3.getText();
    program5com4 = po5com4.getText();
    program5com5 = po5com5.getText();

    program5ind1 = po5ind1.getText();
    program5ind2 = po5ind2.getText();
    program5ind3 = po5ind3.getText();
    program5ind4 = po5ind4.getText();
    program5ind5 = po5ind5.getText();

    po5w1Value = po5w1.getText();
    po5w2Value = po5w2.getText();
    po5w3Value = po5w3.getText();
    po5w4Value = po5w4.getText();
    po5w5Value = po5w5.getText();
    po5wtotalvalue = po5wtotal.getText();

    program5co11 = po5co11.getText();
    program5co12 = po5co12.getText();
    program5co13 = po5co13.getText();
    program5co14 = po5co14.getText();
    program5co15 = po5co15.getText();
    program5co1total = po5co1total.getText();

    program5co21 = po5co21.getText();
    program5co22 = po5co22.getText();
    program5co23 = po5co23.getText();
    program5co24 = po5co24.getText();
    program5co25 = po5co25.getText();
    program5co2total = po5co2total.getText();

    program5co31 = po5co31.getText();
    program5co32 = po5co32.getText();
    program5co33 = po5co33.getText();
    program5co34 = po5co34.getText();
    program5co35 = po5co35.getText();
    program5co3total = po5co3total.getText();

    program5co41 = po5co41.getText();
    program5co42 = po5co42.getText();
    program5co43 = po5co43.getText();
    program5co44 = po5co44.getText();
    program5co45 = po5co45.getText();
    program5co4total = po5co4total.getText();

    program5co51 = po5co51.getText();
    program5co52 = po5co52.getText();
    program5co53 = po5co53.getText();
    program5co54 = po5co54.getText();
    program5co55 = po5co55.getText();
    program5co5total = po5co5total.getText();

//for p6

program61 = po61.getText();
program62 = po62.getText();
program63 = po63.getText();
program64 = po64.getText();
program65 = po65.getText();

program6com1 = po6com1.getText();
program6com2 = po6com2.getText();
program6com3 = po6com3.getText();
program6com4 = po6com4.getText();
program6com5 = po6com5.getText();

program6ind1 = po6ind1.getText();
program6ind2 = po6ind2.getText();
program6ind3 = po6ind3.getText();
program6ind4 = po6ind4.getText();
program6ind5 = po6ind5.getText();

po6w1Value = po6w1.getText();
po6w2Value = po6w2.getText();
po6w3Value = po6w3.getText();
po6w4Value = po6w4.getText();
po6w5Value = po6w5.getText();
po6wtotalvalue = po6wtotal.getText();

program6co11 = po6co11.getText();
program6co12 = po6co12.getText();
program6co13 = po6co13.getText();
program6co14 = po6co14.getText();
program6co15 = po6co15.getText();
program6co1total = po6co1total.getText();

program6co21 = po6co21.getText();
program6co22 = po6co22.getText();
program6co23 = po6co23.getText();
program6co24 = po6co24.getText();
program6co25 = po6co25.getText();
program6co2total = po6co2total.getText();

program6co31 = po6co31.getText();
program6co32 = po6co32.getText();
program6co33 = po6co33.getText();
program6co34 = po6co34.getText();
program6co35 = po6co35.getText();
program6co3total = po6co3total.getText();

program6co41 = po6co41.getText();
program6co42 = po6co42.getText();
program6co43 = po6co43.getText();
program6co44 = po6co44.getText();
program6co45 = po6co45.getText();
program6co4total = po6co4total.getText();

program6co51 = po6co51.getText();
program6co52 = po6co52.getText();
program6co53 = po6co53.getText();
program6co54 = po6co54.getText();
program6co55 = po6co55.getText();
program6co5total = po6co5total.getText();

//   for po7

program71 = po71.getText();
program72 = po72.getText();
program73 = po73.getText();
program74 = po74.getText();
program75 = po75.getText();

program7com1 = po7com1.getText();
program7com2 = po7com2.getText();
program7com3 = po7com3.getText();
program7com4 = po7com4.getText();
program7com5 = po7com5.getText();

program7ind1 = po7ind1.getText();
program7ind2 = po7ind2.getText();
program7ind3 = po7ind3.getText();
program7ind4 = po7ind4.getText();
program7ind5 = po7ind5.getText();

po7w1Value = po7w1.getText();
po7w2Value = po7w2.getText();
po7w3Value = po7w3.getText();
po7w4Value = po7w4.getText();
po7w5Value = po7w5.getText();
po7wtotalvalue = po7wtotal.getText();

program7co11 = po7co11.getText();
program7co12 = po7co12.getText();
program7co13 = po7co13.getText();
program7co14 = po7co14.getText();
program7co15 = po7co15.getText();
program7co1total = po7co1total.getText();

program7co21 = po7co21.getText();
program7co22 = po7co22.getText();
program7co23 = po7co23.getText();
program7co24 = po7co24.getText();
program7co25 = po7co25.getText();
program7co2total = po7co2total.getText();

program7co31 = po7co31.getText();
program7co32 = po7co32.getText();
program7co33 = po7co33.getText();
program7co34 = po7co34.getText();
program7co35 = po7co35.getText();
program7co3total = po7co3total.getText();

program7co41 = po7co41.getText();
program7co42 = po7co42.getText();
program7co43 = po7co43.getText();
program7co44 = po7co44.getText();
program7co45 = po7co45.getText();
program7co4total = po7co4total.getText();

program7co51 = po7co51.getText();
program7co52 = po7co52.getText();
program7co53 = po7co53.getText();
program7co54 = po7co54.getText();
program7co55 = po7co55.getText();
program7co5total = po7co5total.getText();

//for po8

program81 = po81.getText();
program82 = po82.getText();
program83 = po83.getText();
program84 = po84.getText();
program85 = po85.getText();

program8com1 = po8com1.getText();
program8com2 = po8com2.getText();
program8com3 = po8com3.getText();
program8com4 = po8com4.getText();
program8com5 = po8com5.getText();

program8ind1 = po8ind1.getText();
program8ind2 = po8ind2.getText();
program8ind3 = po8ind3.getText();
program8ind4 = po8ind4.getText();
program8ind5 = po8ind5.getText();

po8w1Value = po8w1.getText();
po8w2Value = po8w2.getText();
po8w3Value = po8w3.getText();
po8w4Value = po8w4.getText();
po8w5Value = po8w5.getText();
po8wtotalvalue = po8wtotal.getText();

program8co11 = po8co11.getText();
program8co12 = po8co12.getText();
program8co13 = po8co13.getText();
program8co14 = po8co14.getText();
program8co15 = po8co15.getText();
program8co1total = po8co1total.getText();

program8co21 = po8co21.getText();
program8co22 = po8co22.getText();
program8co23 = po8co23.getText();
program8co24 = po8co24.getText();
program8co25 = po8co25.getText();
program8co2total = po8co2total.getText();

program8co31 = po8co31.getText();
program8co32 = po8co32.getText();
program8co33 = po8co33.getText();
program8co34 = po8co34.getText();
program8co35 = po8co35.getText();
program8co3total = po8co3total.getText();

program8co41 = po8co41.getText();
program8co42 = po8co42.getText();
program8co43 = po8co43.getText();
program8co44 = po8co44.getText();
program8co45 = po8co45.getText();
program8co4total = po8co4total.getText();

program8co51 = po8co51.getText();
program8co52 = po8co52.getText();
program8co53 = po8co53.getText();
program8co54 = po8co54.getText();
program8co55 = po8co55.getText();
program8co5total = po8co5total.getText();

//for po9
program91 = po91.getText();
        program92 = po92.getText();
        program93 = po93.getText();
        program94 = po94.getText();
        program95 = po95.getText();

        program9com1 = po9com1.getText();
        program9com2 = po9com2.getText();
        program9com3 = po9com3.getText();
        program9com4 = po9com4.getText();
        program9com5 = po9com5.getText();

        program9ind1 = po9ind1.getText();
        program9ind2 = po9ind2.getText();
        program9ind3 = po9ind3.getText();
        program9ind4 = po9ind4.getText();
        program9ind5 = po9ind5.getText();

        po9w1Value = po9w1.getText();
        po9w2Value = po9w2.getText();
        po9w3Value = po9w3.getText();
        po9w4Value = po9w4.getText();
        po9w5Value = po9w5.getText();
        po9wtotalvalue = po9wtotal.getText();

        program9co11 = po9co11.getText();
        program9co12 = po9co12.getText();
        program9co13 = po9co13.getText();
        program9co14 = po9co14.getText();
        program9co15 = po9co15.getText();
        program9co1total = po9co1total.getText();

        program9co21 = po9co21.getText();
        program9co22 = po9co22.getText();
        program9co23 = po9co23.getText();
        program9co24 = po9co24.getText();
        program9co25 = po9co25.getText();
        program9co2total = po9co2total.getText();

        program9co31 = po9co31.getText();
        program9co32 = po9co32.getText();
        program9co33 = po9co33.getText();
        program9co34 = po9co34.getText();
        program9co35 = po9co35.getText();
        program9co3total = po9co3total.getText();

        program9co41 = po9co41.getText();
        program9co42 = po9co42.getText();
        program9co43 = po9co43.getText();
        program9co44 = po9co44.getText();
        program9co45 = po9co45.getText();
        program9co4total = po9co4total.getText();

        program9co51 = po9co51.getText();
        program9co52 = po9co52.getText();
        program9co53 = po9co53.getText();
        program9co54 = po9co54.getText();
        program9co55 = po9co55.getText();
        program9co5total = po9co5total.getText();
        
//        p10
program101 = po101.getText();
        program102 = po102.getText();
        program103 = po103.getText();
        program104 = po104.getText();
        program105 = po105.getText();

        program10com1 = po10com1.getText();
        program10com2 = po10com2.getText();
        program10com3 = po10com3.getText();
        program10com4 = po10com4.getText();
        program10com5 = po10com5.getText();

        program10ind1 = po10ind1.getText();
        program10ind2 = po10ind2.getText();
        program10ind3 = po10ind3.getText();
        program10ind4 = po10ind4.getText();
        program10ind5 = po10ind5.getText();

        po10w1Value = po10w1.getText();
        po10w2Value = po10w2.getText();
        po10w3Value = po10w3.getText();
        po10w4Value = po10w4.getText();
        po10w5Value = po10w5.getText();
        po10wtotalvalue = po10wtotal.getText();

        program10co11 = po10co11.getText();
        program10co12 = po10co12.getText();
        program10co13 = po10co13.getText();
        program10co14 = po10co14.getText();
        program10co15 = po10co15.getText();
        program10co1total = po10co1total.getText();

        program10co21 = po10co21.getText();
        program10co22 = po10co22.getText();
        program10co23 = po10co23.getText();
        program10co24 = po10co24.getText();
        program10co25 = po10co25.getText();
        program10co2total = po10co2total.getText();

        program10co31 = po10co31.getText();
        program10co32 = po10co32.getText();
        program10co33 = po10co33.getText();
        program10co34 = po10co34.getText();
        program10co35 = po10co35.getText();
        program10co3total = po10co3total.getText();

        program10co41 = po10co41.getText();
        program10co42 = po10co42.getText();
        program10co43 = po10co43.getText();
        program10co44 = po10co44.getText();
        program10co45 = po10co45.getText();
        program10co4total = po10co4total.getText();

        program10co51 = po10co51.getText();
        program10co52 = po10co52.getText();
        program10co53 = po10co53.getText();
        program10co54 = po10co54.getText();
        program10co55 = po10co55.getText();
        program10co5total = po10co5total.getText();
//        po11
program111 = po111.getText();
        program112 = po112.getText();
        program113 = po113.getText();
        program114 = po114.getText();
        program115 = po115.getText();

        program11com1 = po11com1.getText();
        program11com2 = po11com2.getText();
        program11com3 = po11com3.getText();
        program11com4 = po11com4.getText();
        program11com5 = po11com5.getText();

        program11ind1 = po11ind1.getText();
        program11ind2 = po11ind2.getText();
        program11ind3 = po11ind3.getText();
        program11ind4 = po11ind4.getText();
        program11ind5 = po11ind5.getText();

        po11w1Value = po11w1.getText();
        po11w2Value = po11w2.getText();
        po11w3Value = po11w3.getText();
        po11w4Value = po11w4.getText();
        po11w5Value = po11w5.getText();
        po11wtotalvalue = po11wtotal.getText();

        program11co11 = po11co11.getText();
        program11co12 = po11co12.getText();
        program11co13 = po11co13.getText();
        program11co14 = po11co14.getText();
        program11co15 = po11co15.getText();
        program11co1total = po11co1total.getText();

        program11co21 = po11co21.getText();
        program11co22 = po11co22.getText();
        program11co23 = po11co23.getText();
        program11co24 = po11co24.getText();
        program11co25 = po11co25.getText();
        program11co2total = po11co2total.getText();

        program11co31 = po11co31.getText();
        program11co32 = po11co32.getText();
        program11co33 = po11co33.getText();
        program11co34 = po11co34.getText();
        program11co35 = po11co35.getText();
        program11co3total = po11co3total.getText();

        program11co41 = po11co41.getText();
        program11co42 = po11co42.getText();
        program11co43 = po11co43.getText();
        program11co44 = po11co44.getText();
        program11co45 = po11co45.getText();
        program11co4total = po11co4total.getText();

        program11co51 = po11co51.getText();
        program11co52 = po11co52.getText();
        program11co53 = po11co53.getText();
        program11co54 = po11co54.getText();
        program11co55 = po11co55.getText();
        program11co5total = po11co5total.getText();

// for po12
program121 = po121.getText();
        program122 = po122.getText();
        program123 = po123.getText();
        program124 = po124.getText();
        program125 = po125.getText();

        program12com1 = po12com1.getText();
        program12com2 = po12com2.getText();
        program12com3 = po12com3.getText();
        program12com4 = po12com4.getText();
        program12com5 = po12com5.getText();

        program12ind1 = po12ind1.getText();
        program12ind2 = po12ind2.getText();
        program12ind3 = po12ind3.getText();
        program12ind4 = po12ind4.getText();
        program12ind5 = po12ind5.getText();

        po12w1Value = po12w1.getText();
        po12w2Value = po12w2.getText();
        po12w3Value = po12w3.getText();
        po12w4Value = po12w4.getText();
        po12w5Value = po12w5.getText();
        po12wtotalvalue = po12wtotal.getText();

        program12co11 = po12co11.getText();
        program12co12 = po12co12.getText();
        program12co13 = po12co13.getText();
        program12co14 = po12co14.getText();
        program12co15 = po12co15.getText();
        program12co1total = po12co1total.getText();

        program12co21 = po12co21.getText();
        program12co22 = po12co22.getText();
        program12co23 = po12co23.getText();
        program12co24 = po12co24.getText();
        program12co25 = po12co25.getText();
        program12co2total = po12co2total.getText();

        program12co31 = po12co31.getText();
        program12co32 = po12co32.getText();
        program12co33 = po12co33.getText();
        program12co34 = po12co34.getText();
        program12co35 = po12co35.getText();
        program12co3total = po12co3total.getText();

        program12co41 = po12co41.getText();
        program12co42 = po12co42.getText();
        program12co43 = po12co43.getText();
        program12co44 = po12co44.getText();
        program12co45 = po12co45.getText();
        program12co4total = po12co4total.getText();

        program12co51 = po12co51.getText();
        program12co52 = po12co52.getText();
        program12co53 = po12co53.getText();
        program12co54 = po12co54.getText();
        program12co55 = po12co55.getText();
        program12co5total = po12co5total.getText();



try{
        pst1 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

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



 pst2 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

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


 pst3 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

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


 pst4 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

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

 pst5 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

               

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


pst6 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst6.setString(1, program21);
    pst6.setString(2, program2com1);
    pst6.setString(3, program2ind1);
    pst6.setString(4, po2w1Value);
    pst6.setString(5, program2co11);
    pst6.setString(6, program2co12);
    pst6.setString(7, program2co13);
    pst6.setString(8, program2co14);
    pst6.setString(9, program2co15);
    pst6.setString(10, program2co1total);
    pst6.executeUpdate();

    pst7 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst7.setString(1, program22);
    pst7.setString(2, program2com2);
    pst7.setString(3, program2ind2);
    pst7.setString(4, po2w2Value);
    pst7.setString(5, program2co21);
    pst7.setString(6, program2co22);
    pst7.setString(7, program2co23);
    pst7.setString(8, program2co24);
    pst7.setString(9, program2co25);
    pst7.setString(10, program2co2total);
    pst7.executeUpdate();

    pst8 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst8.setString(1, program23);
    pst8.setString(2, program2com3);
    pst8.setString(3, program2ind3);
    pst8.setString(4, po2w3Value);
    pst8.setString(5, program2co31);
    pst8.setString(6, program2co32);
    pst8.setString(7, program2co33);
    pst8.setString(8, program2co34);
    pst8.setString(9, program2co35);
    pst8.setString(10, program2co3total);
    pst8.executeUpdate();

    pst9 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst9.setString(1, program24);
    pst9.setString(2, program2com4);
    pst9.setString(3, program2ind4);
    pst9.setString(4, po2w4Value);
    pst9.setString(5, program2co41);
    pst9.setString(6, program2co42);
    pst9.setString(7, program2co43);
    pst9.setString(8, program2co44);
    pst9.setString(9, program2co45);
    pst9.setString(10, program2co4total);
    pst9.executeUpdate();

    pst10 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst10.setString(1, program25);
    pst10.setString(2, program2com5);
    pst10.setString(3, program2ind5);
    pst10.setString(4, po2w5Value);
    pst10.setString(5, program2co51);
    pst10.setString(6, program2co52);
    pst10.setString(7, program2co53);
    pst10.setString(8, program2co54);
    pst10.setString(9, program2co55);
    pst10.setString(10, program2co5total);
    pst10.executeUpdate();
    
      pst11 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst11.setString(1, program31);
        pst11.setString(2, program3com1);
        pst11.setString(3, program3ind1);
        pst11.setString(4, po3w1Value);
        pst11.setString(5, program3co11);
        pst11.setString(6, program3co12);
        pst11.setString(7, program3co13);
        pst11.setString(8, program3co14);
        pst11.setString(9, program3co15);
        pst11.setString(10, program3co1total);
        pst11.executeUpdate();
         pst12 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst12.setString(1, program32);
    pst12.setString(2, program3com2);
    pst12.setString(3, program3ind2);
    pst12.setString(4, po3w2Value);
    pst12.setString(5, program3co21);
    pst12.setString(6, program3co22);
    pst12.setString(7, program3co23);
    pst12.setString(8, program3co24);
    pst12.setString(9, program3co25);
    pst12.setString(10, program3co2total);
    pst12.executeUpdate();

    pst13 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst13.setString(1, program33);
    pst13.setString(2, program3com3);
    pst13.setString(3, program3ind3);
    pst13.setString(4, po3w3Value);
    pst13.setString(5, program3co31);
    pst13.setString(6, program3co32);
    pst13.setString(7, program3co33);
    pst13.setString(8, program3co34);
    pst13.setString(9, program3co35);
    pst13.setString(10, program3co3total);
    pst13.executeUpdate();

    pst14 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst14.setString(1, program34);
    pst14.setString(2, program3com4);
    pst14.setString(3, program3ind4);
    pst14.setString(4, po3w4Value);
    pst14.setString(5, program3co41);
    pst14.setString(6, program3co42);
    pst14.setString(7, program3co43);
    pst14.setString(8, program3co44);
    pst14.setString(9, program3co45);
    pst14.setString(10, program3co4total);
    pst14.executeUpdate();

    pst15 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    pst15.setString(1, program35);
    pst15.setString(2, program3com5);
    pst15.setString(3, program3ind5);
    pst15.setString(4, po3w5Value);
    pst15.setString(5, program3co51);
    pst15.setString(6, program3co52);
    pst15.setString(7, program3co53);
    pst15.setString(8, program3co54);
    pst15.setString(9, program3co55);
    pst15.setString(10, program3co5total);
    pst15.executeUpdate();
    
    pst16 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst16.setString(1, program41);
pst16.setString(2, program4com1);
pst16.setString(3, program4ind1);
pst16.setString(4, po4w1Value);
pst16.setString(5, program4co11);
pst16.setString(6, program4co12);
pst16.setString(7, program4co13);
pst16.setString(8, program4co14);
pst16.setString(9, program4co15);
pst16.setString(10, program4co1total);
pst16.executeUpdate();

pst17 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst17.setString(1, program42);
pst17.setString(2, program4com2);
pst17.setString(3, program4ind2);
pst17.setString(4, po4w2Value);
pst17.setString(5, program4co21);
pst17.setString(6, program4co22);
pst17.setString(7, program4co23);
pst17.setString(8, program4co24);
pst17.setString(9, program4co25);
pst17.setString(10, program4co2total);
pst17.executeUpdate();

pst18 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst18.setString(1, program43);
pst18.setString(2, program4com3);
pst18.setString(3, program4ind3);
pst18.setString(4, po4w3Value);
pst18.setString(5, program4co31);
pst18.setString(6, program4co32);
pst18.setString(7, program4co33);
pst18.setString(8, program4co34);
pst18.setString(9, program4co35);
pst18.setString(10, program4co3total);
pst18.executeUpdate();

pst19 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst19.setString(1, program44);
pst19.setString(2, program4com4);
pst19.setString(3, program4ind4);
pst19.setString(4, po4w4Value);
pst19.setString(5, program4co41);
pst19.setString(6, program4co42);
pst19.setString(7, program4co43);
pst19.setString(8, program4co44);
pst19.setString(9, program4co45);
pst19.setString(10, program4co4total);
pst19.executeUpdate();

pst20 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst20.setString(1, program45);
pst20.setString(2, program4com5);
pst20.setString(3, program4ind5);
pst20.setString(4, po4w5Value);
pst20.setString(5, program4co51);
pst20.setString(6, program4co52);
pst20.setString(7, program4co53);
pst20.setString(8, program4co54);
pst20.setString(9, program4co55);
pst20.setString(10, program4co5total);
pst20.executeUpdate();

pst21 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst21.setString(1, program51);
pst21.setString(2, program5com1);
pst21.setString(3, program5ind1);
pst21.setString(4, po5w1Value);
pst21.setString(5, program5co11);
pst21.setString(6, program5co12);
pst21.setString(7, program5co13);
pst21.setString(8, program5co14);
pst21.setString(9, program5co15);
pst21.setString(10, program5co1total);
pst21.executeUpdate();

pst22 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst22.setString(1, program52);
pst22.setString(2, program5com2);
pst22.setString(3, program5ind2);
pst22.setString(4, po5w2Value);
pst22.setString(5, program5co21);
pst22.setString(6, program5co22);
pst22.setString(7, program5co23);
pst22.setString(8, program5co24);
pst22.setString(9, program5co25);
pst22.setString(10, program5co2total);
pst22.executeUpdate();

pst23 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst23.setString(1, program53);
pst23.setString(2, program5com3);
pst23.setString(3, program5ind3);
pst23.setString(4, po5w3Value);
pst23.setString(5, program5co31);
pst23.setString(6, program5co32);
pst23.setString(7, program5co33);
pst23.setString(8, program5co34);
pst23.setString(9, program5co35);
pst23.setString(10, program5co3total);
pst23.executeUpdate();

pst24 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst24.setString(1, program54);
pst24.setString(2, program5com4);
pst24.setString(3, program5ind4);
pst24.setString(4, po5w4Value);
pst24.setString(5, program5co41);
pst24.setString(6, program5co42);
pst24.setString(7, program5co43);
pst24.setString(8, program5co44);
pst24.setString(9, program5co45);
pst24.setString(10, program5co4total);
pst24.executeUpdate();

pst25 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst25.setString(1, program55);
pst25.setString(2, program5com5);
pst25.setString(3, program5ind5);
pst25.setString(4, po5w5Value);
pst25.setString(5, program5co51);
pst25.setString(6, program5co52);
pst25.setString(7, program5co53);
pst25.setString(8, program5co54);
pst25.setString(9, program5co55);
pst25.setString(10, program5co5total);
pst25.executeUpdate();
pst26 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst26.setString(1, program61);
pst26.setString(2, program6com1);
pst26.setString(3, program6ind1);
pst26.setString(4, po6w1Value);
pst26.setString(5, program6co11);
pst26.setString(6, program6co12);
pst26.setString(7, program6co13);
pst26.setString(8, program6co14);
pst26.setString(9, program6co15);
pst26.setString(10, program6co1total);
pst26.executeUpdate();

pst27 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst27.setString(1, program62);
pst27.setString(2, program6com2);
pst27.setString(3, program6ind2);
pst27.setString(4, po6w2Value);
pst27.setString(5, program6co21);
pst27.setString(6, program6co22);
pst27.setString(7, program6co23);
pst27.setString(8, program6co24);
pst27.setString(9, program6co25);
pst27.setString(10, program6co2total);
pst27.executeUpdate();

pst28 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst28.setString(1, program63);
pst28.setString(2, program6com3);
pst28.setString(3, program6ind3);
pst28.setString(4, po6w3Value);
pst28.setString(5, program6co31);
pst28.setString(6, program6co32);
pst28.setString(7, program6co33);
pst28.setString(8, program6co34);
pst28.setString(9, program6co35);
pst28.setString(10, program6co3total);
pst28.executeUpdate();

pst29 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst29.setString(1, program64);
pst29.setString(2, program6com4);
pst29.setString(3, program6ind4);
pst29.setString(4, po6w4Value);
pst29.setString(5, program6co41);
pst29.setString(6, program6co42);
pst29.setString(7, program6co43);
pst29.setString(8, program6co44);
pst29.setString(9, program6co45);
pst29.setString(10, program6co4total);
pst29.executeUpdate();

pst30 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst30.setString(1, program65);
pst30.setString(2, program6com5);
pst30.setString(3, program6ind5);
pst30.setString(4, po6w5Value);
pst30.setString(5, program6co51);
pst30.setString(6, program6co52);
pst30.setString(7, program6co53);
pst30.setString(8, program6co54);
pst30.setString(9, program6co55);
pst30.setString(10, program6co5total);
pst30.executeUpdate();
pst31.setString(1, program71);
pst31.setString(2, program7com1);
pst31.setString(3, program7ind1);
pst31.setString(4, po7w1Value);
pst31.setString(5, program7co11);
pst31.setString(6, program7co12);
pst31.setString(7, program7co13);
pst31.setString(8, program7co14);
pst31.setString(9, program7co15);
pst31.setString(10, program7co1total);
pst31.executeUpdate();

pst32.setString(1, program72);
pst32.setString(2, program7com2);
pst32.setString(3, program7ind2);
pst32.setString(4, po7w2Value);
pst32.setString(5, program7co21);
pst32.setString(6, program7co22);
pst32.setString(7, program7co23);
pst32.setString(8, program7co24);
pst32.setString(9, program7co25);
pst32.setString(10, program7co2total);
pst32.executeUpdate();

pst33.setString(1, program73);
pst33.setString(2, program7com3);
pst33.setString(3, program7ind3);
pst33.setString(4, po7w3Value);
pst33.setString(5, program7co31);
pst33.setString(6, program7co32);
pst33.setString(7, program7co33);
pst33.setString(8, program7co34);
pst33.setString(9, program7co35);
pst33.setString(10, program7co3total);
pst33.executeUpdate();

pst34.setString(1, program74);
pst34.setString(2, program7com4);
pst34.setString(3, program7ind4);
pst34.setString(4, po7w4Value);
pst34.setString(5, program7co41);
pst34.setString(6, program7co42);
pst34.setString(7, program7co43);
pst34.setString(8, program7co44);
pst34.setString(9, program7co45);
pst34.setString(10, program7co4total);
pst34.executeUpdate();

pst35.setString(1, program75);
pst35.setString(2, program7com5);
pst35.setString(3, program7ind5);
pst35.setString(4, po7w5Value);
pst35.setString(5, program7co51);
pst35.setString(6, program7co52);
pst35.setString(7, program7co53);
pst35.setString(8, program7co54);
pst35.setString(9, program7co55);
pst35.setString(10, program7co5total);
pst35.executeUpdate();


pst36 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst36.setString(1, program81);
pst36.setString(2, program8com1);
pst36.setString(3, program8ind1);
pst36.setString(4, po8w1Value);
pst36.setString(5, program8co11);
pst36.setString(6, program8co12);
pst36.setString(7, program8co13);
pst36.setString(8, program8co14);
pst36.setString(9, program8co15);
pst36.setString(10, program8co1total);
pst36.executeUpdate();

pst37 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst37.setString(1, program82);
pst37.setString(2, program8com2);
pst37.setString(3, program8ind2);
pst37.setString(4, po8w2Value);
pst37.setString(5, program8co21);
pst37.setString(6, program8co22);
pst37.setString(7, program8co23);
pst37.setString(8, program8co24);
pst37.setString(9, program8co25);
pst37.setString(10, program8co2total);
pst37.executeUpdate();

pst38 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst38.setString(1, program83);
pst38.setString(2, program8com3);
pst38.setString(3, program8ind3);
pst38.setString(4, po8w3Value);
pst38.setString(5, program8co31);
pst38.setString(6, program8co32);
pst38.setString(7, program8co33);
pst38.setString(8, program8co34);
pst38.setString(9, program8co35);
pst38.setString(10, program8co3total);
pst38.executeUpdate();

pst39 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst39.setString(1, program84);
pst39.setString(2, program8com4);
pst39.setString(3, program8ind4);
pst39.setString(4, po8w4Value);
pst39.setString(5, program8co41);
pst39.setString(6, program8co42);
pst39.setString(7, program8co43);
pst39.setString(8, program8co44);
pst39.setString(9, program8co45);
pst39.setString(10, program8co4total);
pst39.executeUpdate();

pst40 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst40.setString(1, program85);
pst40.setString(2, program8com5);
pst40.setString(3, program8ind5);
pst40.setString(4, po8w5Value);
pst40.setString(5, program8co51);
pst40.setString(6, program8co52);
pst40.setString(7, program8co53);
pst40.setString(8, program8co54);
pst40.setString(9, program8co55);
pst40.setString(10, program8co5total);
pst40.executeUpdate();

pst41 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst41.setString(1, program91);
        pst41.setString(2, program9com1);
        pst41.setString(3, program9ind1);
        pst41.setString(4, po9w1Value);
        pst41.setString(5, program9co11);
        pst41.setString(6, program9co12);
        pst41.setString(7, program9co13);
        pst41.setString(8, program9co14);
        pst41.setString(9, program9co15);
        pst41.setString(10, program9co1total);
        pst41.executeUpdate();

        pst42 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst42.setString(1, program92);
        pst42.setString(2, program9com2);
        pst42.setString(3, program9ind2);
        pst42.setString(4, po9w2Value);
        pst42.setString(5, program9co21);
        pst42.setString(6, program9co22);
        pst42.setString(7, program9co23);
        pst42.setString(8, program9co24);
        pst42.setString(9, program9co25);
        pst42.setString(10, program9co2total);
        pst42.executeUpdate();

        pst43 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst43.setString(1, program93);
        pst43.setString(2, program9com3);
        pst43.setString(3, program9ind3);
        pst43.setString(4, po9w3Value);
        pst43.setString(5, program9co31);
        pst43.setString(6, program9co32);
        pst43.setString(7, program9co33);
        pst43.setString(8, program9co34);
        pst43.setString(9, program9co35);
        pst43.setString(10, program9co3total);
        pst43.executeUpdate();

        pst44 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst44.setString(1, program94);
        pst44.setString(2, program9com4);
        pst44.setString(3, program9ind4);
        pst44.setString(4, po9w4Value);
        pst44.setString(5, program9co41);
        pst44.setString(6, program9co42);
        pst44.setString(7, program9co43);
        pst44.setString(8, program9co44);
        pst44.setString(9, program9co45);
        pst44.setString(10, program9co4total);
        pst44.executeUpdate();

        pst45 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst45.setString(1, program95);
        pst45.setString(2, program9com5);
        pst45.setString(3, program9ind5);
        pst45.setString(4, po9w5Value);
        pst45.setString(5, program9co51);
        pst45.setString(6, program9co52);
        pst45.setString(7, program9co53);
        pst45.setString(8, program9co54);
        pst45.setString(9, program9co55);
        pst45.setString(10, program9co5total);
        pst45.executeUpdate();
        
         pst46 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst46.setString(1, program101);
        pst46.setString(2, program10com1);
        pst46.setString(3, program10ind1);
        pst46.setString(4, po10w1Value);
        pst46.setString(5, program10co11);
        pst46.setString(6, program10co12);
        pst46.setString(7, program10co13);
        pst46.setString(8, program10co14);
        pst46.setString(9, program10co15);
        pst46.setString(10, program10co1total);
        pst46.executeUpdate();

        pst47 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst47.setString(1, program102);
        pst47.setString(2, program10com2);
        pst47.setString(3, program10ind2);
        pst47.setString(4, po10w2Value);
        pst47.setString(5, program10co21);
        pst47.setString(6, program10co22);
        pst47.setString(7, program10co23);
        pst47.setString(8, program10co24);
        pst47.setString(9, program10co25);
        pst47.setString(10, program10co2total);
        pst47.executeUpdate();

        pst48 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst48.setString(1, program103);
        pst48.setString(2, program10com3);
        pst48.setString(3, program10ind3);
        pst48.setString(4, po10w3Value);
        pst48.setString(5, program10co31);
        pst48.setString(6, program10co32);
        pst48.setString(7, program10co33);
        pst48.setString(8, program10co34);
        pst48.setString(9, program10co35);
        pst48.setString(10, program10co3total);
        pst48.executeUpdate();

        pst49 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst49.setString(1, program104);
        pst49.setString(2, program10com4);
        pst49.setString(3, program10ind4);
        pst49.setString(4, po10w4Value);
        pst49.setString(5, program10co41);
        pst49.setString(6, program10co42);
        pst49.setString(7, program10co43);
        pst49.setString(8, program10co44);
        pst49.setString(9, program10co45);
        pst49.setString(10, program10co4total);
        pst49.executeUpdate();

        pst50 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst50.setString(1, program105);
        pst50.setString(2, program10com5);
        pst50.setString(3, program10ind5);
        pst50.setString(4, po10w5Value);
        pst50.setString(5, program10co51);
        pst50.setString(6, program10co52);
        pst50.setString(7, program10co53);
        pst50.setString(8, program10co54);
        pst50.setString(9, program10co55);
        pst50.setString(10, program10co5total);
        pst50.executeUpdate();
pst51 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst51.setString(1, program111);
        pst51.setString(2, program11com1);
        pst51.setString(3, program11ind1);
        pst51.setString(4, po11w1Value);
        pst51.setString(5, program11co11);
        pst51.setString(6, program11co12);
        pst51.setString(7, program11co13);
        pst51.setString(8, program11co14);
        pst51.setString(9, program11co15);
        pst51.setString(10, program11co1total);
        pst51.executeUpdate();

        pst52 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst52.setString(1, program112);
        pst52.setString(2, program11com2);
        pst52.setString(3, program11ind2);
        pst52.setString(4, po11w2Value);
        pst52.setString(5, program11co21);
        pst52.setString(6, program11co22);
        pst52.setString(7, program11co23);
        pst52.setString(8, program11co24);
        pst52.setString(9, program11co25);
        pst52.setString(10, program11co2total);
        pst52.executeUpdate();

        pst53 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst53.setString(1, program113);
        pst53.setString(2, program11com3);
        pst53.setString(3, program11ind3);
        pst53.setString(4, po11w3Value);
        pst53.setString(5, program11co31);
        pst53.setString(6, program11co32);
        pst53.setString(7, program11co33);
        pst53.setString(8, program11co34);
        pst53.setString(9, program11co35);
        pst53.setString(10, program11co3total);
        pst53.executeUpdate();

        pst54 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst54.setString(1, program114);
        pst54.setString(2, program11com4);
        pst54.setString(3, program11ind4);
        pst54.setString(4, po11w4Value);
        pst54.setString(5, program11co41);
        pst54.setString(6, program11co42);
        pst54.setString(7, program11co43);
        pst54.setString(8, program11co44);
        pst54.setString(9, program11co45);
        pst54.setString(10, program11co4total);
        pst54.executeUpdate();

        pst55 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst55.setString(1, program115);
        pst55.setString(2, program11com5);
        pst55.setString(3, program11ind5);
        pst55.setString(4, po11w5Value);
        pst55.setString(5, program11co51);
        pst55.setString(6, program11co52);
        pst55.setString(7, program11co53);
        pst55.setString(8, program11co54);
        pst55.setString(9, program11co55);
        pst55.setString(10, program11co5total);
        pst55.executeUpdate();
 pst56 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        pst56.setString(1, program121);
        pst56.setString(2, program12com1);
        pst56.setString(3, program12ind1);
        pst56.setString(4, po12w1Value);
        pst56.setString(5, program12co11);
        pst56.setString(6, program12co12);
        pst56.setString(7, program12co13);
        pst56.setString(8, program12co14);
        pst56.setString(9, program12co15);
        pst56.setString(10, program12co1total);
        pst56.executeUpdate();
        pst57 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst57.setString(1, program122);
pst57.setString(2, program12com2);
pst57.setString(3, program12ind2);
pst57.setString(4, po12w2Value);
pst57.setString(5, program12co21);
pst57.setString(6, program12co22);
pst57.setString(7, program12co23);
pst57.setString(8, program12co24);
pst57.setString(9, program12co25);
pst57.setString(10, program12co2total);
pst57.executeUpdate();

// For pst58
pst58 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst58.setString(1, program123);
pst58.setString(2, program12com3);
pst58.setString(3, program12ind3);
pst58.setString(4, po12w3Value);
pst58.setString(5, program12co31);
pst58.setString(6, program12co32);
pst58.setString(7, program12co33);
pst58.setString(8, program12co34);
pst58.setString(9, program12co35);
pst58.setString(10, program12co3total);
pst58.executeUpdate();

// For pst59
pst59 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst59.setString(1, program124);
pst59.setString(2, program12com4);
pst59.setString(3, program12ind4);
pst59.setString(4, po12w4Value);
pst59.setString(5, program12co41);
pst59.setString(6, program12co42);
pst59.setString(7, program12co43);
pst59.setString(8, program12co44);
pst59.setString(9, program12co45);
pst59.setString(10, program12co4total);
pst59.executeUpdate();

// For pst60
pst60 = con.prepareStatement("INSERT INTO `copotable` (`PO`, `Competency`, `Indicators`, `Weight`, `CO1`, `CO2`, `CO3`, `CO4`, `CO5`, `PO1Mapping`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

pst60.setString(1, program125);
pst60.setString(2, program12com5);
pst60.setString(3, program12ind5);
pst60.setString(4, po12w5Value);
pst60.setString(5, program12co51);
pst60.setString(6, program12co52);
pst60.setString(7, program12co53);
pst60.setString(8, program12co54);
pst60.setString(9, program12co55);
pst60.setString(10, program12co5total);
pst60.executeUpdate();

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
    
//    for program 2 
 float AddWeight1_2 = Float.valueOf(po2w1.getText());
    float AddWeight2_2 = Float.valueOf(po2w2.getText());
    float AddWeight3_2 = Float.valueOf(po2w3.getText());
    float AddWeight4_2 = Float.valueOf(po2w4.getText());
    float AddWeight5_2 = Float.valueOf(po2w5.getText());

    float TotalWeight_2 = AddWeight1_2 + AddWeight2_2 + AddWeight3_2 + AddWeight4_2 + AddWeight5_2;

    int Addco11_2 = Integer.parseInt(po2co11.getText());
    int Addco12_2 = Integer.parseInt(po2co12.getText());
    int Addco13_2 = Integer.parseInt(po2co13.getText());
    int Addco14_2 = Integer.parseInt(po2co14.getText());
    int Addco15_2 = Integer.parseInt(po2co15.getText());

    int TotalCo1_2 = Addco11_2 + Addco12_2 + Addco13_2 + Addco14_2 + Addco15_2;

    int Addco21_2 = Integer.parseInt(po2co21.getText());
    int Addco22_2 = Integer.parseInt(po2co22.getText());
    int Addco23_2 = Integer.parseInt(po2co23.getText());
    int Addco24_2 = Integer.parseInt(po2co24.getText());
    int Addco25_2 = Integer.parseInt(po2co25.getText());

    int TotalCo2_2 = Addco21_2 + Addco22_2 + Addco23_2 + Addco24_2 + Addco25_2;

    int Addco31_2 = Integer.parseInt(po2co31.getText());
    int Addco32_2 = Integer.parseInt(po2co32.getText());
    int Addco33_2 = Integer.parseInt(po2co33.getText());
    int Addco34_2 = Integer.parseInt(po2co34.getText());
    int Addco35_2 = Integer.parseInt(po2co35.getText());

    int TotalCo3_2 = Addco31_2 + Addco32_2 + Addco33_2 + Addco34_2 + Addco35_2;

    int Addco41_2 = Integer.parseInt(po2co41.getText());
    int Addco42_2 = Integer.parseInt(po2co42.getText());
    int Addco43_2 = Integer.parseInt(po2co43.getText());
    int Addco44_2 = Integer.parseInt(po2co44.getText());
    int Addco45_2 = Integer.parseInt(po2co45.getText());

    int TotalCo4_2 = Addco41_2 + Addco42_2 + Addco43_2 + Addco44_2 + Addco45_2;

    int Addco51_2 = Integer.parseInt(po2co51.getText());
    int Addco52_2 = Integer.parseInt(po2co52.getText());
    int Addco53_2 = Integer.parseInt(po2co53.getText());
    int Addco54_2 = Integer.parseInt(po2co54.getText());
    int Addco55_2 = Integer.parseInt(po2co55.getText());

    int TotalCo5_2 = Addco51_2 + Addco52_2 + Addco53_2 + Addco54_2 + Addco55_2;

    po2wtotal.setText(String.valueOf(TotalWeight_2));
    po2co1total.setText(String.valueOf(TotalCo1_2));
    po2co2total.setText(String.valueOf(TotalCo2_2));
    po2co3total.setText(String.valueOf(TotalCo3_2));
    po2co4total.setText(String.valueOf(TotalCo4_2));
    po2co5total.setText(String.valueOf(TotalCo5_2));

    
//     for program 3
    float AddWeight1_3 = Float.valueOf(po3w1.getText());
    float AddWeight2_3 = Float.valueOf(po3w2.getText());
    float AddWeight3_3 = Float.valueOf(po3w3.getText());
    float AddWeight4_3 = Float.valueOf(po3w4.getText());
    float AddWeight5_3 = Float.valueOf(po3w5.getText());

    float TotalWeight_3 = AddWeight1_3 + AddWeight2_3 + AddWeight3_3 + AddWeight4_3 + AddWeight5_3;

    int Addco11_3 = Integer.parseInt(po3co11.getText());
    int Addco12_3 = Integer.parseInt(po3co12.getText());
    int Addco13_3 = Integer.parseInt(po3co13.getText());
    int Addco14_3 = Integer.parseInt(po3co14.getText());
    int Addco15_3 = Integer.parseInt(po3co15.getText());

    int TotalCo1_3 = Addco11_3 + Addco12_3 + Addco13_3 + Addco14_3 + Addco15_3;

    int Addco21_3 = Integer.parseInt(po3co21.getText());
    int Addco22_3 = Integer.parseInt(po3co22.getText());
    int Addco23_3 = Integer.parseInt(po3co23.getText());
    int Addco24_3 = Integer.parseInt(po3co24.getText());
    int Addco25_3 = Integer.parseInt(po3co25.getText());

    int TotalCo2_3 = Addco21_3 + Addco22_3 + Addco23_3 + Addco24_3 + Addco25_3;

    int Addco31_3 = Integer.parseInt(po3co31.getText());
    int Addco32_3 = Integer.parseInt(po3co32.getText());
    int Addco33_3 = Integer.parseInt(po3co33.getText());
    int Addco34_3 = Integer.parseInt(po3co34.getText());
    int Addco35_3 = Integer.parseInt(po3co35.getText());

    int TotalCo3_3 = Addco31_3 + Addco32_3 + Addco33_3 + Addco34_3 + Addco35_3;

    int Addco41_3 = Integer.parseInt(po3co41.getText());
    int Addco42_3 = Integer.parseInt(po3co42.getText());
    int Addco43_3 = Integer.parseInt(po3co43.getText());
    int Addco44_3 = Integer.parseInt(po3co44.getText());
    int Addco45_3 = Integer.parseInt(po3co45.getText());

    int TotalCo4_3 = Addco41_3 + Addco42_3 + Addco43_3 + Addco44_3 + Addco45_3;

    int Addco51_3 = Integer.parseInt(po3co51.getText());
    int Addco52_3 = Integer.parseInt(po3co52.getText());
    int Addco53_3 = Integer.parseInt(po3co53.getText());
    int Addco54_3 = Integer.parseInt(po3co54.getText());
    int Addco55_3 = Integer.parseInt(po3co55.getText());

    int TotalCo5_3 = Addco51_3 + Addco52_3 + Addco53_3 + Addco54_3 + Addco55_3;

    po3wtotal.setText(String.valueOf(TotalWeight_3));
    po3co1total.setText(String.valueOf(TotalCo1_3));
    po3co2total.setText(String.valueOf(TotalCo2_3));
    po3co3total.setText(String.valueOf(TotalCo3_3));
    po3co4total.setText(String.valueOf(TotalCo4_3));
    po3co5total.setText(String.valueOf(TotalCo5_3));
    
       float AddWeight1_4 = Float.valueOf(po4w1.getText());
    float AddWeight2_4 = Float.valueOf(po4w2.getText());
    float AddWeight3_4 = Float.valueOf(po4w3.getText());
    float AddWeight4_4 = Float.valueOf(po4w4.getText());
    float AddWeight5_4 = Float.valueOf(po4w5.getText());

    float TotalWeight_4 = AddWeight1_4 + AddWeight2_4 + AddWeight3_4 + AddWeight4_4 + AddWeight5_4;

    int Addco11_4 = Integer.parseInt(po4co11.getText());
    int Addco12_4 = Integer.parseInt(po4co12.getText());
    int Addco13_4 = Integer.parseInt(po4co13.getText());
    int Addco14_4 = Integer.parseInt(po4co14.getText());
    int Addco15_4 = Integer.parseInt(po4co15.getText());

    int TotalCo1_4 = Addco11_4 + Addco12_4 + Addco13_4 + Addco14_4 + Addco15_4;

    int Addco21_4 = Integer.parseInt(po4co21.getText());
    int Addco22_4 = Integer.parseInt(po4co22.getText());
    int Addco23_4 = Integer.parseInt(po4co23.getText());
    int Addco24_4 = Integer.parseInt(po4co24.getText());
    int Addco25_4 = Integer.parseInt(po4co25.getText());

    int TotalCo2_4 = Addco21_4 + Addco22_4 + Addco23_4 + Addco24_4 + Addco25_4;

    int Addco31_4 = Integer.parseInt(po4co31.getText());
    int Addco32_4 = Integer.parseInt(po4co32.getText());
    int Addco33_4 = Integer.parseInt(po4co33.getText());
    int Addco34_4 = Integer.parseInt(po4co34.getText());
    int Addco35_4 = Integer.parseInt(po4co35.getText());

    int TotalCo3_4 = Addco31_4 + Addco32_4 + Addco33_4 + Addco34_4 + Addco35_4;

    int Addco41_4 = Integer.parseInt(po4co41.getText());
    int Addco42_4 = Integer.parseInt(po4co42.getText());
    int Addco43_4 = Integer.parseInt(po4co43.getText());
    int Addco44_4 = Integer.parseInt(po4co44.getText());
    int Addco45_4 = Integer.parseInt(po4co45.getText());

    int TotalCo4_4 = Addco41_4 + Addco42_4 + Addco43_4 + Addco44_4 + Addco45_4;

    int Addco51_4 = Integer.parseInt(po4co51.getText());
    int Addco52_4 = Integer.parseInt(po4co52.getText());
    int Addco53_4 = Integer.parseInt(po4co53.getText());
    int Addco54_4 = Integer.parseInt(po4co54.getText());
    int Addco55_4 = Integer.parseInt(po4co55.getText());

    int TotalCo5_4 = Addco51_4 + Addco52_4 + Addco53_4 + Addco54_4 + Addco55_4;

    // Update the Total Weight and CO Total TextFields
    po4wtotal.setText(String.valueOf(TotalWeight_4));
    po4co1total.setText(String.valueOf(TotalCo1_4));
    po4co2total.setText(String.valueOf(TotalCo2_4));
    po4co3total.setText(String.valueOf(TotalCo3_4));
    po4co4total.setText(String.valueOf(TotalCo4_4));
    po4co5total.setText(String.valueOf(TotalCo5_4));

     float AddWeight1_5 = Float.valueOf(po5w1.getText());
    float AddWeight2_5 = Float.valueOf(po5w2.getText());
    float AddWeight3_5 = Float.valueOf(po5w3.getText());
    float AddWeight4_5 = Float.valueOf(po5w4.getText());
    float AddWeight5_5 = Float.valueOf(po5w5.getText());

    float TotalWeight_5 = AddWeight1_5 + AddWeight2_5 + AddWeight3_5 + AddWeight4_5 + AddWeight5_5;

    int Addco11_5 = Integer.parseInt(po5co11.getText());
    int Addco12_5 = Integer.parseInt(po5co12.getText());
    int Addco13_5 = Integer.parseInt(po5co13.getText());
    int Addco14_5 = Integer.parseInt(po5co14.getText());
    int Addco15_5 = Integer.parseInt(po5co15.getText());

    int TotalCo1_5 = Addco11_5 + Addco12_5 + Addco13_5 + Addco14_5 + Addco15_5;

    int Addco21_5 = Integer.parseInt(po5co21.getText());
    int Addco22_5 = Integer.parseInt(po5co22.getText());
    int Addco23_5 = Integer.parseInt(po5co23.getText());
    int Addco24_5 = Integer.parseInt(po5co24.getText());
    int Addco25_5 = Integer.parseInt(po5co25.getText());

    int TotalCo2_5 = Addco21_5 + Addco22_5 + Addco23_5 + Addco24_5 + Addco25_5;

    int Addco31_5 = Integer.parseInt(po5co31.getText());
    int Addco32_5 = Integer.parseInt(po5co32.getText());
    int Addco33_5 = Integer.parseInt(po5co33.getText());
    int Addco34_5 = Integer.parseInt(po5co34.getText());
    int Addco35_5 = Integer.parseInt(po5co35.getText());

    int TotalCo3_5 = Addco31_5 + Addco32_5 + Addco33_5 + Addco34_5 + Addco35_5;

    int Addco41_5 = Integer.parseInt(po5co41.getText());
    int Addco42_5 = Integer.parseInt(po5co42.getText());
    int Addco43_5 = Integer.parseInt(po5co43.getText());
    int Addco44_5 = Integer.parseInt(po5co44.getText());
    int Addco45_5 = Integer.parseInt(po5co45.getText());

    int TotalCo4_5 = Addco41_5 + Addco42_5 + Addco43_5 + Addco44_5 + Addco45_5;

    int Addco51_5 = Integer.parseInt(po5co51.getText());
    int Addco52_5 = Integer.parseInt(po5co52.getText());
    int Addco53_5 = Integer.parseInt(po5co53.getText());
    int Addco54_5 = Integer.parseInt(po5co54.getText());
    int Addco55_5 = Integer.parseInt(po5co55.getText());

    int TotalCo5_5 = Addco51_5 + Addco52_5 + Addco53_5 + Addco54_5 + Addco55_5;

    // Update the Total Weight and CO Total TextFields
    po5wtotal.setText(String.valueOf(TotalWeight_5));
    po5co1total.setText(String.valueOf(TotalCo1_5));
    po5co2total.setText(String.valueOf(TotalCo2_5));
    po5co3total.setText(String.valueOf(TotalCo3_5));
    po5co4total.setText(String.valueOf(TotalCo4_5));
    po5co5total.setText(String.valueOf(TotalCo5_5));

float AddWeight1_6 = Float.valueOf(po6w1.getText());
float AddWeight2_6 = Float.valueOf(po6w2.getText());
float AddWeight3_6 = Float.valueOf(po6w3.getText());
float AddWeight4_6 = Float.valueOf(po6w4.getText());
float AddWeight5_6 = Float.valueOf(po6w5.getText());

float TotalWeight_6 = AddWeight1_6 + AddWeight2_6 + AddWeight3_6 + AddWeight4_6 + AddWeight5_6;

int Addco11_6 = Integer.parseInt(po6co11.getText());
int Addco12_6 = Integer.parseInt(po6co12.getText());
int Addco13_6 = Integer.parseInt(po6co13.getText());
int Addco14_6 = Integer.parseInt(po6co14.getText());
int Addco15_6 = Integer.parseInt(po6co15.getText());

int TotalCo1_6 = Addco11_6 + Addco12_6 + Addco13_6 + Addco14_6 + Addco15_6;

int Addco21_6 = Integer.parseInt(po6co21.getText());
int Addco22_6 = Integer.parseInt(po6co22.getText());
int Addco23_6 = Integer.parseInt(po6co23.getText());
int Addco24_6 = Integer.parseInt(po6co24.getText());
int Addco25_6 = Integer.parseInt(po6co25.getText());

int TotalCo2_6 = Addco21_6 + Addco22_6 + Addco23_6 + Addco24_6 + Addco25_6;

int Addco31_6 = Integer.parseInt(po6co31.getText());
int Addco32_6 = Integer.parseInt(po6co32.getText());
int Addco33_6 = Integer.parseInt(po6co33.getText());
int Addco34_6 = Integer.parseInt(po6co34.getText());
int Addco35_6 = Integer.parseInt(po6co35.getText());

int TotalCo3_6 = Addco31_6 + Addco32_6 + Addco33_6 + Addco34_6 + Addco35_6;

int Addco41_6 = Integer.parseInt(po6co41.getText());
int Addco42_6 = Integer.parseInt(po6co42.getText());
int Addco43_6 = Integer.parseInt(po6co43.getText());
int Addco44_6 = Integer.parseInt(po6co44.getText());
int Addco45_6 = Integer.parseInt(po6co45.getText());

int TotalCo4_6 = Addco41_6 + Addco42_6 + Addco43_6 + Addco44_6 + Addco45_6;

int Addco51_6 = Integer.parseInt(po6co51.getText());
int Addco52_6 = Integer.parseInt(po6co52.getText());
int Addco53_6 = Integer.parseInt(po6co53.getText());
int Addco54_6 = Integer.parseInt(po6co54.getText());
int Addco55_6 = Integer.parseInt(po6co55.getText());

int TotalCo5_6 = Addco51_6 + Addco52_6 + Addco53_6 + Addco54_6 + Addco55_6;

// Update the Total Weight and CO Total TextFields
po6wtotal.setText(String.valueOf(TotalWeight_6));
po6co1total.setText(String.valueOf(TotalCo1_6));
po6co2total.setText(String.valueOf(TotalCo2_6));
po6co3total.setText(String.valueOf(TotalCo3_6));
po6co4total.setText(String.valueOf(TotalCo4_6));
po6co5total.setText(String.valueOf(TotalCo5_6));
float AddWeight1_7 = Float.valueOf(po7w1.getText());
float AddWeight2_7 = Float.valueOf(po7w2.getText());
float AddWeight3_7 = Float.valueOf(po7w3.getText());
float AddWeight4_7 = Float.valueOf(po7w4.getText());
float AddWeight5_7 = Float.valueOf(po7w5.getText());

float TotalWeight_7 = AddWeight1_7 + AddWeight2_7 + AddWeight3_7 + AddWeight4_7 + AddWeight5_7;

int Addco11_7 = Integer.parseInt(po7co11.getText());
int Addco12_7 = Integer.parseInt(po7co12.getText());
int Addco13_7 = Integer.parseInt(po7co13.getText());
int Addco14_7 = Integer.parseInt(po7co14.getText());
int Addco15_7 = Integer.parseInt(po7co15.getText());

int TotalCo1_7 = Addco11_7 + Addco12_7 + Addco13_7 + Addco14_7 + Addco15_7;

int Addco21_7 = Integer.parseInt(po7co21.getText());
int Addco22_7 = Integer.parseInt(po7co22.getText());
int Addco23_7 = Integer.parseInt(po7co23.getText());
int Addco24_7 = Integer.parseInt(po7co24.getText());
int Addco25_7 = Integer.parseInt(po7co25.getText());

int TotalCo2_7 = Addco21_7 + Addco22_7 + Addco23_7 + Addco24_7 + Addco25_7;

int Addco31_7 = Integer.parseInt(po7co31.getText());
int Addco32_7 = Integer.parseInt(po7co32.getText());
int Addco33_7 = Integer.parseInt(po7co33.getText());
int Addco34_7 = Integer.parseInt(po7co34.getText());
int Addco35_7 = Integer.parseInt(po7co35.getText());

int TotalCo3_7 = Addco31_7 + Addco32_7 + Addco33_7 + Addco34_7 + Addco35_7;

int Addco41_7 = Integer.parseInt(po7co41.getText());
int Addco42_7 = Integer.parseInt(po7co42.getText());
int Addco43_7 = Integer.parseInt(po7co43.getText());
int Addco44_7 = Integer.parseInt(po7co44.getText());
int Addco45_7 = Integer.parseInt(po7co45.getText());

int TotalCo4_7 = Addco41_7 + Addco42_7 + Addco43_7 + Addco44_7 + Addco45_7;

int Addco51_7 = Integer.parseInt(po7co51.getText());
int Addco52_7 = Integer.parseInt(po7co52.getText());
int Addco53_7 = Integer.parseInt(po7co53.getText());
int Addco54_7 = Integer.parseInt(po7co54.getText());
int Addco55_7 = Integer.parseInt(po7co55.getText());

int TotalCo5_7 = Addco51_7 + Addco52_7 + Addco53_7 + Addco54_7 + Addco55_7;

// Update the Total Weight and CO Total TextFields
po7wtotal.setText(String.valueOf(TotalWeight_7));
po7co1total.setText(String.valueOf(TotalCo1_7));
po7co2total.setText(String.valueOf(TotalCo2_7));
po7co3total.setText(String.valueOf(TotalCo3_7));
po7co4total.setText(String.valueOf(TotalCo4_7));
po7co5total.setText(String.valueOf(TotalCo5_7));
float AddWeight1_8 = Float.valueOf(po8w1.getText());
float AddWeight2_8 = Float.valueOf(po8w2.getText());
float AddWeight3_8 = Float.valueOf(po8w3.getText());
float AddWeight4_8 = Float.valueOf(po8w4.getText());
float AddWeight5_8 = Float.valueOf(po8w5.getText());

float TotalWeight_8 = AddWeight1_8 + AddWeight2_8 + AddWeight3_8 + AddWeight4_8 + AddWeight5_8;

int Addco11_8 = Integer.parseInt(po8co11.getText());
int Addco12_8 = Integer.parseInt(po8co12.getText());
int Addco13_8 = Integer.parseInt(po8co13.getText());
int Addco14_8 = Integer.parseInt(po8co14.getText());
int Addco15_8 = Integer.parseInt(po8co15.getText());

int TotalCo1_8 = Addco11_8 + Addco12_8 + Addco13_8 + Addco14_8 + Addco15_8;

int Addco21_8 = Integer.parseInt(po8co21.getText());
int Addco22_8 = Integer.parseInt(po8co22.getText());
int Addco23_8 = Integer.parseInt(po8co23.getText());
int Addco24_8 = Integer.parseInt(po8co24.getText());
int Addco25_8 = Integer.parseInt(po8co25.getText());

int TotalCo2_8 = Addco21_8 + Addco22_8 + Addco23_8 + Addco24_8 + Addco25_8;

int Addco31_8 = Integer.parseInt(po8co31.getText());
int Addco32_8 = Integer.parseInt(po8co32.getText());
int Addco33_8 = Integer.parseInt(po8co33.getText());
int Addco34_8 = Integer.parseInt(po8co34.getText());
int Addco35_8 = Integer.parseInt(po8co35.getText());

int TotalCo3_8 = Addco31_8 + Addco32_8 + Addco33_8 + Addco34_8 + Addco35_8;

int Addco41_8 = Integer.parseInt(po8co41.getText());
int Addco42_8 = Integer.parseInt(po8co42.getText());
int Addco43_8 = Integer.parseInt(po8co43.getText());
int Addco44_8 = Integer.parseInt(po8co44.getText());
int Addco45_8 = Integer.parseInt(po8co45.getText());

int TotalCo4_8 = Addco41_8 + Addco42_8 + Addco43_8 + Addco44_8 + Addco45_8;

int Addco51_8 = Integer.parseInt(po8co51.getText());
int Addco52_8 = Integer.parseInt(po8co52.getText());
int Addco53_8 = Integer.parseInt(po8co53.getText());
int Addco54_8 = Integer.parseInt(po8co54.getText());
int Addco55_8 = Integer.parseInt(po8co55.getText());

int TotalCo5_8 = Addco51_8 + Addco52_8 + Addco53_8 + Addco54_8 + Addco55_8;

// Update the Total Weight and CO Total TextFields
po8wtotal.setText(String.valueOf(TotalWeight_8));
po8co1total.setText(String.valueOf(TotalCo1_8));
po8co2total.setText(String.valueOf(TotalCo2_8));
po8co3total.setText(String.valueOf(TotalCo3_8));
po8co4total.setText(String.valueOf(TotalCo4_8));
po8co5total.setText(String.valueOf(TotalCo5_8));

     float AddWeight1_9 = Float.valueOf(po9w1.getText());
        float AddWeight2_9 = Float.valueOf(po9w2.getText());
        float AddWeight3_9 = Float.valueOf(po9w3.getText());
        float AddWeight4_9 = Float.valueOf(po9w4.getText());
        float AddWeight5_9 = Float.valueOf(po9w5.getText());

        float TotalWeight_9 = AddWeight1_9 + AddWeight2_9 + AddWeight3_9 + AddWeight4_9 + AddWeight5_9;

        int Addco11_9 = Integer.parseInt(po9co11.getText());
        int Addco12_9 = Integer.parseInt(po9co12.getText());
        int Addco13_9 = Integer.parseInt(po9co13.getText());
        int Addco14_9 = Integer.parseInt(po9co14.getText());
        int Addco15_9 = Integer.parseInt(po9co15.getText());

        int TotalCo1_9 = Addco11_9 + Addco12_9 + Addco13_9 + Addco14_9 + Addco15_9;

        int Addco21_9 = Integer.parseInt(po9co21.getText());
        int Addco22_9 = Integer.parseInt(po9co22.getText());
        int Addco23_9 = Integer.parseInt(po9co23.getText());
        int Addco24_9 = Integer.parseInt(po9co24.getText());
        int Addco25_9 = Integer.parseInt(po9co25.getText());

        int TotalCo2_9 = Addco21_9 + Addco22_9 + Addco23_9 + Addco24_9 + Addco25_9;

        int Addco31_9 = Integer.parseInt(po9co31.getText());
        int Addco32_9 = Integer.parseInt(po9co32.getText());
        int Addco33_9 = Integer.parseInt(po9co33.getText());
        int Addco34_9 = Integer.parseInt(po9co34.getText());
        int Addco35_9 = Integer.parseInt(po9co35.getText());

        int TotalCo3_9 = Addco31_9 + Addco32_9 + Addco33_9 + Addco34_9 + Addco35_9;

        int Addco41_9 = Integer.parseInt(po9co41.getText());
        int Addco42_9 = Integer.parseInt(po9co42.getText());
        int Addco43_9 = Integer.parseInt(po9co43.getText());
        int Addco44_9 = Integer.parseInt(po9co44.getText());
        int Addco45_9 = Integer.parseInt(po9co45.getText());

        int TotalCo4_9 = Addco41_9 + Addco42_9 + Addco43_9 + Addco44_9 + Addco45_9;

        int Addco51_9 = Integer.parseInt(po9co51.getText());
        int Addco52_9 = Integer.parseInt(po9co52.getText());
        int Addco53_9 = Integer.parseInt(po9co53.getText());
        int Addco54_9 = Integer.parseInt(po9co54.getText());
        int Addco55_9 = Integer.parseInt(po9co55.getText());

        int TotalCo5_9 = Addco51_9 + Addco52_9 + Addco53_9 + Addco54_9 + Addco55_9;

        // Update the Total Weight and CO Total TextFields
        po9wtotal.setText(String.valueOf(TotalWeight_9));
        po9co1total.setText(String.valueOf(TotalCo1_9));
        po9co2total.setText(String.valueOf(TotalCo2_9));
        po9co3total.setText(String.valueOf(TotalCo3_9));
        po9co4total.setText(String.valueOf(TotalCo4_9));
        po9co5total.setText(String.valueOf(TotalCo5_9));
        
         float AddWeight1_10 = Float.valueOf(po10w1.getText());
        float AddWeight2_10 = Float.valueOf(po10w2.getText());
        float AddWeight3_10 = Float.valueOf(po10w3.getText());
        float AddWeight4_10 = Float.valueOf(po10w4.getText());
        float AddWeight5_10 = Float.valueOf(po10w5.getText());

        float TotalWeight_10 = AddWeight1_10 + AddWeight2_10 + AddWeight3_10 + AddWeight4_10 + AddWeight5_10;

        int Addco11_10 = Integer.parseInt(po10co11.getText());
        int Addco12_10 = Integer.parseInt(po10co12.getText());
        int Addco13_10 = Integer.parseInt(po10co13.getText());
        int Addco14_10 = Integer.parseInt(po10co14.getText());
        int Addco15_10 = Integer.parseInt(po10co15.getText());

        int TotalCo1_10 = Addco11_10 + Addco12_10 + Addco13_10 + Addco14_10 + Addco15_10;

        int Addco21_10 = Integer.parseInt(po10co21.getText());
        int Addco22_10 = Integer.parseInt(po10co22.getText());
        int Addco23_10 = Integer.parseInt(po10co23.getText());
        int Addco24_10 = Integer.parseInt(po10co24.getText());
        int Addco25_10 = Integer.parseInt(po10co25.getText());

        int TotalCo2_10 = Addco21_10 + Addco22_10 + Addco23_10 + Addco24_10 + Addco25_10;

        int Addco31_10 = Integer.parseInt(po10co31.getText());
        int Addco32_10 = Integer.parseInt(po10co32.getText());
        int Addco33_10 = Integer.parseInt(po10co33.getText());
        int Addco34_10 = Integer.parseInt(po10co34.getText());
        int Addco35_10 = Integer.parseInt(po10co35.getText());

        int TotalCo3_10 = Addco31_10 + Addco32_10 + Addco33_10 + Addco34_10 + Addco35_10;

        int Addco41_10 = Integer.parseInt(po10co41.getText());
        int Addco42_10 = Integer.parseInt(po10co42.getText());
        int Addco43_10 = Integer.parseInt(po10co43.getText());
        int Addco44_10 = Integer.parseInt(po10co44.getText());
        int Addco45_10 = Integer.parseInt(po10co45.getText());

        int TotalCo4_10 = Addco41_10 + Addco42_10 + Addco43_10 + Addco44_10 + Addco45_10;

        int Addco51_10 = Integer.parseInt(po10co51.getText());
        int Addco52_10 = Integer.parseInt(po10co52.getText());
        int Addco53_10 = Integer.parseInt(po10co53.getText());
        int Addco54_10 = Integer.parseInt(po10co54.getText());
        int Addco55_10 = Integer.parseInt(po10co55.getText());

        int TotalCo5_10 = Addco51_10 + Addco52_10 + Addco53_10 + Addco54_10 + Addco55_10;

        // Update the Total Weight and CO Total TextFields
        po10wtotal.setText(String.valueOf(TotalWeight_10));
        po10co1total.setText(String.valueOf(TotalCo1_10));
        po10co2total.setText(String.valueOf(TotalCo2_10));
        po10co3total.setText(String.valueOf(TotalCo3_10));
        po10co4total.setText(String.valueOf(TotalCo4_10));
        po10co5total.setText(String.valueOf(TotalCo5_10));
         float AddWeight1_11 = Float.valueOf(po11w1.getText());
        float AddWeight2_11 = Float.valueOf(po11w2.getText());
        float AddWeight3_11 = Float.valueOf(po11w3.getText());
        float AddWeight4_11 = Float.valueOf(po11w4.getText());
        float AddWeight5_11 = Float.valueOf(po11w5.getText());

        float TotalWeight_11 = AddWeight1_11 + AddWeight2_11 + AddWeight3_11 + AddWeight4_11 + AddWeight5_11;

        int Addco11_11 = Integer.parseInt(po11co11.getText());
        int Addco12_11 = Integer.parseInt(po11co12.getText());
        int Addco13_11 = Integer.parseInt(po11co13.getText());
        int Addco14_11 = Integer.parseInt(po11co14.getText());
        int Addco15_11 = Integer.parseInt(po11co15.getText());

        int TotalCo1_11 = Addco11_11 + Addco12_11 + Addco13_11 + Addco14_11 + Addco15_11;

        int Addco21_11 = Integer.parseInt(po11co21.getText());
        int Addco22_11 = Integer.parseInt(po11co22.getText());
        int Addco23_11 = Integer.parseInt(po11co23.getText());
        int Addco24_11 = Integer.parseInt(po11co24.getText());
        int Addco25_11 = Integer.parseInt(po11co25.getText());

        int TotalCo2_11 = Addco21_11 + Addco22_11 + Addco23_11 + Addco24_11 + Addco25_11;

        int Addco31_11 = Integer.parseInt(po11co31.getText());
        int Addco32_11 = Integer.parseInt(po11co32.getText());
        int Addco33_11 = Integer.parseInt(po11co33.getText());
        int Addco34_11 = Integer.parseInt(po11co34.getText());
        int Addco35_11 = Integer.parseInt(po11co35.getText());

        int TotalCo3_11 = Addco31_11 + Addco32_11 + Addco33_11 + Addco34_11 + Addco35_11;

        int Addco41_11 = Integer.parseInt(po11co41.getText());
        int Addco42_11 = Integer.parseInt(po11co42.getText());
        int Addco43_11 = Integer.parseInt(po11co43.getText());
        int Addco44_11 = Integer.parseInt(po11co44.getText());
        int Addco45_11 = Integer.parseInt(po11co45.getText());

        int TotalCo4_11 = Addco41_11 + Addco42_11 + Addco43_11 + Addco44_11 + Addco45_11;

        int Addco51_11 = Integer.parseInt(po11co51.getText());
        int Addco52_11 = Integer.parseInt(po11co52.getText());
        int Addco53_11 = Integer.parseInt(po11co53.getText());
        int Addco54_11 = Integer.parseInt(po11co54.getText());
        int Addco55_11 = Integer.parseInt(po11co55.getText());

        int TotalCo5_11 = Addco51_11 + Addco52_11 + Addco53_11 + Addco54_11 + Addco55_11;

        // Update the Total Weight and CO Total TextFields
        po11wtotal.setText(String.valueOf(TotalWeight_11));
        po11co1total.setText(String.valueOf(TotalCo1_11));
        po11co2total.setText(String.valueOf(TotalCo2_11));
        po11co3total.setText(String.valueOf(TotalCo3_11));
        po11co4total.setText(String.valueOf(TotalCo4_11));
        po11co5total.setText(String.valueOf(TotalCo5_11));
        
        float AddWeight1_12 = Float.valueOf(po12w1.getText());
        float AddWeight2_12 = Float.valueOf(po12w2.getText());
        float AddWeight3_12 = Float.valueOf(po12w3.getText());
        float AddWeight4_12 = Float.valueOf(po12w4.getText());
        float AddWeight5_12 = Float.valueOf(po12w5.getText());

        float TotalWeight_12 = AddWeight1_12 + AddWeight2_12 + AddWeight3_12 + AddWeight4_12 + AddWeight5_12;

        int Addco11_12 = Integer.parseInt(po12co11.getText());
        int Addco12_12 = Integer.parseInt(po12co12.getText());
        int Addco13_12 = Integer.parseInt(po12co13.getText());
        int Addco14_12 = Integer.parseInt(po12co14.getText());
        int Addco15_12 = Integer.parseInt(po12co15.getText());

        int TotalCo1_12 = Addco11_12 + Addco12_12 + Addco13_12 + Addco14_12 + Addco15_12;

        int Addco21_12 = Integer.parseInt(po12co21.getText());
        int Addco22_12 = Integer.parseInt(po12co22.getText());
        int Addco23_12 = Integer.parseInt(po12co23.getText());
        int Addco24_12 = Integer.parseInt(po12co24.getText());
        int Addco25_12 = Integer.parseInt(po12co25.getText());

        int TotalCo2_12 = Addco21_12 + Addco22_12 + Addco23_12 + Addco24_12 + Addco25_12;

        int Addco31_12 = Integer.parseInt(po12co31.getText());
        int Addco32_12 = Integer.parseInt(po12co32.getText());
        int Addco33_12 = Integer.parseInt(po12co33.getText());
        int Addco34_12 = Integer.parseInt(po12co34.getText());
        int Addco35_12 = Integer.parseInt(po12co35.getText());

        int TotalCo3_12 = Addco31_12 + Addco32_12 + Addco33_12 + Addco34_12 + Addco35_12;

        int Addco41_12 = Integer.parseInt(po12co41.getText());
        int Addco42_12 = Integer.parseInt(po12co42.getText());
        int Addco43_12 = Integer.parseInt(po12co43.getText());
        int Addco44_12 = Integer.parseInt(po12co44.getText());
        int Addco45_12 = Integer.parseInt(po12co45.getText());

        int TotalCo4_12 = Addco41_12 + Addco42_12 + Addco43_12 + Addco44_12 + Addco45_12;

        int Addco51_12 = Integer.parseInt(po12co51.getText());
        int Addco52_12 = Integer.parseInt(po12co52.getText());
        int Addco53_12 = Integer.parseInt(po12co53.getText());
        int Addco54_12 = Integer.parseInt(po12co54.getText());
        int Addco55_12 = Integer.parseInt(po12co55.getText());

        int TotalCo5_12 = Addco51_12 + Addco52_12 + Addco53_12 + Addco54_12 + Addco55_12;

        // Update the Total Weight and CO Total TextFields
        po12wtotal.setText(String.valueOf(TotalWeight_12));
        po12co1total.setText(String.valueOf(TotalCo1_12));
        po12co2total.setText(String.valueOf(TotalCo2_12));
        po12co3total.setText(String.valueOf(TotalCo3_12));
        po12co4total.setText(String.valueOf(TotalCo4_12));
        po12co5total.setText(String.valueOf(TotalCo5_12));


}

    

 Connection con ;
    PreparedStatement pst1;
        PreparedStatement pst2;
    PreparedStatement pst3;
    PreparedStatement pst4;
    PreparedStatement pst5;
        PreparedStatement pst6;
    PreparedStatement pst7;
    PreparedStatement pst8;
    PreparedStatement pst9;
    PreparedStatement pst10;
    PreparedStatement pst11;
    PreparedStatement pst12;
    PreparedStatement pst13;
    PreparedStatement pst14;
    PreparedStatement pst15;
    PreparedStatement pst16;
    PreparedStatement pst17;
    PreparedStatement pst18;
    PreparedStatement pst19;
    PreparedStatement pst20;
    PreparedStatement pst21;
    PreparedStatement pst22;
    PreparedStatement pst23;
    PreparedStatement pst24;
    PreparedStatement pst25;
    PreparedStatement pst26;
    PreparedStatement pst27;
    PreparedStatement pst28;
    PreparedStatement pst29;
    PreparedStatement pst30;
        PreparedStatement pst31;
    PreparedStatement pst32;
    PreparedStatement pst33;
    PreparedStatement pst34;
    PreparedStatement pst35;
    PreparedStatement pst36;
    PreparedStatement pst37;
    PreparedStatement pst38;
    PreparedStatement pst39;
    PreparedStatement pst40;
    PreparedStatement pst41;
    PreparedStatement pst42;
    PreparedStatement pst43;
    PreparedStatement pst44;
    PreparedStatement pst45;
    PreparedStatement pst46;
    PreparedStatement pst47;
    PreparedStatement pst48;
    PreparedStatement pst49;
    PreparedStatement pst50;
        PreparedStatement pst51;
    PreparedStatement pst52;
    PreparedStatement pst53;
    PreparedStatement pst54;
    PreparedStatement pst55;
    PreparedStatement pst56;
    PreparedStatement pst57;
    PreparedStatement pst58;
    PreparedStatement pst59;
    PreparedStatement pst60;


    




    
    
    
    
        

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
    
    
    
    
    
//     @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connect();
    }    
//    
}