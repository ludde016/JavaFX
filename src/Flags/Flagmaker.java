package Flags;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Flagmaker {
	
	public static Flag nordic(Color c, double width) {
		
		Flag flag = new Flag();
		Rectangle back = new Rectangle();
		back.setHeight(width/2);
		back.setWidth(width);
		back.setFill(c);
		
		return flag; 
		
	}

}
