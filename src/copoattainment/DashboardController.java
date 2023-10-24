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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
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
    private Pane tablemain;
    private Pane downloadmain;

//    int numberOfTables = ConnectionUtils.getNumberOfTables(ConnectionHolder.getConnectedDBName());
    @FXML
    private Pane tabletotal;
    @FXML
    private Pane table;
    @FXML
    private Button Logout;
    @FXML
    private Button alltables;
    @FXML
    private Pane table1;
    @FXML
    private Button downloadButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set event handlers for buttons
           tabletotal.setVisible(false);
                      table1.setVisible(false);

    table.setVisible(true);
        btncopotable.setOnAction(event -> showPane(table));
        btndownload.setOnAction(event -> showPane(tabletotal));
                alltables.setOnAction(event -> showPane(table1));

                Table.setOnAction(event -> openCopotableWindow(event));
// int numberOfTables = ConnectionUtils.getNumberOfTables(ConnectionHolder.getConnectedDBName());

//        System.out.println("Number of tables: " + numberOfTables);
//System.out.println("tablemain visibility: " + table.isVisible());

// for (int i = 0; i < numberOfTables; i++) {
//        Pane tablePane = createTablePane(i);
//        GridPane.setColumnIndex(tablePane, i % 2); // Adjust grid column index as needed
//        GridPane.setRowIndex(tablePane, i / 2);   // Adjust grid row index as needed
//        table.getChildren().add(tablePane);
//    }
    }    
    
//    private Pane createTablePane(int tableIndex) {
//    Pane pane = new Pane();
//    // Customize the properties of the pane as needed
//    pane.setPrefHeight(202.0);
//    pane.setPrefWidth(179.0);
//
//    Button button = new Button();
//    button.setMnemonicParsing(false);
//    button.setOpacity(0.7);
//    button.setPrefHeight(190.0);
//    button.setPrefWidth(168.0);
//    button.getStyleClass().add("button2");
//    button.getStylesheets().add("@../styling/fullstyling2.css"); // Add the stylesheet
//
//    // Set other properties for the button and add event handlers as needed
//
//        Circle circle = new Circle();
//    // Customize the properties of the circle as needed
//
//        ImageView imageView = new ImageView();
//    // Customize the properties of the image view and set the image
//
//    Label label = new Label();
//    // Customize the properties of the label and set the text
//
//    // Add button, circle, imageView, and label to the pane
//
//    return pane;
//}
//    
    
    
    
    
    
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
        tabletotal.setVisible(false);
        table.setVisible(false);
                      table1.setVisible(false);

        // Show the specified pane
        paneToShow.setVisible(true);
    }

    @FXML
    private void logoutbtn(ActionEvent event) {
         try {
        // Load the FXML file for the login screen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();

        // Get the stage of the current event source (button)
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Create a new scene with the login screen and set it in the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

        // Show the stage
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void handleDownloadButton(ActionEvent event) {
          try {
        Connection connection = ConnectionUtils.conDB(ConnectionHolder.getConnectedDBName());

            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", null);

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save CSV File");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
            File file = fileChooser.showSaveDialog(new Stage());

            if (file != null) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                while (tables.next()) {
                    String tableName = tables.getString(3);
                    String csvData = generateCSVData(connection, tableName);

                    writer.write(csvData);
                    writer.newLine();
                }

                writer.close();

                showAlert(Alert.AlertType.INFORMATION, "Download Successful", "CSV files have been downloaded.");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while downloading the CSV files.");
        }
    }

    private String generateCSVData(Connection connection, String tableName) throws SQLException {
        StringBuilder csvData = new StringBuilder();

        Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            csvData.append(metaData.getColumnName(i));
            if (i < columnCount) {
                csvData.append(",");
            }
        }
        csvData.append(System.lineSeparator());

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                csvData.append(resultSet.getString(i));
                if (i < columnCount) {
                    csvData.append(",");
                }
            }
            csvData.append(System.lineSeparator());
        }

        return csvData.toString();
    }

    // ... your existing code ...

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
    }

