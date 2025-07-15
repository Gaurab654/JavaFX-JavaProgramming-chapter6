
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ComponentsInJaav extends Application 
{

    @Override
    public void start(Stage primaryStage) 
    {

        HBox root = new HBox(10);
        root.setPadding(new Insets(10));
        Label label = new Label("Label in Center");
        TextField textField=new TextField();
        textField.setPromptText("Enter your name:::");
        textField.setFocusTraversable(false);
        PasswordField pass=new PasswordField();
        pass.setPromptText("Enter your password..");
        pass.setFocusTraversable(false);
        TextArea area=new TextArea();
       area.setWrapText(true);
       area.setFont(Font.font(10));
       area.setText("please enter your address:");
       area.setEditable(false);
       area.appendText("This is my new text1");
       root.setSpacing(10);
       CheckBox check=new CheckBox("Pizza");
       check.setFont(Font.font(20));
       CheckBox c2=new CheckBox("Burger");
       c2.setFont(Font.font(20));
       CheckBox c3=new CheckBox("Chowmein");
       c3.setFont(Font.font(20));
       Label label1=new Label("Select your Food");
       RadioButton r1=new RadioButton("Pizza");
       RadioButton r2=new RadioButton("Burger");
       RadioButton r3=new RadioButton("Pasta");
       ToggleGroup group=new ToggleGroup();
       r1.setToggleGroup(group);
       r2.setToggleGroup(group);
       r3.setToggleGroup(group);
     
       Label label2=new Label("you have selected");
        root.getChildren().addAll(pass,area,check,c2,c3,label1,r1,r2,r3,label2);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("components in java fx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
