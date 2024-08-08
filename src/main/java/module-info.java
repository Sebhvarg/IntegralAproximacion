module com.espol.cv.grupo7.integralaproximacion {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.espol.cv.grupo7.integralaproximacion to javafx.fxml;
    exports com.espol.cv.grupo7.integralaproximacion;
}
