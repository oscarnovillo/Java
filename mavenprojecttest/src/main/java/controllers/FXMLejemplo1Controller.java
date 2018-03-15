/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import modelo.Cliente;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLejemplo1Controller implements Initializable {

    List<Cliente> clientes;
    private int indice;

    
    @FXML
    private TextField fxCajaTexto;
    
    @FXML
    private Button fxBotonHola;
    
    private String mensaje="hhhhhh";
    
    @FXML
    private void handleLoginAction(ActionEvent event) throws IOException {
        indice++;
        fxCajaTexto.setText(""+clientes.get(indice).getEdad());
       Cliente c = new Cliente();
       c.setNombre(fxCajaTexto.getText());
       c.setEdad(Integer.parseInt(fxCajaTexto.getText()));
       clientes.add(c);
        
//        Alert a = new Alert(Alert.AlertType.INFORMATION, mensaje, 
//          ButtonType.CLOSE);
//       
//        a.showAndWait();
       
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clientes = new LinkedList<>();
        clientes.add(new Cliente("pepe",14));
        clientes.add(new Cliente("juan",14));
        indice = 0;
        fxCajaTexto.setText(clientes.get(indice).getNombre());
    }    
    
}
