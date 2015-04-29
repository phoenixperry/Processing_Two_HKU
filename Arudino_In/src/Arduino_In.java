import processing.core.*;
import processing.serial.*;

import gnu.io.*;

public class Arduino_In extends PApplet{
	public Serial serial;
	public int inByte; 
	public void setup(){
		println(Serial.list());
		serial = new Serial(this, "/dev/tty.usbmodem1421", 9600); 
		size(1000,1000); 
	} 
	public void draw(){
		background(0);
		while (serial.available() > 0) {
		    inByte = serial.read();
		    println(inByte);
		   
		  }
	
		 fill(255); 
		    ellipse(width/2, height/2, inByte, inByte);
	}
	
}
