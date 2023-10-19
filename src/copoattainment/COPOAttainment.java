/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package copoattainment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class COPOAttainment extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("COPOTable.fxml"));
                Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
//                                Parent root = FXMLLoader.load(getClass().getResource("bestTable.fxml"));
//                                Parent root = FXMLLoader.load(getClass().getResource("POCOGraph.fxml"));
// Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));



        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
      
}