package pl.pkrysztofiak.controlsshowcase.icon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class IconShowcase extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Hello");
        button.setGraphic(new Icon("m 5.8528867,11.731844 c 1.1471133,0 2.2160149,-0.33892 3.1154557,-0.912477 L 12.148976,14 14,12.148976 10.819367,8.981378 C 11.392924,8.0689016 11.731844,7.0130356 11.731844,5.8659214 11.731844,2.6201117 9.111732,0 5.8659214,0 2.6201117,0 0,2.6201117 0,5.8659214 0,9.111732 2.6201117,11.731844 5.8528867,11.731844 Z m 0.013035,-9.1247677 c 1.7988834,0 3.2588461,1.4599626 3.2588461,3.2588451 0,1.7988834 -1.4599627,3.2588462 -3.2588461,3.2588462 -1.7988825,0 -3.2588451,-1.4599628 -3.2588451,-3.2588462 0,-1.7988825 1.4599626,-3.2588451 3.2588451,-3.2588451 z"));
        button.setStyle("-fx-font-size: 4em");

        stage.setScene(new Scene(new StackPane(button), 400, 400));
        stage.show();
    }
}