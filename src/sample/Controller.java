package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textfield;

    public void handleclick(ActionEvent actionEvent) {
        textfield.setText("Naciśnięto przycisk!");
    }
}




