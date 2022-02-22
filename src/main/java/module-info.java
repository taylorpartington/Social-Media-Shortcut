module com.taylorpartington.sociallmediashortcut {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.taylorpartington.sociallmediashortcut to javafx.fxml;
    exports com.taylorpartington.sociallmediashortcut;
}