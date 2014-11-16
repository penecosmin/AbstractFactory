package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.shapes.*;
import mta.se.abstractFactory.interfaces.*;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	IColor getColor(String color) {
		return null;
	}
}