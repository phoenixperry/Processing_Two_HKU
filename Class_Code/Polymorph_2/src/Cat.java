import processing.core.*;
public class Cat extends Pet{
	PApplet p; 
	Cat(PApplet p_)
	{
		super(p_); 
	}
	
	void eat(){
	 p.println("I prefer chicket!"); 
	}
}
