import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				Color c = Color.WHITE;
				if ((row + col) % 2 == 0) {
					c = Color.BLACK;
				}
				Rectangle r = new Rectangle(50,50, c);
				r.setTranslateX(50*row);
				r.setTranslateY(50*col);
				root.getChildren().add(r);
				
			}
			
		}
		
		Scene scene = new Scene(root,50*8,50*8);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
	launch();	
	}
	

}
