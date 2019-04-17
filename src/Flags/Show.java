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
		double height = input.nextInt();
		double width = input.nextInt();
		Group root = new Group();
		Scene scene = new Scene(root, height, width, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		root.getChildren().add(Flagmaker.nordic(Color.RED,Color.YELLOW,width)); // Ändra färg så kan du få till 8 olika flaggor

	}
	public static void main(String[] args) {
		launch();
	}
}
