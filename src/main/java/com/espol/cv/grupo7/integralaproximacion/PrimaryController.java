package com.espol.cv.grupo7.integralaproximacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;




public class PrimaryController implements Initializable {
    
    @FXML
    private TextField a_usr;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        a_usr.addEventHandler(KeyEvent.KEY_TYPED, event -> SoloNumerosEnteros(event));


    }
    public void SoloNumerosEnteros(KeyEvent keyEvent) {
    try{
        char key = keyEvent.getCharacter().charAt(0);

        if (!Character.isDigit(key))
            keyEvent.consume();

    } catch (Exception ex){ }
}

}
