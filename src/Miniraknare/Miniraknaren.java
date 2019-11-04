package Miniraknare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Miniraknaren extends Application {
	
	static TextField outputField = new TextField();
	static TextField inputField = new TextField();

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root= new BorderPane();
		
		VBox displayField = new VBox();

		GridPane numpad = new GridPane();
		
		inputField.setText("");
		outputField.setText("");
		inputField.setEditable(false); 
		outputField.setEditable(false);
		displayField.getChildren().addAll(inputField, outputField);
		root.setTop(displayField);

		String[] numpadKeys = { "1", "2", "3", " + ", "4", "5", "6", " - ", "7", "8", "9", " * ", " C ", "0", " = ", " / ", " % ",
				" \u221A ", "." };
		
		for (int i = 0; i < numpadKeys.length; i++) {
			String keyText = numpadKeys[i];
			Button temp = new Button(numpadKeys[i]);
			temp.setFont(Font.font("Verdana", 20));
			temp.setPrefSize(100, 100);
			temp.setOnAction(event ->
			{
				if (temp.textProperty().get() == " = ") {
					Functionality.Inputs(inputField);
					inputField.clear();
				}
				else if (temp.textProperty().get() == " C ") {
					inputField.clear();
					outputField.clear();
				}
				else {
				inputField.textProperty().set(inputField.textProperty().get() + keyText);
				}
			});
			numpad.add(temp, i % 4, (int) Math.ceil(i / 4));

		} 

		root.setCenter(numpad);

		Scene scene = new Scene(root, 300, 300);

		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	/**
	 * Metoden tar in en String från klassen functionality vilket den sedan skriver ut i outputField.
	 * Denna String är svaret från det som skrevs in i inputField. 
	 * 
	 * @param answer 
	 */
	public static void outputText(String answer) {
		outputField.setText(answer);
	}
	
	public static void main(String[] args) {

		launch();
	}

}
