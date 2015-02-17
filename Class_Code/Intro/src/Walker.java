import processing.core.*;
import java.util.*;
public class Walker {
	PApplet p; 
	int x, y; 
	Random generator; 
	float n; 
	float num; 
	float t = 0; 
	float val;
	Walker(PApplet p_){
		p = p_; 
		x = p.width/2; 
		y = p.height/2;
		generator = new Random(); 
		
		
	}
	
	public void step()
	{
		t+=0.01; 
		n = p.noise(t); 
		
		 val = p.map(n, 0, 1, 0, p.width); 
		
		
		num = (float) generator.nextGaussian();
		//p.println(num);
		int choice = (int)(p.random(4)); 
		switch(choice){
			case 0:
				x++; 
				break;
			case 1:
				x--; 
				break; 
			case 2: 
				y++;
				break; 
			case 3: 
				y--; 
				break; 
			default: break; 
		}
		//p.println(choice); 
	}
	public void display(){
		//p.stroke(255); 
		//show off how to handle mouseX stuffs
		//p.point(Intro.mouse_x, Intro.mouse_y);
	
		//p.point(x, y);
		
		p.fill(n*255, n*255);
		
		float num = p.map(n, 0, 1, 0,p.height);
		p.ellipse(val, num, 100,100);
	}
}
