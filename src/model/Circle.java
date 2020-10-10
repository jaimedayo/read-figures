package model;

import processing.core.PApplet;

public class Circle extends Element{

	
	public Circle(float posX, float posY, float radio, boolean active, boolean direction, PApplet app) {
		super(posX, posY, radio, active, direction, app);
		// TODO Auto-generated constructor stub
	}

	public void draw(int r, int g ,int b) {
		app.fill(r,g,b);
		app.ellipse(posX, posY, radio,radio);
		}
}
