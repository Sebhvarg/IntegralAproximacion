/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.cv.grupo7.integralaproximacion;

import java.io.IOException;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author sebas
 */
public class Configuracion {
    static final String TITULO = "Aproximación de Integral";
    static final String RUTA_ICONO = "/com/espol/cv/grupo7/integralaproximacion/img/LogoCubo.png";
    static final Image ICONO = new Image(Configuracion.class.getResourceAsStream(RUTA_ICONO));
    
    static void configuracionVentana(Stage stage) throws IOException{
        stage.setTitle(TITULO);
        stage.getIcons().add(ICONO);
        stage.setMinWidth(900);
        stage.setMinHeight(800);
        stage.setResizable(false);
    }
    
}
