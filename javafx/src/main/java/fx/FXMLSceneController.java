/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLSceneController implements Initializable {

    @FXML
    private TextField fxUser;
    
    
     @FXML
    private void handleLoginAction(ActionEvent event) throws IOException {
        
        Alert a = new Alert(Alert.AlertType.INFORMATION, "HOLA", ButtonType.CLOSE);
        //final Stage stage = (Stage) fxUser.getScene().getWindow();
        //a.initOwner(stage);
        a.showAndWait();
        
//         FadeTransition ft = new FadeTransition(Duration.millis(5000), fxUser);
//    ft.setFromValue(1.0);
//    ft.setToValue(0.0);
//    ft.play();
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
