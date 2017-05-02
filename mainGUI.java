import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import java.awt.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JFileChooser;
import java.lang.Object;



//class for creating main display that takes excel files to be manipulated in program
public class mainGUI extends Application {
		
	@Override 
	public void start(Stage primaryStage){	
		Pane pane = new HBox(100); 
		Button select = new Button("Choose File"); //create button  [link to JFileChooser from email link. xls files only?]
		pane.getChildren().add(select); //add button to HBOX
		Scene scene1 = new Scene(pane, 450, 300); // create scene and add HBOX 
		primaryStage.setTitle("Excel file transfer"); // Set the stage title
		primaryStage.setScene(scene1); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		//create action handler object
		OKHandlerClass handler1 = new OKHandlerClass();
		//call action handler method
		select.setOnAction(handler1);
			
		
		
	}
	
	//main method isnt need to launch program****
	public static void main(String[] args) {
		Application.launch(args);
	} 

}
//handles slect button being clicked
class OKHandlerClass implements EventHandler<ActionEvent> {
 @Override
public void handle(ActionEvent e) {


}
