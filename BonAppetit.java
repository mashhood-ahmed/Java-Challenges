import java.util.Scanner;

class BonAppetit {
	
	public static void bonAppetit(int [] cost, int k, int b) {
		
		int actual=0;
		int sum=0;
		
		for(int i=0; i<cost.length; i++) {
			
			if(i != k) {
				
				sum += cost[i];
			}
			
		}
		
		actual = sum / 2;
		
		if(actual == b)
			System.out.println("Bon Appetit");
		else 
			System.out.println(b - actual);
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("Prompt space-separated N and K");
		int n = input.nextInt();
		int k = input.nextInt();

		int [] itemCosts = new int[n];	
		System.out.println("Prompt space separated " + n + " integers");	
			
		for(int i=0; i<itemCosts.length; i++) {
			
			itemCosts[i] = input.nextInt();
			
		}
		
		System.out.println("Amount of money brian charged anna");
		int b = input.nextInt();
		
		bonAppetit(itemCosts, k, b);
	}
	
}