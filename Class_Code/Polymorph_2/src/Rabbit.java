import processing.core.*; 


public class Rabbit extends Pet {
	public PApplet p;  
	
	Rabbit(PApplet p_){
		super(p_);  
		p = p_; 
	} 
	void eat(){
		p.println("I nom nom carrots"); 
		
	}
}
