package lk.ijse.culinarySystem.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class LoginController {

    public ImageView leftPane;


    public AnchorPane mainAnchorPane;
    public VBox rightPane;

    @FXML
    public void initialize() {
        Circle clipCircle = new Circle(150, 150, 100); // centerX, centerY, radius
       mainAnchorPane.setClip(clipCircle);
    }
}
