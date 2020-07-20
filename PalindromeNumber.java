import java.util.Scanner;

class PalindromeNumber {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt a number");
		int user = input.nextInt();
		int n = user;
		int reverse = 0;
		int temp = 0;
		
		while(n >= 1) {
			
			temp = n % 10;
			reverse = reverse * 10 + temp;
			n = n / 10;	
			
		}		
		
		if(user == reverse)
			System.out.println("Number is palindrome");
		else 
			System.out.println("Number is not palindrome");
		
	}
	
}