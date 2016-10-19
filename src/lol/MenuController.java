package lol;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class MenuController implements Initializable {
	
    @FXML
    private VBox vbox;

    @FXML
    private JFXButton chatGeneralButton;

    @FXML
    private JFXButton chatpriveButton;

    @FXML
    private JFXButton groupesButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 

}
