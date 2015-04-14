import processing.core.*;

public class Sprite_sheet extends PApplet {
	// Example 15-2: Image "sprite"

	PImage head; // A variable for the image file
	public float x,y;   // Variables for image location
	public float rot;   // A variable for image rotation

	public void setup(int x, int y){
		  head = loadImage("face.jpg");
		  x = 0.0f;
		  y = width/2.0f;
		  rot = 0.0f;
	} 
	public void draw()
	{
		  background(255);
		  
		  // Translate and rotate
		  translate(width/2, height/2);
		  fill(255,0,0); 
		  ellipseMode(CENTER); 
		  ellipse(0,0,100,100); 
		  println(x); 
	}		  
//		  rotate(rot);
//		  
//		  // Images can be animated just like regular shapes using variables, translate(), rotate(), and so on.
//		  image(head,0,0); 
//		  
//		  // Adjust variables for animation
//		  x += 1.0;
//		  rot += 0.02f;
//		  if (x > width+head.width) {
//		    x = -head.width;
//		  }
//	} 
//}
}