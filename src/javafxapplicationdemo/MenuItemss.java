package javafxapplicationdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuItemss extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        MenuBar menubar = new MenuBar();
        root.setTop(menubar);
        Menu veg = new Menu("Vegetables");
        Menu han = new Menu("Handcrafts");
        Menu help = new Menu("Help");
        Menu cloth = new Menu("Clothes");
        Menu herbs = new Menu("Medicinal Herbs");
        menubar.getMenus().addAll(veg, han, cloth, herbs, help);
        MenuItem tomato = new MenuItem("Tomato");
        MenuItem cauli = new MenuItem("CauliFlower");
        SeparatorMenuItem seperator=new SeparatorMenuItem();
        MenuItem cabb = new MenuItem("Cabbage");
        MenuItem Bri = new MenuItem("Brinjal");
        MenuItem Radd = new MenuItem("Raddish");
        Menu sub = new Menu("Alignment");
        MenuItem left = new MenuItem("LEFT");
        MenuItem right = new MenuItem("RIGHT");
        MenuItem Center = new MenuItem("CENTER");
        sub.getItems().addAll(left, right, Center);
        veg.getItems().addAll(tomato, cauli, cabb, Bri, seperator,Radd, sub);

        left.setAccelerator(KeyCombination.keyCombination("Ctrl+L"));
        cauli.setAccelerator(KeyCombination.keyCombination("Ctrl+p"));
        right.setAccelerator(KeyCombination.keyCombination("Ctrl+R"));
        Center.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Menue Bar of Gramin Bazzar");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
