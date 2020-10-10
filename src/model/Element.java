package model;

import processing.core.PApplet;

public class Element {
	public float posX;
	public float posY;
	public float radio;
	public boolean active;
	public boolean direction;
	protected PApplet app;
	
	public Element(float posX,float posY,float radio,boolean active, boolean direction, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.radio = radio;
		this.active = active;
		this.direction= direction;
		this.app=app;
	}
	
	public void move(int altura) {
		if(direction) {
			posY=posY+4;
			if(posY>=radio+altura) {
				posY=-radio;
			}
		}else {
			posY=posY-4;
			if(posY<=-radio) {
				posY=altura+radio;
			}
		}
		
	}
	public void setState() {
		if(active) {
			active=false;}else {active=true;
		}
	}
	public void setDirection() {
		if(direction) {
			direction=false;}else {direction=true;
		}
	}
	
}
