package mta.se.abstractFactory.classes.shapes;

import mta.se.abstractFactory.interfaces.IShape;

public class Square implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}