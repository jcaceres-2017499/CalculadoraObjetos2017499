/*
 Nombre: Juan Pablo Caceres Enriquez
 Carne: 2017499
 Codigo Tecnico: IN5AV
 Fecha de creacion: 21/03/2022
 Fecha de modificacion:
 */
package org.juancaceres.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage ecsenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadorasVista.fxml"));
        
        Scene scene = new Scene(root);
        
        ecsenarioPrincipal.setScene(scene);
        ecsenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
