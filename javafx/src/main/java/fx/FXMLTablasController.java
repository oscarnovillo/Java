/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import merchadona.modelo.Cajera;
import merchadona.modelo.Perecedero;
import merchadona.modelo.Producto;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLTablasController implements Initializable {

    private FXMLMenuController controller;

    @FXML
    private TableView<Producto> fxTabla;

    @FXML
    private ListView<Producto> fxList;

    @FXML
    private VBox fxVbox;

    @FXML
    private ListView<Cajera> fxListCajero;

    @FXML
    private void clickAddProducto(ActionEvent event) {
        this.controller.getMerchadona().darAltaProducto("hh", 89);

    }

    @FXML
    private void clickAddCesta(ActionEvent event) {

        Producto p = fxList.getSelectionModel().getSelectedItem();
        if (p == null) {
            p = fxTabla.getSelectionModel().getSelectedItem();
            p.setStock(10);

        }

        int error = this.controller.getMerchadona().venderProducto(
                1235,
                1, p);
        switch (error) {
            case 1:
                Alert a = new Alert(Alert.AlertType.INFORMATION, "STOCK INSUFICIENTE", ButtonType.CLOSE);

                a.showAndWait();
                break;
            case 2:
                a = new Alert(Alert.AlertType.INFORMATION, "Producto caducado", ButtonType.CLOSE);

                a.showAndWait();
                break;
        }
        cargarDatosLista();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        configTabla();
                

    }

    private void configTabla() {
        fxTabla.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("nombre"));
        fxTabla.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("stock"));
        TableColumn<Producto, LocalDateTime> caduca = new TableColumn<Producto, LocalDateTime>("Caduca");
        caduca.setCellValueFactory(new PropertyValueFactory<>("fecha_reposicion"));
        caduca.setCellFactory(column -> {
            return new TableCell<Producto, LocalDateTime>() {
                @Override
                protected void updateItem(LocalDateTime item, boolean empty) {
                    super.updateItem(item, empty);
                    DateTimeFormatter myDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {
                        // Format date.
                        setText(myDateFormatter.format(item));

                        // Style all dates in March with a different color.
                        if (getTableRow() != null && getTableRow().getItem() instanceof Perecedero) {
                            setTextFill(Color.CHOCOLATE);
                            setStyle("-fx-background-color: yellow");
                        } else {
                            setTextFill(Color.BLACK);
                            setText("no caduca");
                            setStyle("-fx-background-color: red");
                        }
                    }
                }
            };
        });

        fxTabla.getColumns().add(caduca);

    }

    public void cargarDatosLista() {
        fxList.getItems().clear();
        fxList.getItems().addAll(
                this.controller.getMerchadona().getProductos());

        fxListCajero.getItems().clear();
        fxListCajero.getItems().addAll(
                this.controller.getMerchadona().listaCajeras());

        fxTabla.getItems().clear();
        fxTabla.getItems().addAll(this.controller.getMerchadona().getProductos());

    }

    public void setController(FXMLMenuController controller) {
        this.controller = controller;
    }

//    public void modificarCelda(TableColumn<Modelo_Mensual, String> cedulas){ // columna de interes
//    cedulas.setCellFactory(new Callback<TableColumn<Modelo_Mensual, String>, TableCell<Modelo_Mensual, String>>(){ // cambiar el factor o como se va a comportar la celda
//        @Override
//        public TableCell<Modelo_Mensual, String> call(TableColumn<Modelo_Mensual, String> param) {
//
//            return new TableCell<Modelo_Mensual, String>(){
//                @Override
//                protected void updateItem(String item, boolean empty) {//actualizando la celda con los parametros de interes
//                    super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.
//
//                  if (item != null){ //esta es para asegurarse que haya informacion
//                        setStyle("-fx-background-color:#"+item); //y se coloca el estilo de fondo segun el color que mencione la celda
//                        //-fx-background-color:#f0f8ff //este es un ejemplo de como debe quedar.
//                 }
//
//                }
//            };
//        }
//    });
//}
    // Custom rendering of the table cell.
}
