import java.util.Scanner;
class countingValleys {
	
	public static int countValley(char [] s) {
		
		int step=0;
		int noOfValley=0;
		
		for(int i=0; i<s.length; i++) {
			
			if(s[i] == 'U')
				step++;
			else
				step--;
			
		}
		
		if(step <= 0)
			return ++noOfValley;
		
		return 0;
	} 
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt No. Of Steps");
		int n = input.nextInt();
		
		char [] steps = new char[n];
		
		System.out.println("Prompt space separated Step Up 'U' and Step Down 'D'");
		
		for(int i=0; i<steps.length; i++) {
			
			steps[i] = input.next().charAt(0);
		}
		
		System.out.println(countValley(steps));
		
	}
	
}