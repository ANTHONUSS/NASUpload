package fr.anthonus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class for the NASUpload application.
 * This class is responsible for launching the JavaFX application.
 * It loads the main FXML file and sets up the primary stage.
 *
 * @author ANTHONUS
 * @version 1.0
 */
public class Main extends Application {
    /**
     * The main method is the entry point of the JavaFX application.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Starts the JavaFX application.
     * Loads the main FXML file and sets up the primary stage.
     *
     * @param stage The primary stage for this application.
     * @throws Exception If an error occurs during loading the FXML file.
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/MainApp.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("NASUpload");
        stage.setResizable(false);
        stage.show();
    }
}