package copoattainment;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
import javafx.event.ActionEvent;
import utils.ConnectionUtils;

public class DashboardController implements Initializable {

    @FXML
    private Button Table;
    @FXML
    private Button Table2;
    @FXML
    private Button btncopotable;
    @FXML
    private Button btndownload;
    @FXML
    private Pane tablemain;
    @FXML
    private Pane downloadmain;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set event handlers for buttons
           tablemain.setVisible(false);
    downloadmain.setVisible(false);
        btncopotable.setOnAction(event -> showPane(tablemain));
        btndownload.setOnAction(event -> showPane(downloadmain));
                Table.setOnAction(event -> openCopotableWindow(event));
 int numberOfTables = ConnectionUtils.getNumberOfTables(ConnectionHolder.getConnectedDBName());
        System.out.println("Number of tables: " + numberOfTables);
    }    
    
     private void openCopotableWindow(ActionEvent event) {
        try {
            // Load the FXML file
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("path_to_copotable.fxml")); // Replace with the actual path
                   FXMLLoader loader = new FXMLLoader(getClass().getResource("COPOTable.fxml"));
    Parent root = loader.load();


                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
               
            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
    
    private void showPane(Pane paneToShow) {
        // Hide all panes
        tablemain.setVisible(false);
        downloadmain.setVisible(false);

        // Show the specified pane
        paneToShow.setVisible(true);
    }
}
