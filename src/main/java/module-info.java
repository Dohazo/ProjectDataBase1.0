module com.example.projectdatabase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectdatabase to javafx.fxml;
    exports com.example.projectdatabase;
}