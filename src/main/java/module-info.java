module fr.esgi.tusmo {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.esgi.tusmo to javafx.fxml;
    exports fr.esgi.tusmo;
}