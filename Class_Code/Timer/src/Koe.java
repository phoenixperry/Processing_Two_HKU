import javax.swing.Box.Filler;

import processing.core.PApplet;


public class Koe extends Character {
	PApplet p; 
	public Koe (PApplet p_){
		super(p_);  
		p= p_; 
	}
	public void draw(){
		p.fill(255,255,255); 
		p.ellipse(200,200,200,200); 
		
	} 
}
