import java.util.Scanner;

class AdditionQuiz {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in) ;
		int numOne = (int) (1 + Math.random() * 100);
		int numTwo = (int) (1 + Math.random() * 100);
		
		if(numOne > numTwo) {
			
			int temp = numOne;
			numOne = numTwo;
			numTwo = temp;
			
		}
		
		System.out.print(numOne + " + " + numTwo + " = ") ;
		int user = input.nextInt();
		
		if(numOne + numTwo == user) {
			
			System.out.println("Your Answer Is Correct ") ;
		
		} else {
			
			System.out.println("Your Answer Is Wrong") ;
			System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo)) ;
		}
			
	}
	
}