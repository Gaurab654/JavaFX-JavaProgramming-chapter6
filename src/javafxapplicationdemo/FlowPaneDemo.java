package javafxapplicationdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // horizontal spacing
        flowPane.setVgap(10); // vertical spacing
        flowPane.setPrefWrapLength(300); // max width before wrapping

        // Add multiple buttons to demonstrate wrapping
        for (int i = 1; i <= 40; i++) {
            Button button = new Button("Button " + i);
            flowPane.getChildren().add(button);
        }

        // Create a Scene
        Scene scene = new Scene(flowPane, 400, 300);

        // Set up the Stage
        primaryStage.setTitle("JavaFX FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
