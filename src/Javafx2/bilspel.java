package Javafx2;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class bilspel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 1500, 500, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Car car = new Car(Color.RED);
		root.getChildren().add(car);
		
		AnimationTimer at = new AnimationTimer() {
			int dir = 1;
			public void handle(long now) {
				
				car.setTranslateX(car.getTranslateX() + 5 * dir);
				
				if(car.getTranslateX() > 1500 || car.getTranslateX() < 0) {
					dir = dir * -1;
					car.setRotationAxis(Rotate.Y_AXIS);
					car.setRotate(car.getRotate() + 180);
					
				}
			}
		};
		
		scene.setOnKeyPressed(e -> {
			KeyCode key = e.getCode();
			switch(key) {
			case UP:
				car.setTranslateY(car.getTranslateY() - 5);
				if (car.getTranslateY() < 0) {
					car.setTranslateY(0);
				}
				break;
			case DOWN:
				car.setTranslateY(car.getTranslateY() + 5);
				if (car.getTranslateY() < 500 - 62.5) {
					car.setTranslateY(500 - 62.5);
					
				}
				break; 
			}
		});
		
		at.start();

	}

	public static void main(String[] args) {
		launch();
	}

}
