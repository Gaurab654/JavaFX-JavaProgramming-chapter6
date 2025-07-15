
package javafxapplicationdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class HboxDemo extends Application {
    
        @Override
    public void start(Stage p) 
    {
        HBox root=new HBox();
        Button B1=new Button("JAva");
        Button B2=new Button("CSS");
        Button B3=new Button("Python");
        Button B4=new Button("c sharp");
        Button B5=new Button("OS");
        Button B6=new Button("OPERATING SYSTEM");
        Button B7=new Button("SSSS");
        Button B8=new Button("JAvascript");
        Button B9=new Button("HTML");
        B1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        B9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.getChildren().addAll(B1,B2,B3,B4,B5,B6,B7,B8,B9);
        root.setHgrow(B1,Priority.ALWAYS);
        root.setSpacing(10);//space in cell
        root.setPadding(new Insets(10));//
        Scene scene=new Scene(root,400,200);
        
        p.setScene(scene);
        p.setTitle("FlowPane Demonstration in this code");
        p.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }


}
