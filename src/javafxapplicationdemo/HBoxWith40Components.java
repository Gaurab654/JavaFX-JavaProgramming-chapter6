import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxWith40Components extends Application {

    @Override
    public void start(Stage stage) {
        HBox root = new HBox(10); // spacing = 10 pixels between buttons

        // Add 40 buttons
        for (int i = 1; i <= 10; i++) {
            Button btn = new Button("Btn "+i);
            root.getChildren().add(btn);
        }

        Scene scene = new Scene(root, 800, 200);
        stage.setScene(scene);
        stage.setTitle("HBox with 40 Buttons");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
