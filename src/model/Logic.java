package model;

import processing.core.PApplet;

public class Logic {
	String lista2 [] ;
	String[] lista1;
	
	Circle ci;
	Rectangle re;

	

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
	String r = new String("cuadrado");
	 lista1 = app.loadStrings("text/instruction.txt");

	for(int i =0; i < lista1.length; i++){

	lista2 = lista1[i].split(" ");
	

	}for(int i =0; i < lista2.length; i++){
		if(lista2[i].equals(c)) {
			if(i+4==-1) {
				ci= new Circle(i+1, i+2, i+3, true, true, app);
			}else {
				ci= new Circle(i+1, i+2, i+3, true, false, app);
			}
		}
		if(lista2[i].equals(r)) {
			if(i+4==-1) {
				re= new Rectangle(i+1, i+2, i+3, true, true, app);
			}else {
				re= new Rectangle(i+1, i+2, i+3, true, false, app);
			}	
		}
	}
	
	}


}
