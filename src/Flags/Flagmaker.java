package Flags;

import javafx.scene.paint.Color;
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
		hor2.setFill(f);
		
		flag2.getChildren().add(hor2);
		
		Rectangle hor3 = new Rectangle();
		hor3.setHeight(width/6);
		hor3.setWidth(width);
		hor3.setFill(g);
		
		flag2.getChildren().add(hor3);

		
		return flag2;
				
	}

}

