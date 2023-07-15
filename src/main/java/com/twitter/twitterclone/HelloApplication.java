package com.twitter.twitterclone;

import com.twitter.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Hello World");
        configRoute();
        FXRouter.goTo("hello");
    }

    public static void configRoute()
    {
        String viewPath = "com/twitter/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}