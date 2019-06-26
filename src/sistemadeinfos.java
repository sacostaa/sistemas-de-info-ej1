
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class sistemadeinfos extends Application{
    
    
TextField tnombre = new TextField();
TextField tapellido = new TextField();
TextField tgenero = new TextField();
    @Override
    public void start(Stage stage) throws Exception {
        
 VBox layoutprincipal = new VBox();
 HBox layoutfila1 = new HBox();
 HBox layoutfila2 = new HBox();
 HBox layoutfila3 = new HBox();
 VBox columna1 = new VBox();
 VBox columna2 = new VBox();
 Label lnombre = new Label("Nombre");
 Label v1 = new Label(" ");
 Label v2 = new Label(" ");
 Label lapellido = new Label("Apellido");
 Label genero = new Label("Genero");
 this.tnombre = new TextField();
 this.tapellido = new TextField();
 this.tgenero = new TextField();
 ToggleGroup grupo = new ToggleGroup();
 RadioButton r1 =  new RadioButton("Masculino");
 RadioButton r2 =  new RadioButton("Femenino");
 RadioButton r3 =  new RadioButton("Otro");
 TableView tabla = new TableView();
 tabla.setEditable(true);
 TableColumn x = new TableColumn("Nombre");
 TableColumn y = new TableColumn("Apellido");
 TableColumn z = new TableColumn("Genero");
 tabla.getColumns().addAll(x,y,z);
 
 
 layoutfila1.getChildren().add(lnombre);
 layoutfila1.getChildren().add(tnombre);
 layoutfila2.getChildren().add(lapellido);
 layoutfila2.getChildren().add(tapellido);
 layoutfila3.getChildren().add(genero);
 columna1.getChildren().add(r1);
 columna1.getChildren().add(r2);
 columna1.getChildren().add(r3);
 columna2.getChildren().add(v1);
 columna2.getChildren().add(v2);
 columna2.getChildren().add(tgenero);
 Button ingresar = new Button ("ingresar");
 layoutprincipal.getChildren().add(layoutfila1);
 layoutprincipal.getChildren().add(layoutfila2);
 
layoutfila3.getChildren().add(columna1);
layoutfila3.getChildren().add(columna2);
layoutprincipal.getChildren().add(layoutfila3);
layoutprincipal.getChildren().add(tabla);
layoutprincipal.getChildren().add(ingresar);
Evento evento = new Evento();
ingresar.setOnAction(evento);

Scene scene = new Scene(layoutprincipal, 200, 100);
stage.setTitle("hola");
stage.setScene(scene);
stage.show();
    }
    private class Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            System.out.println(tnombre.getText());
            System.out.println(tapellido.getText());
            System.out.println(tgenero.getText());
        }
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    }


