
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();

        // Add 40 buttons
        Button b1 = new Button("Button 1");
        b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setFillWidth(b1, true);
        GridPane.setFillHeight(b1, true);
        Button b2 = new Button("Button 2");
        b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");
        root.add(b1, 0, 0, 2, 2);
        root.add(b2, 2, 0, 1, 1);
        root.add(b3, 2, 1, 1, 1);
        root.add(b4, 0, 2, 1, 1);
        root.add(b5, 1, 2, 1, 1);
        root.add(b6, 2, 2, 1, 1);

        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 800, 200);
        stage.setScene(scene);
        stage.setTitle("GridPane");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
