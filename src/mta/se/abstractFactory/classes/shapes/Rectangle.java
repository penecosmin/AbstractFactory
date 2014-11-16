package mta.se.abstractFactory.classes.shapes;

import mta.se.abstractFactory.interfaces.IShape;

public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}