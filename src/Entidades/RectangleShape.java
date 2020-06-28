package Entidades;

import Enuns.ColorShape;

public class RectangleShape extends Shape {

	private Double width;
	private Double height;

	public RectangleShape() {
		super();
	}

	public RectangleShape(ColorShape color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return height * width;
	}

}
