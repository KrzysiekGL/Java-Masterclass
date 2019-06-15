package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    
    @FXML      //points to the fxml file in which textField element is stored
    private TextField textField;
    @FXML
    private Button helloButton;
    @FXML
    private Button secondButton;
    @FXML
    private CheckBox clearText;
    
    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        secondButton.setDisable(true);
    }
    
    @FXML
    public void onButtonClicked(ActionEvent event) {            //event - to determine which control was triggered (works as a ID of a element)
        if (event.getSource().equals(helloButton)) {
            System.out.println("Hello " + textField.getText());
        }
        else if (event.getSource().equals(secondButton)) {
            System.out.println("Second button was pressed.");
        }
        
//        //Example of not taking care of user event thread and bad user experience
//        try {
//            Thread.sleep(10000);
//        }
//        catch (InterruptedException exception) {
//            //we dont't care about this for now...
//        }
        
        if (clearText.isSelected()) {
            textField.clear();
            handleKeyReleased();
        }
    }
    
    @FXML
    public void handleKeyReleased() {
        String text = textField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();   //trim() is trimming blank characters
        helloButton.setDisable(disableButtons);
        secondButton.setDisable(disableButtons);
    }
    
    public void handleChange() {
        System.out.println("The checkbox is " + (clearText.isSelected() ? "selected" : "not selected"));
    }
    
}