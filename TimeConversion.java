import java.util.Scanner;

class TimeConversion {
	
	public static void main(String [] args) {
		
		String time1 = "07:05:45PM";
		
		String [] string = time1.split(":");
		String p1 = string[0]; // hour in String
		String p2 = string[1]; // minute in String
		String p3 = string[2]; // seconds in String
		String [] exPM = p3.split("PM"); // remove PM from seconds
		
		if(time1.endsWith("PM") || time1.endsWith("pm")) {
			
				int hr = Integer.parseInt(p1); // convert string to int
				hr = hr + 12; 
				System.out.println(hr + ":" + p2 + ":" + subString[0]);
			
		}
		
		
		
		
		
	}
	
}