package com.espol.cv.grupo7.integralaproximacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class CalculoController implements Initializable {

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
        btnCalcular.setDisable(true);         
        bloqueoDeLetras(a, intervalos);
        habilitarBoton(a, intervalos, btnCalcular);
        btnCalcular.setOnAction(this::capturar);
    }
    
    
    public void soloNumerosEnteros(KeyEvent keyEvent) {
    try{
        char key = keyEvent.getCharacter().charAt(0);
        if (!Character.isDigit(key))                 
            keyEvent.consume();
    } catch (Exception ex){ System.out.print(ex.getMessage());}
}
    
    public void bloqueoDeLetras(TextField a, TextField intervalos){
        a.addEventHandler(KeyEvent.KEY_TYPED, event -> soloNumerosEnteros(event));
        intervalos.addEventHandler(KeyEvent.KEY_TYPED, event -> soloNumerosEnteros(event));
    }
    
    public void habilitarBoton(TextField a, TextField intervalos, Button btnCalcular){
        ChangeListener<String> listener;
        listener = (observable, oldValue, newValue) -> {
            boolean rango = Integer.parseInt(a.getText()) >= 1 && Integer.parseInt(intervalos.getText()) >= 5;
            boolean camposLlenos = !a.getText().trim().isEmpty() && !intervalos.getText().trim().isEmpty();
            boolean habilitar = rango && camposLlenos;
            btnCalcular.setDisable(!habilitar);
        };
        comprobarCampos(a, intervalos, listener);
    }
    
    void comprobarCampos(TextField a, TextField intervalos, ChangeListener<String> listener){
        a.textProperty().addListener(listener);
        intervalos.textProperty().addListener(listener);
    }
   
    @FXML
    public void capturar(ActionEvent event){
        int valorA = Integer.parseInt(a.getText());
        int valorN = Integer.parseInt(intervalos.getText());
        double aproximacion = Calculo.SumaDeRienman(valorA, valorN);
        String resultado = Double.toString(aproximacion);
        respuesta.setText(resultado);
    }

}
