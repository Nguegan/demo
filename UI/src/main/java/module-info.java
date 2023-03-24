module com.example.ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires GemeinscaftDB;

    opens com.example.ui to javafx.fxml;
    exports com.example.ui;
}