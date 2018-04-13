/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.main.controllers;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLNautilusController implements Initializable {

    @FXML
    private ListView<File> fxFiles;
    @FXML
    private Label fxRutaActual;

    private String rutaActual;

    @FXML
    public void handleMouseClick(MouseEvent event) {
        if (event.getClickCount() > 1) {
            File seleccionado
                    = fxFiles.getSelectionModel().getSelectedItem();
            boolean b = Files.isReadable(Paths.get(seleccionado.getAbsolutePath()));
            if (b){
            fxRutaActual.setText(seleccionado.getAbsolutePath());
            cargarFiles();
            }
            else
            {
                Alert a = new Alert(Alert.AlertType.ERROR, "No puedes leer este directorio", ButtonType.CLOSE);
                a.showAndWait();
            }
        }
        
    }

    @FXML
    public void handleSubir(ActionEvent event) {

        File actual = new File(fxRutaActual.getText());

        fxRutaActual.setText(actual.getParent());
        cargarFiles();

    }

    @FXML
    public void handleEntrar(ActionEvent event) {

        File seleccionado
                = fxFiles.getSelectionModel().getSelectedItem();

        fxRutaActual.setText(seleccionado.getAbsolutePath());
        cargarFiles();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rutaActual = "c:\\";
        fxRutaActual.setText(rutaActual);
        fxFiles.setCellFactory(list -> new ListCell<File>() {

            @Override
            protected void updateItem(File item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item.getName());
                    if (item.isDirectory()) {
                        setStyle("-fx-text-fill:red;-fx-background-color:yellow");
                        
                    }
                    else
                    {
                        
                        setStyle("-fx-text-fill:black;");
                    }
                }
            }
        });
        cargarFiles();

        // TODO
    }

    private void cargarFiles() {
        File f = new File(fxRutaActual.getText());
        fxFiles.getItems().clear();
        fxFiles.getItems().addAll(f.listFiles());
    }
}
