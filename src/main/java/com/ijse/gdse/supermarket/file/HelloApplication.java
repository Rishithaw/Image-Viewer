package com.ijse.gdse.supermarket.file;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Open Image");

        // Create an ImageView
        ImageView imageView = new ImageView();
        imageView.setFitWidth(400); // Set preferred width
        imageView.setFitHeight(300); // Set preferred height
        imageView.setPreserveRatio(true); // Preserve aspect ratio

        // Button action to open file chooser
        button.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                // Load and display the image
                Image image = new Image(file.toURI().toString());
                imageView.setImage(image);
            }
        });

        // Create a layout and add components
        VBox vbox = new VBox(10, button, imageView);
        vbox.setStyle("-fx-padding: 10; -fx-alignment: center;");

        // Set up the scene
        Scene scene = new Scene(vbox, 450, 350);
        primaryStage.setTitle("Image Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
