
import javafx.geometry.Insets;  // ✅ CORRECT
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        
        Button top = new Button("Top");
        BorderPane.setAlignment(top, Pos.CENTER);
    //    top.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button left = new Button("Left");
        BorderPane.setAlignment(left, Pos.CENTER);
      //  left.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bottom = new Button("Bottom");
        BorderPane.setAlignment(bottom, Pos.CENTER);
      //  bottom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button right = new Button("Right");
        BorderPane.setAlignment(right, Pos.CENTER);
      //  right.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button center = new Button("Center");
        BorderPane.setAlignment(center, Pos.CENTER);
     //   center.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.setTop(top);
        root.setLeft(left);
        root.setBottom(bottom);
        root.setRight(right);
        root.setCenter(center);
         root.setPadding(new Insets(10,10,10,10));
         
         

        Scene scene = new Scene(root, 600,400);
        primaryStage.setTitle("BorderPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
