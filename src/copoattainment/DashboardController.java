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
    private Pane table;
    @FXML
    private Button Logout;
    @FXML
    private Button downloadButton;
    @FXML
    private TextField TableToDownload;
    @FXML
    private Pane DownloadPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set event handlers for buttons
                      DownloadPane.setVisible(false);

    table.setVisible(true);
        btncopotable.setOnAction(event -> showPane(table));
        btndownload.setOnAction(event -> showPane(DownloadPane));


                Table.setOnAction(event -> openCopotableWindow(event));
                                Table2.setOnAction(event -> openCopotableWindow(event));


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
        table.setVisible(false);
                      DownloadPane.setVisible(false);

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
        String tableName = TableToDownload.getText(); // Get the table name from the TextField

        if (tableName.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please enter a table name.");
            return;
        }

        Connection connection = ConnectionUtils.conDB(ConnectionHolder.getConnectedDBName());
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save CSV File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        fileChooser.setInitialFileName(tableName + ".csv"); // Set the default file name

        File file = fileChooser.showSaveDialog(new Stage());

        if (file != null) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String csvData = generateCSVData(connection, tableName);
            writer.write(csvData);
            writer.close();

            showAlert(Alert.AlertType.INFORMATION, "Download Successful", "CSV file has been downloaded.");
        }

    } catch (SQLException | IOException e) {
        e.printStackTrace();
        showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while downloading the CSV file.");
    }
}

private String generateCSVData(Connection connection, String tableName) throws SQLException {
    StringBuilder csvData = new StringBuilder();

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

    ResultSetMetaData metaData = resultSet.getMetaData();
    int columnCount = metaData.getColumnCount();

    // Write column names to the CSV string
    for (int i = 1; i <= columnCount; i++) {
        csvData.append("\"").append(metaData.getColumnName(i)).append("\"");
        if (i < columnCount) {
            csvData.append(",");
        }
    }
    csvData.append(System.lineSeparator());

    // Write data rows to the CSV string
    while (resultSet.next()) {
        for (int i = 1; i <= columnCount; i++) {
            String value = resultSet.getString(i);
            csvData.append("\"").append(value).append("\"");
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

