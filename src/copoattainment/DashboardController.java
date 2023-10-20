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
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
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

    int numberOfTables = ConnectionUtils.getNumberOfTables(ConnectionHolder.getConnectedDBName());

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
System.out.println("tablemain visibility: " + tablemain.isVisible());

 for (int i = 0; i < numberOfTables; i++) {
        Pane tablePane = createTablePane(i);
        GridPane.setColumnIndex(tablePane, i % 2); // Adjust grid column index as needed
        GridPane.setRowIndex(tablePane, i / 2);   // Adjust grid row index as needed
        tablemain.getChildren().add(tablePane);
    }
    }    
    
    private Pane createTablePane(int tableIndex) {
    Pane pane = new Pane();
    // Customize the properties of the pane as needed
    pane.setPrefHeight(202.0);
    pane.setPrefWidth(179.0);

    Button button = new Button();
    button.setMnemonicParsing(false);
    button.setOpacity(0.7);
    button.setPrefHeight(190.0);
    button.setPrefWidth(168.0);
    button.getStyleClass().add("button2");
    button.getStylesheets().add("@../styling/fullstyling2.css"); // Add the stylesheet

    // Set other properties for the button and add event handlers as needed

        Circle circle = new Circle();
    // Customize the properties of the circle as needed

        ImageView imageView = new ImageView();
    // Customize the properties of the image view and set the image

    Label label = new Label();
    // Customize the properties of the label and set the text

    // Add button, circle, imageView, and label to the pane

    return pane;
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
