import javax.swing.Box.Filler;

import processing.core.PApplet;


public class Eekhoorn extends Character {
	PApplet p; 
	public Eekhoorn(PApplet p_){
		super(p_); 
		p= p_; 
	}
	public void draw(){
		p.fill(0,0,0); 
		p.rect(400, 400, 200, 200); 
		
	}
}
