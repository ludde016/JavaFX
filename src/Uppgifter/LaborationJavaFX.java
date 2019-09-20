package Uppgifter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LaborationJavaFX extends Application {

	public static void main(String[] args) {

		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void handle(ActionEvent event) {

		// if(event.getSource()==buttonAdd){
		// }
		// else if(event.getSource()==buttonClear) {
		// }
		// else if(event.getSource()==buttonClose) {
		//
		// }
		// else {
		// return;
		// }
	}
}
