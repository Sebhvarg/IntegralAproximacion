package com.espol.cv.grupo7.integralaproximacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import org.scilab.forge.jlatexmath.ParseException;





public class PrimaryController implements Initializable {

    @FXML
    private TextField a;
    @FXML
    private TextField intervalos;
    @FXML
    private Button btnCalcular;
    @FXML
    private Label respuesta;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        a.addEventHandler(KeyEvent.KEY_TYPED, event -> SoloNumerosEnteros(event));
        intervalos.addEventHandler(KeyEvent.KEY_TYPED, event -> SoloNumerosEnteros(event));
        btnCalcular.setOnAction(this::capturar);
        
        

    }
    
    public void SoloNumerosEnteros(KeyEvent keyEvent) {
    try{
        char key = keyEvent.getCharacter().charAt(0);

        if (!Character.isDigit(key))
            keyEvent.consume();

    } catch (Exception ex){ }
}
   
    @FXML
    public void capturar(ActionEvent event){
        
        int valorA = Integer.parseInt(a.getText());
        
        int valorN = Integer.parseInt(intervalos.getText());
        
        
        double aproximacion = Calculo.SumaDeRienman(valorA, valorN);
        
        String r = Double.toString(aproximacion);
        
        respuesta.setText(r);
        
        
        
    }

}
