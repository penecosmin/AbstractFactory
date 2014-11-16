package mta.se.abstractFactory.classes.colors;

import mta.se.abstractFactory.interfaces.IColor;

public class Green implements IColor {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
	}