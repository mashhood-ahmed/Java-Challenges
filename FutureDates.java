import java.util.Scanner;
class FutureDates {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day");
		int todayDay = input.nextInt();
		
		System.out.println("Enter number of days elapsed since today:");
		int nextDay = input.nextInt();
		
		int cal = (todayDay+nextDay) % 7;
		
		if(todayDay==1)
			System.out.print("Today is Monday");
		else if(todayDay==2)
			System.out.print("Today is Tuesday");
		else if(todayDay==3)
			System.out.print("Today is Wednesday");
		else if(todayDay==4)
			System.out.print("Today is Thursday");
		else if(todayDay==5)
			System.out.print("Today is Friday");
		else if(todayDay==6)
			System.out.print("Today is Saturday");
		else 
			System.out.print("Today is Sunday");
		
		if(cal==1)
			System.out.print(" and the future day is Monday");
		else if(cal==2)
			System.out.print(" and the future day is Tuesday");
		else if(cal==3)
			System.out.print(" and the future day is Wednesday");
		else if(cal==4)
			System.out.print(" and the future day is Thursday");
		else if(cal==5)
			System.out.print(" and the future day is Friday");
		else if(cal==6)
			System.out.print(" and the future day is Saturday");
		else 
			System.out.print(" and the future day is Sunday");
		
	}
	
}