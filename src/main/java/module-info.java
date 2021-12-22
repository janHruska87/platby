module com.example.platby {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.platby to javafx.fxml;
    exports com.example.platby;
}