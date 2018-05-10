/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author oscar
 */
public class FXMLDatePickerController implements Initializable {

    @FXML
    private DatePicker fxDate;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fxDate.setValue(LocalDate.now());
        
        
    }    
    
}
