import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;//event handling
import javafx.event.EventHandler;//event Handling
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ButtonDemo extends Application implements EventHandler<ActionEvent>
{

    @Override
    public void start(Stage primaryStage) {
        

        BorderPane root = new BorderPane();
        Button B1=new Button("Sa_ve");
        B1.setFont(Font.font("Arial",FontWeight.BOLD,18));
        B1.setOnAction(this);
        root.setCenter(B1); // Places the label in the center

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("BUTTON DEMO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
            @Override
        public void handle(ActionEvent e)
        {
          //
            System.out.println("Saved Button Pressed");
             Platform.exit();
        }
        

    public static void main(String[] args) {
        launch(args);
    }

    
}
