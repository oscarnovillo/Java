/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLSceneNewController implements Initializable {

    private FXMLMenuController controller;
    
    
    @FXML
    private ToggleGroup fxTipoEmpleado;
    
    @FXML
    private DatePicker fxFecha;
    
    @FXML 
    private CheckBox fxCheckPerecedero;
    

    @FXML
    private void clickPerecedero(ActionEvent event)  {
        fxFecha.setDisable(!fxCheckPerecedero.isSelected());
    }
    
    
    @FXML
    private void clickAltaEmpleado(ActionEvent event) throws IOException {

        String radio  = ((RadioButton)fxTipoEmpleado.getSelectedToggle()).getText();
        LocalDate fecha = fxFecha.getValue();
        boolean altaOk = this.controller.getMerchadona().darAltaEmpleado("pepe", 23, 1);

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "El id ya existe", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
         

    }

    @FXML
    private void handleAction(ActionEvent event) throws IOException {

        Alert a = new Alert(Alert.AlertType.INFORMATION, "HOLA", ButtonType.CLOSE);
        //final Stage stage = (Stage) fxUser.getScene().getWindow();
        //a.initOwner(stage);
        a.showAndWait();

        this.controller.getFxMenu().setVisible(true);


//         
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setController(FXMLMenuController controller) {
        this.controller = controller;
    }
}
