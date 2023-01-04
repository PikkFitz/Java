module com.example.phase1introduction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phase1introduction to javafx.fxml;
    exports com.example.phase1introduction;
}