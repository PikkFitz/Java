module com.example.javafxphase2additionneur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxphase2additionneur to javafx.fxml;
    exports com.example.javafxphase2additionneur;
}