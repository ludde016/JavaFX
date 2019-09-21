package Uppgifter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LaborationJavaFX extends Application implements EventHandler<ActionEvent> {

	
	Button change;
	Button close;
	Group root;
	Scene scene;

	public static void main(String[] args) {

		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		root = new Group();
		scene = new Scene(root, 500, 500, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
public void handle(ActionEvent event) {
		
		if(event.getSource()==change){			
		}
		else if(event.getSource()==close) {
			System.exit(0);
		}
		else {
			return;
		}
		
	}
	
	private void buttons() {
		
		change = new Button("Change");
		close.setOnAction(this);
		
		close = new Button("Close");
		close.setOnAction(this);
		
	}
	
	private void ChangeColor() {
		root.setStyle("-fx-background-color: darkblue;");
	}
}