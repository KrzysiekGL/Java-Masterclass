package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    
    @FXML      //points to the fxml file in which textField element is stored
    private TextField textField;
    @FXML
    private Button helloButton;
    @FXML
    private Button secondButton;
    
    @FXML
    public void onButtonClicked(ActionEvent event) {            //event - to determine which control was triggered
        System.out.println("Hello " + textField.getText());
        System.out.println("The following button was pressed: " + event.getSource());
        textField.setText("");
    }
    
}