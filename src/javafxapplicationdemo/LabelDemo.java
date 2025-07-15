import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LabelDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Label in Center");

        BorderPane root = new BorderPane();
        root.setCenter(label); // Places the label in the center

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("BorderPane Label Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
