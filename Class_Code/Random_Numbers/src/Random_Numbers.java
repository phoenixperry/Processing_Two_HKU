import processing.core.*; 

import java.util.*;

public class Random_Numbers extends PApplet{
	int[] randCount; 
	Walker w; 
	
	public void setup(){
		size(600,600); 
		randCount = new int[20]; 
		w = new Walker(this);
		
	}
	public void draw(){

		background(255); 
		w.step();
		
		int index = (int)(random(randCount.length)); 
		randCount[index]+=10; 
		
		stroke(0); 
		fill(175); 
		int w = width/randCount.length; 
		for(int i =0; i<randCount.length; i++)
		{
			rect(i*w, height-randCount[i], w-1, randCount[i]);
		}
		
	}
}
