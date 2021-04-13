module org.openjfx.loginprojektifx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.loginprojektifx to javafx.fxml;
    exports org.openjfx.loginprojektifx;
}