package lol;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ThreadClient extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		final URL fxmlURL = getClass().getResource("Vue.fxml"); 
		final FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL); 
		fxmlLoader.setController(new ControllerLogin()); 
	        Parent root = fxmlLoader.load();
	        Scene scene = new Scene(root);
	        
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Indentification Chat");
	        primaryStage.show();
	    
	}

	public static void main(String[] args) {
		launch(args);
	}
}
