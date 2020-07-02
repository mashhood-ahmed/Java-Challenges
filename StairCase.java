import java.util.Scanner;

class StairCase {
	
	public static void printStairCase(int n) {
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(j<=i) {
					
					System.out.print("#");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		printStairCase(size);
		
	}
	
}