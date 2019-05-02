package Flags;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Show extends Application {

	public void start(Stage primaryStage) throws Exception {

		Scanner input = new Scanner(System.in);
		double width = input.nextInt();
		Group root = new Group();
		Scene scene = new Scene(root, width, width/2, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		input.close();
		
	// Här finns alla flaggor, ta bara bort kommentartecknen framför den flagga du vill ha
		
	//	root.getChildren().add(Flagmaker.sweden(width));
	//	root.getChildren().add(Flagmaker.denmark(width)); 
	//	root.getChildren().add(Flagmaker.finland(width)); 
	//	root.getChildren().add(Flagmaker.skane(width)); 
	//	root.getChildren().add(Flagmaker.kalmar(width));
	//	root.getChildren().add(Flagmaker.shetland(width));
	//	root.getChildren().add(Flagmaker.ostergötland(width)); 
	//	root.getChildren().add(Flagmaker.gotland(width));
	//	root.getChildren().add(Flagmaker.aland(width));
	//	root.getChildren().add(Flagmaker.germany(width));
	//	root.getChildren().add(Flagmaker.russia(width));
	//	root.getChildren().add(Flagmaker.yugoslavia(width)); 
	//	root.getChildren().add(Flagmaker.oldgermany(width)); 
	//	root.getChildren().add(Flagmaker.kongo(width));
	//	root.getChildren().add(Flagmaker.kuwait(width));
	//	root.getChildren().add(Flagmaker.laos(width));
	//	root.getChildren().add(Flagmaker.greenland(width));
	}
	public static void main(String[] args) {
		launch();
	}
}