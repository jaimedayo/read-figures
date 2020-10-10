package view;

import controller.Controller;
import processing.core.PApplet;

public class Mainscrean extends PApplet {
	
Controller c;
String lista2 [] ;
String[] lista1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Mainscrean.class.getName());
		
	}


	
public void settings() {
	
		size(600,600);
		
	}
public void setup() {

	 c= new Controller(this); 
	c.read();
}
public void draw() {
	
	c.draw();
	
	
}
public void mouseCliked() {
	
	c.mouse();
	
}


}




