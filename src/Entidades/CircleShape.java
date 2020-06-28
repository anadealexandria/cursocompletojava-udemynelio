package Entidades;

import Enuns.ColorShape;

public class CircleShape extends Shape{
	
	private Double radius;
	
	public CircleShape() {
		
	}

	public CircleShape(ColorShape color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
