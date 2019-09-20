package Javafx2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class RepititionJavaFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		
		root.setTop(new Rectangle(100,50));
		Label left = new Label("Left");
		left.setAlignment(Pos.CENTER); //Funkar inte?
		root.setLeft(left);
		
		root.setCenter(new Label("Center"));
		root.setRight(new Label("Right"));
		root.setBottom(new Label("Bottom"));
		
		HBox bottom = new HBox(); //Horisontell box som är i bottom-delen av vår BorderPane
		Button exitButton = new Button("Exit"); // Knapp
		exitButton.setOnAction(event->{
			
			primaryStage.close();
			
		}); //Funktion av knappen
		
		bottom.getChildren().add(exitButton); //Lägg till knappen i vår BorderPane
		root.setBottom(bottom);
		
		Scene scene = new Scene(root,500,500); 
		
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}
	
	public static void main(String[] args) {
		launch(); 
	}

}
