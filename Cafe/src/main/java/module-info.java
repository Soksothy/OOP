module com.example.cafe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cafe to javafx.fxml;
    exports com.example.cafe;
}