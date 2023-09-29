package copoattainment;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.ConnectionUtils;


public class SignupController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnSignup;
    @FXML
    private Label lblErrors;
    @FXML
    private Label lbl_close;
    @FXML
    private TextField txtFirstName;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField txtConfirmPassword;
    @FXML
    private TextField txtLastName;

    private Connection con = null;
    private PreparedStatement preparedStatement = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize database connection
        con = ConnectionUtils.conDB();
    }

    @FXML
    private void handleSignupButtonAction(MouseEvent event) {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();

         if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
        setLblError("Please fill in all fields");
        return;
    }
        
        
        if (!password.equals(confirmPassword)) {
            setLblError("Passwords do not match");
            return;
        }

        String query = "INSERT INTO users (firstname, lastname, username, password) VALUES (?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);

            int result = preparedStatement.executeUpdate();

            if (result == 1) {
                setLblError("User registered successfully");
                // Redirect to login page
                redirectToLogin(event);
            } else {
                setLblError("Error registering user");
            }

        } catch (SQLException e) {
            setLblError("Error: " + e.getMessage());
        }
    }

    private void setLblError(String text) {
        lblErrors.setText(text);
    }

   @FXML
private void redirectToLogin(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
        LoginController loginController = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    // Other methods...
}
