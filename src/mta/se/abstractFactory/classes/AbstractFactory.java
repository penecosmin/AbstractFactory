package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.interfaces.IColor;
import mta.se.abstractFactory.interfaces.IShape;

public abstract class AbstractFactory {
	abstract IColor getColor(String color);

	abstract IShape getShape(String shape);
}