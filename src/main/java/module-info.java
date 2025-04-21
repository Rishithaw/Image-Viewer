module com.ijse.gdse.supermarket.file {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ijse.gdse.supermarket.file to javafx.fxml;
    exports com.ijse.gdse.supermarket.file;
}