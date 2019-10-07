package Miniraknare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Miniraknaren extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox root = new HBox(); //VBox fixar textfielden

		// Skapa en metod som uppdaterar textfield

		BorderPane PainBroder = new BorderPane();
		root.getChildren().add(PainBroder);

		GridPane numpad = new GridPane(); // Kod för numpad
		

		TextField inputField = new TextField();
		inputField.setText("Label");
		TextField outputField = new TextField();
		outputField.setText("Label");
		root.getChildren().addAll(inputField, outputField);
		PainBroder.setTop(inputField);
		PainBroder.setTop(outputField);

		String[] numpadKeys = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "c", "=", "/", "%",
				"\u221A" };
		
		for (int i = 0; i < numpadKeys.length; i++) {
			Button temp = new Button(numpadKeys[i]);
			temp.setFont(Font.font("Verdana", 20));
			temp.setPrefSize(1000, 1000);
			numpad.add(temp, i % 4, (int) Math.ceil(i / 4));

		} // Slut (numpad)

		root.getChildren().add(numpad);
		PainBroder.setCenter(numpad);

		Scene scene = new Scene(root, 300, 300);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch();
	}

}
