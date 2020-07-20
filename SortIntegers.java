import java.util.Scanner;
class SortIntegers {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt Space Separated 3 integers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = 0;
		int neu = 0;
		int min = 0;
		
		// finding max number
		if(a > b) {
			if(b > a) {
				max = b;
			} else {
				max = a;
			}
		} else {
			
			if(b > c) {
				max = b;
			} else {
				max = c;
			}	 
				
		}
		
		// finding min number
		if(a < b) {
			if(b < a) {
				min = b;
			} else {
				min = a;
			}
		} else {
			
			if(b < c) {
				min = b;
			} else {
				min = c;
			}	 
				
		}
		
		
		// finding neutral number
		if((a > min && a < max) || (a==min || a==max))
			neu = a;
		else if((b > min && b < max) || (b==min || b==max)) 
			neu = b;
		else if((c > min && c < max) || (c==min || c==max))
			neu = c;
	
		
		// printing numbers in descending order 
		System.out.println(max);
		System.out.println(neu);
		System.out.println(min);
		
		System.out.println();
		
		//printing numbers in ascending order 
		System.out.println(min);
		System.out.println(neu);
		System.out.println(max);
		
		
	}
	
}