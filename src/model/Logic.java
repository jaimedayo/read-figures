package model;

import processing.core.PApplet;
import java.util.ArrayList;

public class Logic {
	String lista2 [] ;
	String[] lista1;
	int r;
	int g;
	int b;
	Circle ci;
	Rectangle re;
	ArrayList<Element> cosa = new ArrayList<Element>();
	

	private PApplet app;

	//setting image
public Logic(PApplet app) {
	
	//initialize or load image
	this.app = app;
}
public void draw() {

app.background(255);


ci.draw(r, g, b);
	ci.move(600);
	
	re.draw(r, g, b);
	re.move(600);
}

public void mouseCliked() {
r= (int) app.random(30, 200);
g=(int) app.random(30, 200);
b=(int) app.random(30, 200);

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
			cosa.add(ci);
			}else {
				ci= new Circle(i+1, i+2, i+3, true, false, app);
			}
			cosa.add(ci);
		}
		if(lista2[i].equals(r)) {
			if(i+4==-1) {
				re= new Rectangle(i+1, i+2, i+3, true, true, app);
				cosa.add(re);
			}else {
				re= new Rectangle(i+1, i+2, i+3, true, false, app);
				cosa.add(re);
			}	
		}
	}
	
	}


}
