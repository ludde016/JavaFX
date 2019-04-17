package Flags;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Flagmaker {
	
	public static Flag nordic(Color c, Color d, double width) {
		
		Flag flag = new Flag();
		Rectangle back = new Rectangle();
		back.setHeight(width/2);
		back.setWidth(width);
		back.setFill(c);
		
		flag.getChildren().add(back);
		
		Rectangle hor = new Rectangle();
		hor.setHeight(width/10);
		hor.setWidth(width);
		hor.setTranslateY(2 * (width/10));
		hor.setFill(d);
		
		flag.getChildren().add(hor);
		
		Rectangle ver = new Rectangle();
		ver.setHeight(width/2);
		ver.setWidth(width/10);
		ver.setTranslateX(2 * (width/6));
		ver.setFill(d);
		
		flag.getChildren().add(ver);
		
		return flag; 
		
	}
	
	public static Flag tricolor(Color e, Color f, Color g, double width) {
		
		Flag flag2 = new Flag();
		Rectangle back = new Rectangle();
		back.setHeight(width/2);
		back.setWidth(width);
		
		flag2.getChildren().add(back);
		
		Rectangle hor = new Rectangle();
		hor.setHeight(width/6);
		hor.setWidth(width);
		hor.setFill(e);
		
		flag2.getChildren().add(hor);
		
		Rectangle hor2 = new Rectangle();
		hor2.setHeight(width/6);
		hor2.setWidth(width);
		hor2.setTranslateY(width/6);
		hor2.setFill(f);
		
		flag2.getChildren().add(hor2);
		
		Rectangle hor3 = new Rectangle();
		hor3.setHeight(width/6);
		hor3.setWidth(width);
		hor3.setTranslateY(width/3);
		hor3.setFill(g);
		
		flag2.getChildren().add(hor3);

		
		return flag2;
				
	}
	
	public static Flag kongo(double width, double height) {
		
		Flag flag3 = new Flag();
		
		Rectangle back = new Rectangle();
		back.setHeight(width/2);
		back.setWidth(width);
		
		Polygon triangle1 = new Polygon(0,0,
				0,(width/2),
				width,0); 
		triangle1.setFill(Color.LIMEGREEN);
		
		flag3.getChildren().add(triangle1);

		Polygon triangle2 = new Polygon(width,(width/2),
				0,(width/2),
				width,0); 
		triangle2.setFill(Color.RED);
		
		flag3.getChildren().add(triangle2);
		
		Polygon triangle3 = new Polygon(width,0,
				(2 *(width/3)),0,
				0,(width/2),
				(width/3),(width/2),
				width,0); 
		triangle3.setFill(Color.YELLOW);
		
		flag3.getChildren().add(triangle3);
		
		return flag3; 
		
	}

}

