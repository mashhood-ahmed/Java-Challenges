import java.util.Scanner;

class find_no_of_days_in_month {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt month and year");
		int month = input.nextInt();
		int year = input.nextInt();
		
		boolean isLeap = false;
		
		if(year % 400 == 0 || year % 4 ==0 && year % 100 != 0)
			isLeap = true;
		
		if(month==1)
			System.out.println("January: 31 Days");
		else if(month==2 && isLeap == false) 
			System.out.println("February: 28 Days");
		else if(month==3) 
			System.out.println("March: 31 Days");
		else if(month==4) 
			System.out.println("April: 30 Days");
		else if(month==5) 
			System.out.println("May: 31 Days");
		else if(month==6) 
			System.out.println("June: 30 Days");
		else if(month==7) 
			System.out.println("July: 31 Days");
		else if(month==8) 
			System.out.println("August: 31 Days");
		else if(month==9) 
			System.out.println("September: 30 Days");
		else if(month==10) 
			System.out.println("October: 31 Days");
		else if(month==11) 
			System.out.println("November: 30 Days");
		else if(month==12) 
			System.out.println("December: 31 Days");
		else
			System.out.println("February: 29 Days");
		
	}
	
}