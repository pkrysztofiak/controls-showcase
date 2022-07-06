package pl.pkrysztofiak.controlsshowcase.textfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.function.UnaryOperator;

public class FilterInputShowcase extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getControlNewText();

            if (text.matches("[-\\d]*")) {
                return change;
            }
            return null;
        };
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);

        TextField textField = new TextField();
        textField.setTextFormatter(textFormatter);

        StackPane stackPane = new StackPane(textField);
        stage.setScene(new Scene(stackPane));
        stage.show();
    }
}