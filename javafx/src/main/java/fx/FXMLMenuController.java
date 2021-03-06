/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import fx.constantes.Constantes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import merchadona.modelo.Empleado;
import merchadona.servicios.Merchadona;

/**
 * FXML Controller class
 *
 * @author oscar
 */
public class FXMLMenuController implements Initializable {

    private AnchorPane scene;
    private AnchorPane scene2;
    private AnchorPane tabla;
    private FXMLTablasController controllerT;

    private Merchadona merchadona;
    private Empleado empleadoActual;
    private int empleadoID;

    @FXML
    private MenuBar fxMenu;

    @FXML
    private Menu fxAdmin;

    @FXML
    private BorderPane fxRoot;

    @FXML
    public void handleScene1(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
          getClass().getResource(Constantes.PANTALLA_SCENE));
        AnchorPane scene = loader.load();
        FXMLSceneController controller = loader.getController();
        controller.setController(this);

        fxMenu.setVisible(false);
        fxRoot.setCenter(scene);
    }

    @FXML
    public void handleScene2(ActionEvent event) throws IOException {

        fxRoot.setCenter(scene2);
    }

    @FXML
    public void handleSceneTablas(ActionEvent event) throws IOException {
        controllerT.cargarDatosLista();
        fxRoot.setCenter(tabla);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO

            merchadona = new Merchadona();
            FXMLLoader loader = new FXMLLoader(
              getClass().getResource(Constantes.PANTALLA_SCENE));
            scene = loader.load();
            FXMLSceneController controller = loader.getController();
            controller.setController(this);

            
            loader = new FXMLLoader(
              getClass().getResource(Constantes.PANTALLA_SCENE_NEW));
            scene2 = loader.load();
            FXMLSceneNewController controllerNew = loader.getController();
            controllerNew.setController(this);

            loader = new FXMLLoader(
              getClass().getResource(Constantes.PANTALLA_TABLAS));
            tabla = loader.load();
            controllerT = loader.getController();
            controllerT.setController(this);

        } catch (IOException ex) {
            Logger.getLogger(FXMLMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

        fxMenu.setVisible(false);
        fxRoot.setCenter(scene);

    }

    public MenuBar getFxMenu() {
        return fxMenu;
    }



    public Merchadona getMerchadona() {
        return merchadona;
    }

    public Empleado getEmpleadoActual() {
        return empleadoActual;
    }

    public void setEmpleadoActual(Empleado empleadoActual) {
        this.empleadoActual = empleadoActual;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public HostServices getHostServices() {
        return (HostServices) ((Stage) this.fxRoot.getScene().getWindow()).getProperties().get("hostServices");
    }

    public void habilitaMenuAdmin() {
        fxMenu.setVisible(true);
        fxAdmin.setVisible(true);
        
        fxRoot.setCenter(tabla);
        controllerT.cargarDatosLista();
        
    }
     public void habilitaMenuReponedor() {
        fxMenu.setVisible(true);
        fxAdmin.setVisible(false);
        fxRoot.setCenter(scene2);       
    }
    
     public void habilitaMenuCajero() {
        fxMenu.setVisible(true);
        fxAdmin.setVisible(false);
        fxRoot.setCenter(scene2);       
    }
}
