import Javafx2.Car;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Former extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();

		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setTranslateX(250);
		circle.setTranslateY(250);
		circle.setFill(Color.RED);

		root.getChildren().add(circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		rectangle.setFill(Color.HOTPINK);

		root.getChildren().add(rectangle);
		
		Polygon polygon = new Polygon(0,0,
				0,100,
				100,100);
		
		root.getChildren().add(polygon);
		
	//	Star star = new Star(50);
	//	star.setTranslateX(250);
	//	star.setTranslateY(250);
		
	//	root.getChildren().add(star); 
		
		Car car = new Car(Color.GREEN);
		car.setTranslateX(200);
		car.setTranslateY(216);
		root.getChildren().add(car);
		
		Arc arc = new Arc();
		arc.setCenterX(100.0f);
		arc.setCenterY(100.0f);
		arc.setRadiusX(25.0f);
		arc.setRadiusY(25.0f);
		arc.setStartAngle(45.0f);
		arc.setLength(270.0f);
		arc.setType(ArcType.ROUND);
		
		root.getChildren().add(arc); 
				
	}

	public static void main(String[] args) {
		launch();
	}

}
