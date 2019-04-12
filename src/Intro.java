import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Intro extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group(); 
		
		Scene scene = new Scene(root, 500, 500, Color.SKYBLUE);
		
		primaryStage.setTitle("JavaFX playground");
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
		
		Rectangle ground = new Rectangle(500,50);
		ground.setFill(Color.SEAGREEN);
		
		ground.setTranslateX(0);
		ground.setTranslateY(450);
		
		root.getChildren().add(ground); 
		
		for (int i = 0; i < 10; i++) {
			Tree tree = new Tree();
			root.getChildren().add(tree);
			tree.setTranslateX(47 * i + 15);
			tree.setTranslateY(370);
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(); 
	}

}
