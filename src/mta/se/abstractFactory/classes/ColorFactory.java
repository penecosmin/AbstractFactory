package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.colors.*;
import mta.se.abstractFactory.interfaces.*;

public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		return null;
	}

	@Override
	IColor getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}