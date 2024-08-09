module com.espol.cv.grupo7.integralaproximacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.espol.cv.grupo7.integralaproximacion to javafx.fxml, javafx.base;
    exports com.espol.cv.grupo7.integralaproximacion;
}
