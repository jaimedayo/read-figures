package model;

import processing.core.PApplet;

public class Logic {
	String lista2 [] ;
	String[] lista1;

	

	private PApplet app;

	//setting image
public Logic(PApplet app) {
	
	//initialize or load image
	this.app = app;
}
public void draw() {
app.rect(100, 100, 100, 100);
	read();
}

public void mouseCliked() {


}
public void read() {
	
	String c = new String("circulo");

	 lista1 = app.loadStrings("text/instruction.txt");

	for(int i =0; i < lista1.length; i++){

	lista2 = lista1[i].split(" ");
	

	}for(int i =0; i < lista2.length; i++){
		if(lista2[i].equals(c)) {
		app.rect(100,300,100,100);
			
		}
	}
	}


}
