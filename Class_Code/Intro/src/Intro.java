import processing.core.*;

public class Intro extends PApplet{
	Walker w; 
//	static float mouse_x; 
//	static float mouse_y;
//	public void setup(){
//		background(0);
		w = new Walker(this); 
//		size(1000,1000);
//	}
//	
//	public void draw(){
//	
//		w.step(); 
//		w.display(); 
//		//fill(255); 
//		//ellipse(422,222,122,122);
//		
//		//handle mouse calls 
//		mouse_x = mouseX; 
//		mouse_y = mouseY; 
//	}
	int maxImages = 10; // Total # of images
	int imageIndex = 0; // Initial image to be displayed is the first

	// Declaring an array of images.
	PImage[] images = new PImage[maxImages];
	
	
	public void setup()
	{
		
	}
	
	public void draw() 
	{
		
	}
	
}
