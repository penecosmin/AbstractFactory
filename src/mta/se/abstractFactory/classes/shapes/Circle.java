package mta.se.abstractFactory.classes.shapes;

import mta.se.abstractFactory.interfaces.IShape;

public class Circle implements IShape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}