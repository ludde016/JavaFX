package Flags;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Flagmaker {

	public static Flag nordic(Color c, Color d, double width) {

		Flag flag = new Flag();
		Rectangle back = new Rectangle();
		back.setHeight(width / 2);
		back.setWidth(width);
		back.setFill(c);

		flag.getChildren().add(back);

		Rectangle hor = new Rectangle();
		hor.setHeight(width / 10);
		hor.setWidth(width);
		hor.setTranslateY(2 * (width / 10));
		hor.setFill(d);

		flag.getChildren().add(hor);

		Rectangle ver = new Rectangle();
		ver.setHeight(width / 2);
		ver.setWidth(width / 10);
		ver.setTranslateX(2 * (width / 6));
		ver.setFill(d);

		flag.getChildren().add(ver);

		return flag;

	}

	public static Flag tricolor(Color e, Color f, Color g, double width) {

		Flag flag2 = new Flag();
		Rectangle back = new Rectangle();
		back.setHeight(width / 2);
		back.setWidth(width);

		flag2.getChildren().add(back);

		Rectangle hor = new Rectangle();
		hor.setHeight(width / 6);
		hor.setWidth(width);
		hor.setFill(e);

		flag2.getChildren().add(hor);

		Rectangle hor2 = new Rectangle();
		hor2.setHeight(width / 6);
		hor2.setWidth(width);
		hor2.setTranslateY(width / 6);
		hor2.setFill(f);

		flag2.getChildren().add(hor2);

		Rectangle hor3 = new Rectangle();
		hor3.setHeight(width / 6);
		hor3.setWidth(width);
		hor3.setTranslateY(width / 3);
		hor3.setFill(g);

		flag2.getChildren().add(hor3);

		return flag2;

	}

	public static Flag kongo(double width) {

		Flag flag3 = new Flag();

		Rectangle back = new Rectangle();
		back.setHeight(width / 2);
		back.setWidth(width);

		Polygon triangle1 = new Polygon(0, 0, 0, (width / 2), width, 0);
		triangle1.setFill(Color.LIMEGREEN);

		flag3.getChildren().add(triangle1);

		Polygon triangle2 = new Polygon(width, (width / 2), 0, (width / 2), width, 0);
		triangle2.setFill(Color.RED);

		flag3.getChildren().add(triangle2);

		Polygon triangle3 = new Polygon(width, 0, (2 * (width / 3)), 0, 0, (width / 2), (width / 3), (width / 2), width,
				0);
		triangle3.setFill(Color.YELLOW);

		flag3.getChildren().add(triangle3);

		return flag3;

	}

	public static Flag laos(double width) {

		Flag flag4 = new Flag();
		
		Rectangle back = new Rectangle();
		back.setHeight(width / 2);
		back.setWidth(width);
		
		flag4.getChildren().add(back);
		
		Rectangle red1 = new Rectangle();
		red1.setHeight(width / 8);
		red1.setWidth(width);
		red1.setFill(Color.RED);
		
		flag4.getChildren().add(red1);
		
		Rectangle blue = new Rectangle();
		blue.setHeight(width/4);
		blue.setWidth(width);
		blue.setTranslateY(width / 8);
		blue.setFill(Color.BLUE);
		
		flag4.getChildren().add(blue);
		
		Rectangle red2 = new Rectangle();
		red2.setHeight(width / 8);
		red2.setWidth(width);
		red2.setTranslateY(width/2.666);
		red2.setFill(Color.RED);
		
		flag4.getChildren().add(red2);
		
		Circle white = new Circle();
		white.setRadius(width/9);
		white.setFill(Color.WHITE);
		white.setTranslateX(width/2);
		white.setTranslateY(width/4);
		
		flag4.getChildren().add(white);
		
		return flag4;

	}

	public static Flag greenland(double width) {

		Flag flag5 = new Flag();
		
		Rectangle back = new Rectangle();
		back.setHeight(width / 2); 
		back.setWidth(width);
		
		flag5.getChildren().add(back);
		
		Rectangle white = new Rectangle();
		white.setHeight(width / 4);
		white.setWidth(width);
		white.setFill(Color.WHITE);
		
		flag5.getChildren().add(white);
		
		Rectangle red = new Rectangle();
		red.setHeight(width / 4);
		red.setWidth(width);
		red.setTranslateY(width/4);
		red.setFill(Color.RED);
		
		flag5.getChildren().add(red);
		
		Arc arc = new Arc();
		arc.setCenterX(width/2.5);
		arc.setCenterY(width/4);
		arc.setRadiusX(width/5);
		arc.setRadiusY(width/5);
		arc.setLength(180.0f);
		arc.setType(ArcType.ROUND);
		arc.setFill(Color.RED);
		
		flag5.getChildren().add(arc); 
		
		Arc arc2 = new Arc();
		arc2.setCenterX(width/2.5);
		arc2.setCenterY(width/4);
		arc2.setRadiusX(width/5);
		arc2.setRadiusY(width/5);
		arc2.setLength(180.0f);
		arc2.setStartAngle(180.0f);
		arc2.setType(ArcType.ROUND);
		arc2.setFill(Color.WHITE);
		
		flag5.getChildren().add(arc2); 

		return flag5;

	}

	public static Flag kuwait(double width) {

		Flag flag6 = new Flag();

		Rectangle back = new Rectangle();
		back.setHeight(width / 2); // H�jd = bredd/2
		back.setWidth(width);

		flag6.getChildren().add(back);

		Rectangle hor = new Rectangle();
		hor.setHeight(width / 6); // H�jd/3 = bredd/6
		hor.setWidth(width);
		hor.setFill(Color.GREEN);

		flag6.getChildren().add(hor);

		Rectangle hor2 = new Rectangle();
		hor2.setHeight(width / 6);
		hor2.setWidth(width);
		hor2.setTranslateY(width / 6);
		hor2.setFill(Color.WHITE);

		flag6.getChildren().add(hor2);

		Rectangle hor3 = new Rectangle();
		hor3.setHeight(width / 6);
		hor3.setWidth(width);
		hor3.setTranslateY(width / 3);
		hor3.setFill(Color.RED);

		flag6.getChildren().add(hor3);
		
		Polygon black = new Polygon(0,0,
				(width/4),(width/6),
				(width/4),(width/3),
				0,(width/2));
		
		flag6.getChildren().add(black);

		return flag6;

	}

}
