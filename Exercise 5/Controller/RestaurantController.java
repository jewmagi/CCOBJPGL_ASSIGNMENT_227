package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, imag2, img3, img4, img5; 

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    DeanAndDeluca deananddeluca = new DeanAndDeluca();
    Paul paul = new Paul();
    Soban soban = new Soban();
    Yabu yabu = new Yabu();
    TipsyPig tipsypig = new TipsyPig();


    public void initialize() {

        deananddeluca.setColor("Black");
        deananddeluca.setTaste("Appetizing");

        paul.setColor("Black");
        paul.setTaste("Appetizing");

        soban.setColor("Black");
        soban.setTaste("Appetizing");

        tipsypig.setColor("Red");
        tipsypig.setTaste("Appetizing");

        yabu.setColor("Yellow");
        yabu.setTaste("Appetizing");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("DeanAndDeluca are " + deananddeluca.getColor() + " and " + deananddeluca.getTaste());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Paul are " + paul.getColor() + " and " + paul.getTaste());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Soban are " + soban.getColor() + " and " + soban.getTaste());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("TipsyPig are " + tipsypig.getColor() + " and " + tipsypig.getTaste());
        }

        if  (sourceButton.equals(btn5)) {
            alert.setContentText("Yabu are " + yabu.getColor() + " and " + yabu.getTaste());
        }

        alert.showAndWait();

    }
}
