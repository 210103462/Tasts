package com.example.task5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class TAsk6 extends Application {
    @Override
    public void start(Stage primaryStage) {
        CarPane pane = new CarPane();

        pane.setOnMouseReleased(e -> pane.play());


        Scene scene = new Scene(pane, 600, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}
