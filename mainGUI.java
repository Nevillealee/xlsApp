import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;



//class for creating main display that takes excel files to be manipulated in program
public class mainGUI extends Application {
		
	@Override 
	public void start(Stage primaryStage){	
		Pane pane = new HBox(100); 
		Button select = new Button("SELECT"); //create button
		pane.getChildren().add(select, 100, 75); //add button to HBOX
		Scene scene1 = new Scene(pane, 450, 300); // create scene and add HBOX 
		primaryStage.setTitle("Excel file transfer"); // Set the stage title
		primaryStage.setScene(scene1); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	//main method isnt need to launch program****
	public static void main(String[] args) {
		Application.launch(args);
	} 
}

	