package pl.pkrysztofiak.controlsshowcase.textfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHitEndShowcase extends Application {

    private final Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        textField.textProperty().addListener((observableValue, oldText, text) ->  {
            Matcher matcher = pattern.matcher(text);
            boolean matches = matcher.matches();
            boolean hitEnd = matcher.hitEnd();
            System.out.println("text: " + text + " matches: " + matches + ", hitEnd: " + hitEnd);
            if (matches) {
                System.out.println("ok");
                textField.setStyle("");
            } else if (hitEnd) {
                System.out.println("type ahead");
                textField.setStyle("");
            } else {
                System.out.println("incorrect");
                textField.setStyle("-fx-text-fill: red;");
            }
        });
        HBox hBox = new HBox(textField);

        StackPane stackPane = new StackPane(hBox);
        stage.setScene(new Scene(stackPane, 400, 400));
        stage.show();
    }
}