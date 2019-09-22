package Uppgifter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LaborationJavaFX extends Application implements EventHandler<ActionEvent> {

	Button change;
	Button close;
	Canvas canvas;
	Boolean color = false;
	Group root;
	Group group;
	Scene scene;

	public void start(Stage primaryStage) throws Exception {

		root = new Group();
		buttons();
		ChangeColor();


		updateRoot(); 
		scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void handle(ActionEvent event) {

		if (event.getSource() == change) {
			ChangeColor();
		} else if (event.getSource() == close) {
			System.exit(0);
		} else {
			return;
		}

	}
	
	private void updateRoot() {
		root.getChildren().add(NewGroup());
	}

	private void buttons() {

		change = new Button("Change");
		change.setOnAction(this);

		close = new Button("Close");
		close.setOnAction(this);
		close.setTranslateX(80); // Flyttar knappen

	}

	public void ChangeColor() {
		canvas = new Canvas(500, 500); 
		GraphicsContext gc = canvas.getGraphicsContext2D();
		if (color == true) {
			color = false;
			gc.setFill(Color.BLUE);
			gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		} else {
			color = true;
			gc.setFill(Color.SKYBLUE);
			gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		}
		updateRoot();
	}

	private Group NewGroup() {
		Group root2 = new Group();
		root2.getChildren().add(canvas); 
		root2.getChildren().add(change);
		root2.getChildren().add(close);
		return root2;
	}
	
	public static void main(String[] args) {

		launch();
	}

}