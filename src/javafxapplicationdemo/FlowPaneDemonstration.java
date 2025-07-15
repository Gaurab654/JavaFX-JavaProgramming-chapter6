
package javafxapplicationdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FlowPaneDemonstration extends Application {
    
        @Override
    public void start(Stage p) 
    {
        FlowPane root=new FlowPane();
        Button B1=new Button("JAva");
        Button B2=new Button("CSS");
        B2.setPrefSize(50, 50);
        Button B3=new Button("Python");
        Button B4=new Button("c sharp");
        Button B5=new Button("OS");
        Button B6=new Button("OPERATING SYSTEM");
        Button B7=new Button("SSSS");
        Button B8=new Button("JAvascript");
        Button B9=new Button("HTML");
        root.getChildren().addAll(B1,B2,B3,B4,B5,B6,B7,B8,B9);
        root.setPadding( new Insets(40));
        root.setHgap(20);
        root.setVgap(20);
        Scene scene=new Scene(root,500,500);
        root.setStyle("-fx-background-color: red;");
        root.setAlignment(Pos.CENTER);
        root.setOrientation(Orientation.VERTICAL);
        
        p.setScene(scene);
        p.setTitle("FlowPane Demonstration in this code");
        p.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }


}
