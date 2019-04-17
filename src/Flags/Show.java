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
		Scene scene = new Scene(root, width, height, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		input.close();
		
	//	root.getChildren().add(Flagmaker.nordic(Color.RED,Color.YELLOW,width)); // Ändra färg så kan du få till minst 8 olika flaggor
	//	root.getChildren().add(Flagmaker.tricolor(Color.WHITE,Color.BLUE,Color.RED,width)); // Ändra färg så kan du få till minst 7 olika flaggor
		root.getChildren().add(Flagmaker.kongo(width,height));
	}
	public static void main(String[] args) {
		launch();
	}
}
