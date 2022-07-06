module pl.pkrysztofiak.controlsshowcase {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.pkrysztofiak.controlsshowcase to javafx.fxml;
    opens pl.pkrysztofiak.controlsshowcase.textfield to javafx.fxml;
    exports pl.pkrysztofiak.controlsshowcase;
    exports pl.pkrysztofiak.controlsshowcase.textfield;
    exports pl.pkrysztofiak.controlsshowcase.icon;
}