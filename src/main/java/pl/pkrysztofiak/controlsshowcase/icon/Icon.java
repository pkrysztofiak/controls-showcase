package pl.pkrysztofiak.controlsshowcase.icon;

import javafx.scene.Group;
import javafx.scene.shape.SVGPath;

public class Icon extends Group {

    private final SVGPath svgPath = new SVGPath();

    public Icon(String path) {
        getStylesheets().add(Icon.class.getResource("icon.css").toExternalForm());
        svgPath.getStyleClass().add("icon");

        svgPath.setContent(path);
        getChildren().add(svgPath);
    }
}