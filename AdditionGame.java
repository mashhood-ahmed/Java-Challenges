import java.util.Scanner;

class AdditionGame {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int numOne = (int) (1+Math.random()*100);	
		int numTwo = (int) (1+Math.random()*100);
		int numThree = (int) (1+Math.random()*100);
		
		int sum = numOne + numTwo + numThree;

		System.out.print(numOne + " + " + numTwo + " + " + numThree + " = ");
		int user = input.nextInt();

		if(user == sum) 
			System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + sum + " is correct");	
		else
			System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + user + " is wrong");
			
	}
	
}