import processing.core.*;
import processing.serial.*; 
import gnu.io.*;

public class Serial_In extends PApplet{
	public Serial serial; 
	int data; 
//	public int NUMPADS = 11; 
//	int[] pads;
	String pad; 
	String data; 
	String myString; 
	
	 String content = "";
	  char character;
	  String [] nums; 
	public void setup() {
		//pads = new int[NUMPADS]; 
	//	nums = new String[1]; 
		// List all the available serial ports:
		//println(Serial.list());
//		for (int i = 0; i < NUMPADS; i++) {
//			pads[i]=0; 
//		} 
		serial = new Serial(this, "/dev/tty.usbmodem1421", 9600); 
		
		
	}
	
	public void draw() {
		
		byte[] buffer = new byte[7];
		while (serial.available() > 0) {
			//00:000\n\0 (New line + null terminator in serial string must all be accounted for in the bytes returned)
	    	buffer = serial.readBytes(); 
		//	serial.readBytes(buffer); 
			if(buffer !=null){
				myString = new String(buffer); 
			
				print(myString); //whole. 
					if(myString.contains(":")){ 
						println("found");
						nums = myString.split(":"); 
							if(nums.length==1)
							{
								pad = nums[0]; 
								data = nums[1]; 
							}
					}
			}
		}
	}
//					println(pad);
		
}
					//data = myString.substring(3, 5);
//					if(pad == "00"){
//						pads[0] = Integer.parseInt(myString.substring(3, 5));
//					}
//			            else if(pad=="01"){ pads[1] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="02"){ pads[2] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="03"){ pads[3] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="04"){ pads[4] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="05"){ pads[5] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="06"){ pads[6] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="07"){ pads[7] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="08"){ pads[8] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="09"){ pads[9] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="10"){ pads[10] = Integer.parseInt(myString.substring(3, 5));}
//			            else if(pad=="11"){ pads[11] = Integer.parseInt(myString.substring(3, 5));}
//				}	
