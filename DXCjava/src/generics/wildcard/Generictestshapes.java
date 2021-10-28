package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Generictestshapes {
	public static void drawShapes(List<? extends Shapes> shapesList) {//? can be a rectangle or a circle
		for(Shapes shape : shapesList) {
			shape.drawShape();

		}

	}
	public static void main(String[] args) {
		List<Rectangle> recList = new ArrayList<>();
		recList.add(new Rectangle());

		List<Circle> cirList = new ArrayList<>();
		cirList.add(new Circle());

		drawShapes(cirList);
		drawShapes(recList);


	}

}
