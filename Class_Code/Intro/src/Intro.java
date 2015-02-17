import processing.core.*;

public class Intro extends PApplet{
	Walker w; 
	static float mouse_x; 
	static float mouse_y;
	public void setup(){
		background(0);
		w = new Walker(this); 
		size(1000,1000);
	}
	
	public void draw(){
	
		w.step(); 
		w.display(); 
		//fill(255); 
		//ellipse(422,222,122,122);
		
		//handle mouse calls 
		mouse_x = mouseX; 
		mouse_y = mouseY; 
	}
}
