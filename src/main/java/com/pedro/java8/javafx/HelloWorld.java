package com.pedro.java8.javafx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("Hello World");
        button.setOnAction (e -> System.out.println("Hello World : " + e.toString()));
        StackPane myPane = new StackPane();
        myPane.getChildren().add(button);
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}