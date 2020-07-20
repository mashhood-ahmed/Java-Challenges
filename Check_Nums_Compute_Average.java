import java.util.Scanner;
class Check_Nums_Compute_Average {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("prompt integers");
		
		int input = 1;
		int sum = 0;
		int pos = 0;
		int neg = 0;
		
		while(input != 0) {
			
			input = scan.nextInt();
			
			if(input > 0)
				pos++;
			else if(input < 0)
				neg++;
			
			sum += input;
			
		}
		
		int count = pos + neg;
		double average = sum / count;
		
		System.out.println("the number of positives: " + pos);
		System.out.println("the number of positives: " + neg);
		System.out.println("the total is: " + sum);
		System.out.println("the average is: " + average);
		
	}
	
}