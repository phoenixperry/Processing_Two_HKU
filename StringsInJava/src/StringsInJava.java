//import java.util.*;
import processing.core.*; 

public class StringsInJava extends PApplet{
PFont f; 
PFont createdFont; 

int speed=5; 
int xpos=0; 
String port;  
public void setup(){
	size(1000,500); 

	char[] hello = {'h', 'e', 'l', 'l', 'o'}; 
	String helloString = "world"; 
	Integer.toString(5); 

	println(Character.toString(hello[0]) + 
			helloString.length());
	
	for(int i =0; i < helloString.length(); i++){	
		println(helloString.charAt(i));
	} 
	
	for(int i =0; i < hello.length; i++)
	{
		print(hello[i]);
	}
	String n = "this"; 
	String n1 = "that"; 
	if(n.equals(n1)) println("equal");
	
	String[] words = {"i", "love", "tea", "and",
			"i", "love", "coffee"}; 
	  findDuplicate(words);
	
	f = loadFont("data/Avenir-Roman-48.vlw");
	textFont(f, 48);
	
	//alternatively 
//	createdFont = createFont("Calibri", 48); 		
//	textFont(createdFont, 48);
	
	//if youre feeling reallly lazy print(PFont.list()); :) 
} 
public void draw() {
	background(255);
	smooth();
	fill(0);

	//text("hey! look words on screen cool yo!", width/2, height/2);
	
	//but crap why is it over there? (Also LEFT, RIGHT) 
	textAlign(CENTER); 
	
	String words = "words here!"; 
		
	text(words, xpos, height-200); 
	xpos +=speed; 
	if(xpos > width+textWidth(words)){
		xpos = -(int)textWidth(words);
	} 
} 
public void readData(){
	String search = "def"; 
	String toBeSearched = "abcdefgh"; 
	int index = toBeSearched.indexOf(search); 
	
	
	
} 
public void findDuplicate(String[] lookforDuplicate){
  
	for(int i =0; i <lookforDuplicate.length; i++)
	{
		for(int j=i+1; j < lookforDuplicate.length; j++ ) 
		{
			if(lookforDuplicate[i].equals(lookforDuplicate[j])){
				print(lookforDuplicate[i] + " is a duplicate ");} 
		}
		
			
	} 
			
}	
		
}


