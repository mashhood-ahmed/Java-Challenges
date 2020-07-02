import java.util.Scanner;

class DayOfProgrammer {
	
	public static void dayOfProgrammer(int [] d, int year) {
		
		int sum = 0;
		for(int i=0; i<d.length; i++) {
			
			sum += d[i] ;
		}
		
		int day = 256 - sum;
		int month = d.length+1;
		System.out.println(day + ".0" + month + "." + year);
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		// days in first 8 months
		int [] days = {31,28,31,30,31,30,31,31}; 
		
		// checking if the year is leap or not	
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			
			days[1] = 29;
			
		}	
		
		dayOfProgrammer(days, year);
			
	}
	
}