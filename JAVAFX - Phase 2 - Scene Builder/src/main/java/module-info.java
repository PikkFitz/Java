module com.example.javafxphase2scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxphase2scenebuilder to javafx.fxml;
    exports com.example.javafxphase2scenebuilder;
}