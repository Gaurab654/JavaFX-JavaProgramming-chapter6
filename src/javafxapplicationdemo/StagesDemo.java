package javafxapplicationdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StagesDemo extends Application {
    @Override
    public void start(Stage stage) {
        // Create a label and manually position it
        Label label = new Label("Press 'Q' to exit full screen");
        label.setLayoutX(200); // X position from left
        label.setLayoutY(200); // Y position from top

        // Add the label to a Group
        Group root = new Group(label);

        // Create a scene with background color
        Scene scene = new Scene(root, 600, 400, Color.BLACK);

        stage.setScene(scene);
        stage.setTitle("Nepal is a landlocked country");

        // Full screen settings
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Q to exit full screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));

        // Optional (ignored in full screen)
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setX(50);
        stage.setY(50);
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
