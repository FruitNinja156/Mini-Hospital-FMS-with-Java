package sample;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ImageView exit, menu;
    @FXML
    private AnchorPane pane1, pane2;
    @FXML
    private StackPane content_Area;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        pane1.setVisible(false);
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5), pane1);
        fadeTransition.setFromValue(1);
        fadeTransition.setFromValue(0);
        fadeTransition.play();

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5), pane2);
        translateTransition.setByX(-600);
        translateTransition.play();

        menu.setOnMouseClicked(event -> {
            pane1.setVisible(true);
            FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5), pane1);
            fadeTransition1.setFromValue(0.15);
            fadeTransition1.setFromValue(0.65);
            fadeTransition1.play();

            TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.5), pane2);
            translateTransition1.setByX(+600);
            translateTransition1.play();
        });

        pane1.setOnMouseClicked(event -> {
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(0.5), pane1);
            fadeTransition2.setFromValue(1);
            fadeTransition2.setFromValue(0);
            fadeTransition2.play();

            fadeTransition2.setOnFinished(event1 -> {
                pane1.setVisible(false);
            });
            TranslateTransition translateTransition2 = new TranslateTransition(Duration.seconds(0.5), pane2);
            translateTransition2.setByX(-600);
            translateTransition2.play();
        });
    }
    public void page1 (ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page1.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
    public void page6 (ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page6.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
    public void page3 (ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page3.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
    public void page4 (ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page4.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
    public void page5 (ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page5.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
}
