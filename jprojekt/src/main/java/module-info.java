module com.example.jprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jprojekt to javafx.fxml;
    exports com.example.jprojekt;
}