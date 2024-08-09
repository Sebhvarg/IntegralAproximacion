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
    private static final String TITULO = "Aproximación de Integral";
    private static final String RUTA_ICONO = "/com/espol/cv/grupo7/integralaproximacion/img/LogoCubo.png";
    private final Image ICONO = new Image(getClass().getResourceAsStream(RUTA_ICONO));
    private static final String RUTA_CSS = "/com/espol/cv/grupo7/integralaproximacion/estilos/estilos.css";
    //h

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        configuracionVentana(stage);
        stage.setScene(scene);
        stage.show();
    }
    public void configuracionVentana(Stage stage) throws IOException{
        stage.setMaximized(true);
        stage.setTitle(TITULO);
        stage.getIcons().add(ICONO);
        stage.setMinWidth(900);
        stage.setMinHeight(800);
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