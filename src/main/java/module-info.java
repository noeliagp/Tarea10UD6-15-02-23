module com.example.tarea10ud6150223 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens com.example.tarea10ud6150223 to javafx.fxml;
    exports com.example.tarea10ud6150223;
}