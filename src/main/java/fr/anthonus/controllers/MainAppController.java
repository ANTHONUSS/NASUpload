package fr.anthonus.controllers;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.MFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.DragEvent;
import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * MainAppController is the controller for the main application window.
 * It handles the file path input, drag-and-drop functionality.
 * The upload button opens a new window to view the progress of the upload.
 * @author ANTHONUS
 * @version 1.0
 */
public class MainAppController implements Initializable {
    /**
     * The text field for the file path input.
     */
    @FXML
    public MFXTextField filePathTextField;

    /**
     * The button to search for a file.
     * This button opens a file chooser dialog to select a file.
     */
    @FXML
    public MFXButton searchFileButton;

    /**
     * The button to toggle if the files is a permanent one or a temporary one.
     */
    @FXML
    public MFXToggleButton togglePermaFileButton;

    /**
     * The button to upload the file.
     * This button opens a new window to view the progress of the upload.
     */
    @FXML
    public MFXButton uploadButton;

    /**
     * The button to open the settings window.
     * This button opens a new window to view the settings of the application.
     */
    @FXML
    public MFXButton settingsButton;

    /**
     * This method is called when the windows open.
     * This set up a clip for the buttons to add a radius to the ripple animation.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setClipButton(uploadButton, 10);
        setClipButton(uploadButton, 10);
    }

    /**
     * This method is used to set a clip for the buttons to add a radius to the ripple animation.
     * @param button The button to set the clip for.
     * @param radius The radius of the clip.
     */
    private void setClipButton(MFXButton button, int radius) {
        Rectangle clip = new Rectangle();
        clip.setArcWidth(radius * 2);
        clip.setArcHeight(radius * 2);
        button.setClip(clip);
        button.layoutBoundsProperty().addListener((observable, oldValue, newValue) -> {
            clip.setWidth(newValue.getWidth());
            clip.setHeight(newValue.getHeight());
        });
    }


    // FILE PATH METHODS

    /**
     * This method is called when the user clicks the search file button.
     * It opens a file chooser dialog to select a file.
     * @param actionEvent The action event triggered by the button click.
     */
    @FXML
    public void onSearchFile(ActionEvent actionEvent) {
    }

    /**
     * This method is called when the user drop a file above the textField.
     * @param dragEvent The drag event triggered by the user.
     */
    @FXML
    public void onDragDropped(DragEvent dragEvent) {
    }

    /**
     * This method is called when the user drag a file above the textField.
     * @param dragEvent The drag event triggered by the user.
     */
    @FXML
    public void onDragEntered(DragEvent dragEvent) {
    }

    /**
     * This method is called when the user drag a file outside the textField.
     * @param dragEvent The drag event triggered by the user.
     */
    @FXML
    public void onDragExited(DragEvent dragEvent) {
    }

    /**
     * This method is called when the user drag a file above the textField.
     * @param dragEvent The drag event triggered by the user.
     */
    @FXML
    public void onDragOver(DragEvent dragEvent) {
    }


    // UPLOAD METHODS
    /**
     * This method is called when the user clicks the upload button.
     * It opens a new window to view the progress of the upload.
     * @param actionEvent The action event triggered by the button click.
     */
    @FXML
    public void onUploadButton(ActionEvent actionEvent) {
    }

    // SETTINGS METHODS
    /**
     * This method is called when the user clicks the settings button.
     * It opens a new window to view the settings of the application.
     * @param actionEvent The action event triggered by the button click.
     */
    @FXML
    public void onSettingsButton(ActionEvent actionEvent) {
    }
}
