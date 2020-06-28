package Entidades;

import Enuns.ColorShape;

public abstract class Shape {
	
	private ColorShape color;
	
	public Shape() {
		
	}
	
	public Shape(ColorShape color) {
		super();
		this.color = color;
	}

	public ColorShape getColor() {
		return color;
	}

	public void setColor(ColorShape color) {
		this.color = color;
	}

	public abstract Double area();
	
	
}
