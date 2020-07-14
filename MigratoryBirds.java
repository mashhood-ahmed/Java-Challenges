import java.util.Scanner;

class MigratoryBirds {
	
	public static int retType(int [] arr) {
			
		int counter=0;
		int commonBirds=0;
		int type=0;

		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					counter++;
				}
			}
			
			if(counter > commonBirds) {
				
				commonBirds = counter;
				type = arr[i];
			}
				
			counter = 0;	
		}	
		
		return type;	
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt N:");
		int n = input.nextInt();
		
		System.out.println("Prompt " + n + " Space-Separated values");
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = input.nextInt();
			
		}
		
		System.out.println(retType(arr));
	}
	
}