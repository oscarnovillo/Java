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
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import merchadona.modelo.Empleado;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLSceneController implements Initializable {

    private FXMLMenuController controller;

    @FXML
    private TextField fxUser;

    @FXML
    ImageView fxImage;

    @FXML
    private void handleLoginAction(ActionEvent event) throws IOException {

        //this.controller.getHostServices().showDocument("http://www.marca.es");
        Alert a = new Alert(Alert.AlertType.ERROR, "El numero no es valido", ButtonType.CLOSE);
        //final Stage stage = (Stage) fxUser.getScene().getWindow();
        //a.initOwner(stage);
        //a.showAndWait();
        try {
            // mirar varaib le de login
            int empleadoID = Integer.parseInt(fxUser.getText());

            //Empleado emp = this.controller.getMerchadona().login(empleadoID);
            switch (this.controller.getMerchadona().tipoEmpleado(empleadoID)) {
                case 1:
                    this.controller.habilitaMenuAdmin();
                    break;
                case 2:
                    this.controller.habilitaMenuReponedor();
                    break;
                case 3:
                    this.controller.habilitaMenuCajero();
                    break;
                case 0:
                    a.setContentText("id de usuario no valido");
                    a.showAndWait();
                    break;
            }

        } catch (Exception e) {
            a.setContentText("el id no es un número");
            a.showAndWait();
        }
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
        String path = "http://e00-marca.uecdn.es/assets/multimedia/imagenes/2018/04/01/15225728505778_150x0.jpg";

        Image image
                = new Image(getClass().getResourceAsStream("/images/image.jpg"));

        fxImage.setImage(image);

        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                int seg=0;
                try{
                        seg = Integer.parseInt(fxUser.getText());
                }
                catch(Exception e)
                {
                    seg = 0;
                }
                seg++;
                fxUser.setText(seg+"");
            }
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();

    }

    public void setController(FXMLMenuController controller) {
        this.controller = controller;
    }

}
