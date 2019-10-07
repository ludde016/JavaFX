package Miniraknare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Miniraknaren extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox root = new HBox();
		
		//Skapa en input och output field
		
		//Skapa en metod som uppdaterar textfield
		
		GridPane numpad = new GridPane(); //Kod för numpad

        String [] numpadKeys = {"1", "2", "3","+",
                                "4", "5", "6","-",
                                "7", "8", "9","*",
                                "0", "c", "=","/", 
                                "%", "\u221A"
                                };
        for (int i = 0; i < numpadKeys.length; i++) {
            Button temp = new Button(numpadKeys[i]);
            numpad.add(temp, i % 4, (int) Math.ceil(i/4)); // Vad betyder denna del? Math.ceil avrundar talet uppåt but why?

        } //Slut (numpad)
        
        root.getChildren().add(numpad);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch();	
		}

}
