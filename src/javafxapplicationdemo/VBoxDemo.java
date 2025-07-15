
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10); // spacing = 10 pixels between buttons

        // Add 40 buttons
        for (int i = 1; i <= 10; i++) {
            Button btn = new Button("Btn " + i);
            root.getChildren().add(btn);
            btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        }
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 800, 200);
        stage.setScene(scene);
        stage.setTitle("HBox with 40 Buttons");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
