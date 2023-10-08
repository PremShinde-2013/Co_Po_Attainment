//package copoattainment;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import java.io.IOException;
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ResourceBundle;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//import utils.ConnectionUtils;
//
///**
// *
// * @author oXCToo
// */
//public class LoginController implements Initializable {
//
//    @FXML
//    private Label lblErrors;
//
//    @FXML
//    private TextField txtUsername;
//
//    @FXML
//    private TextField txtPassword;
//
//    @FXML
//    private Button btnSignin;
//
//    /// -- 
//    Connection con = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//
//    @FXML
//private Button btnSignup;
//
//@FXML
//private void handleSignupButtonAction(MouseEvent event) {
//    if (event.getSource() == btnSignup) {
//        try {
//            // Load the Signup.fxml file
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("Signup.fxml"));
//            Parent root = loader.load();
//
//            // Get the controller of the Signup.fxml file
//            SignupController signupController = loader.getController();
//
//            // Get the stage and set the new scene
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//        } catch (IOException ex) {
//            System.err.println(ex.getMessage());
//        }
//    }
//}
//
//    
//    
//    
//    
//    @FXML
//    public void handleButtonAction(MouseEvent event) {
//
//        if (event.getSource() == btnSignin) {
//            //login here
//            if (logIn().equals("Success")) {
//                try {
//
//                    //add you loading or delays - ;-)
//                    Node node = (Node) event.getSource();
//                    Stage stage = (Stage) node.getScene().getWindow();
//                    //stage.setMaximized(true);
//                    stage.close();
//                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("COPOTable.fxml")));
//                    stage.setScene(scene);
//                    stage.show();
//
//                } catch (IOException ex) {
//                    System.err.println(ex.getMessage());
//                }
//
//            }
//        }
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//        if (con == null) {
//            lblErrors.setTextFill(Color.TOMATO);
//            lblErrors.setText("Server Error : Check");
//        } else {
//            lblErrors.setTextFill(Color.GREEN);
//            lblErrors.setText("Server is up : Good to go");
//        }
//    }
//
//    public LoginController() {
////        con = ConnectionUtils.conDB()
//        con = ConnectionUtils.conDB("copoattainment"); // Connect to a fixed database
//
//    }
//
//    //we gonna use string to check for status
//    private String logIn() {
//        String status = "Success";
//        String email = txtUsername.getText();
//        String password = txtPassword.getText();
//        if(email.isEmpty() || password.isEmpty()) {
//            setLblError(Color.TOMATO, "Empty credentials");
//            status = "Error";
//        } else {
//            //query
//            String sql = "SELECT * FROM users Where username = ? and password = ?";
//            try {
//                preparedStatement = con.prepareStatement(sql);
//                preparedStatement.setString(1, email);
//                preparedStatement.setString(2, password);
//                resultSet = preparedStatement.executeQuery();
//                if (!resultSet.next()) {
//                    setLblError(Color.TOMATO, "Enter Correct Email/Password");
//                    status = "Error";
//                } else {
//                    setLblError(Color.GREEN, "Login Successful..Redirecting..");
//                }
//            } catch (SQLException ex) {
//                System.err.println(ex.getMessage());
//                status = "Exception";
//            }
//        }
//        
//        return status;
//    }
//    
//    private void setLblError(Color color, String text) {
//        lblErrors.setTextFill(color);
//        lblErrors.setText(text);
//        System.out.println(text);
//    }
//}



// modified

package copoattainment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import utils.ConnectionUtils;

public class LoginController implements Initializable {

    @FXML
    private Label lblErrors;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnSignin;

    /// -- 
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    private Button btnSignup;

    @FXML
    private void handleSignupButtonAction(MouseEvent event) {
        if (event.getSource() == btnSignup) {
            try {
                // Load the Signup.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Signup.fxml"));
                Parent root = loader.load();

                // Get the controller of the Signup.fxml file
                SignupController signupController = loader.getController();

                // Get the stage and set the new scene
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    @FXML
    public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == btnSignin) {
            //login here
            String loginResult = logIn();
            if (loginResult.equals("Success")) {
//               
                try {
                    
//         *****************   old ***************
//                    //add your loading or delays - ;-)
//                    Node node = (Node) event.getSource();
//                    Stage stage = (Stage) node.getScene().getWindow();
//                    //stage.setMaximized(true);
//                    stage.close();
////                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("COPOTable.fxml")));
//                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("bestTable.fxml")));
//                    
//                   
//        
//                    stage.setScene(scene);
//                    stage.show();
 
//****************** new *************

                   FXMLLoader loader = new FXMLLoader(getClass().getResource("bestTable.fxml"));
                Parent root = loader.load();

                BestTableController tableController = loader.getController();
                tableController.setUsername(txtUsername.getText());

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            } else if (loginResult.equals("Error")) {
                // Display an error message if login fails
                setLblError(Color.TOMATO, "Incorrect Email/Password");
            } else if (loginResult.equals("Exception")) {
                // Handle the exception case, e.g., database connection issue
                setLblError(Color.TOMATO, "Exception occurred while logging in");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        con = ConnectionUtils.conDB("copoattainment"); // Connect to a fixed database

        if (con == null) {
            lblErrors.setTextFill(Color.TOMATO);
            lblErrors.setText("Server Error: Check");
        } else {
            lblErrors.setTextFill(Color.GREEN);
            lblErrors.setText("Server is up: Good to go");
        }
    }

    // We're using string statuses to check for the login result
    private String logIn() {
        String status = "Success";
        String email = txtUsername.getText();
        String password = txtPassword.getText();
        if (email.isEmpty() || password.isEmpty()) {
            setLblError(Color.TOMATO, "Empty credentials");
            status = "Error";
        } else {
String dbName = "user_" + email;
Connection userConnection = ConnectionUtils.conDB(dbName);

            if (userConnection != null) {
                    ConnectionHolder.setUserConnection(userConnection, dbName);

                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                try {
//                                    ConnectionHolder.setUserConnection(con, "copoattainment");
//                                    ConnectionHolder.setUserConnection(con, "copoattainment");



                    preparedStatement = userConnection.prepareStatement(sql);
                    preparedStatement.setString(1, email);
                    preparedStatement.setString(2, password);
                    resultSet = preparedStatement.executeQuery();

                    if (!resultSet.next()) {
                        setLblError(Color.TOMATO, "Incorrect Email/Password");
                        status = "Error";
                    } else {
                        setLblError(Color.GREEN, "Login Successful..Redirecting..");
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                    status = "Exception";
                }
            } else {
                setLblError(Color.TOMATO, "Error connecting to user database");
                status = "Error";
            }
        }

        return status;
    }

    private void setLblError(Color color, String text) {
        lblErrors.setTextFill(color);
        lblErrors.setText(text);
        System.out.println(text);
    }
    
}
