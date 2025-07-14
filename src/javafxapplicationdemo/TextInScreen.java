package javafxapplicationdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextInScreen extends Application {

    @Override
    public void start(Stage stage) 
    {
     Group root=new Group();
     Text text=new Text();
     text.setText("Nepal in a landlock country having an area of 147181");
     text.setX(100);
     text.setY(100);
     text.setFont(Font.font("Times New Roman",50));
     text.setFill(Color.WHITE);
     text.setStroke(Color.YELLOW);//border of text
     text.setStrokeWidth(2);//width of border
     root.getChildren().add(text);
     Scene scene=new Scene(root,800,600,Color.RED);
     stage.setScene(scene);
     stage.show();
     stage.setTitle("Graphics Programming");
     
     
    }
    public static void main(String[] args) 
    {
        launch(args);
    }

}
