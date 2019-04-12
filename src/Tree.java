import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle; 

public class Tree extends Group {

	public Tree() {
		
		Rectangle trunk = new Rectangle(10,30,20,50); 
		trunk.setFill(Color.SADDLEBROWN);
		
		this.getChildren().add(trunk);
		
		for (int i = 0; i < 100; i++) {
			Circle blob = new Circle(Math.random() * 15 + 5);
			blob.setFill(Color.FORESTGREEN);
			
			double cp_x = 20; 
			double cp_y = 20;
			
			double delta_x = Math.random();
			double delta_y = Math.random();
			if (delta_x < 0.5) {
				delta_x *= -1;
			}
			if (delta_y < 0.5) {
				delta_y *= -1;
			}
			
			blob.setTranslateX(10 + cp_x * Math.random());
			blob.setTranslateY(5 + cp_y * Math.random());
			this.getChildren().add(blob);
		}
	}
}
