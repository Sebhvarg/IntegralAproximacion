package com.espol.cv.grupo7.integralaproximacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static final String RUTA_CSS = "/com/espol/cv/grupo7/integralaproximacion/estilos/estilos.css";

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("calculoController"));
        Configuracion.configuracionVentana(stage);
        stage.setScene(scene);
        stage.show();
    }
    
    public void configuración(Stage stage){
        scene.getStylesheets().add(RUTA_CSS);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(); 
    }

}