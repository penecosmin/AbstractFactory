package mta.se.abstractFactory.classes.colors;

import mta.se.abstractFactory.interfaces.IColor;

public class Blue implements IColor {

	   @Override
	   public void fill() {
	      System.out.println("Inside Blue::fill() method.");
	   }
	}