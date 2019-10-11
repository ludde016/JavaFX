package Miniraknare;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Miniraknaren extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root= new BorderPane();
		
		VBox displayField = new VBox();

		// Skapa en metod som uppdaterar textfield

		GridPane numpad = new GridPane(); // Kod för numpad
		

		TextField inputField = new TextField();
		inputField.setText("Input");
		TextField outputField = new TextField();
		outputField.setText("Output");
		displayField.getChildren().addAll(inputField, outputField);
		root.setTop(displayField);

		String[] numpadKeys = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "C", "0", "=", "/", "%",
				"\u221A" };
		
		for (int i = 0; i < numpadKeys.length; i++) {
			Button temp = new Button(numpadKeys[i]);
			temp.setFont(Font.font("Verdana", 20));
			temp.setPrefSize(100, 100);
			numpad.add(temp, i % 4, (int) Math.ceil(i / 4));

		} // Slut (numpad)

		root.setCenter(numpad);

		Scene scene = new Scene(root, 300, 300);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch();
	}

}
