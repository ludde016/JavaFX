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

		GridPane numpad = new GridPane();
		

		TextField inputField = new TextField();
		inputField.setText("");
		TextField outputField = new TextField();
		outputField.setText("");
		displayField.getChildren().addAll(inputField, outputField);
		root.setTop(displayField);
		
		// Kod för numpad, kan kanske göras till en egen metod

		String[] numpadKeys = { "1", "2", "3", " + ", "4", "5", "6", " - ", "7", "8", "9", " * ", "C", "0", " = ", " / ", " % ",
				" \u221A ", "." };
		
		for (int i = 0; i < numpadKeys.length; i++) {
			String keyText = numpadKeys[i];
			Button temp = new Button(numpadKeys[i]);
			temp.setFont(Font.font("Verdana", 20));
			temp.setPrefSize(100, 100);
			temp.setOnAction(event ->
			{
				if (temp.textProperty().get() == " = ") {
					equation.Calc(inputField);
					inputField.clear();
					//Anropa metod i annan klass för ett utföra beräkningar
					//Anropa metod med svaret som skriver ut det i outputField
				}
				//Ha en else-if sats för att stoppa bokstäver från att hamna i textfield??? Bra idé?
				else {
				inputField.textProperty().set(inputField.textProperty().get() + keyText); //ansvara för alla tecken som visas i displayField
				}
			});
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
