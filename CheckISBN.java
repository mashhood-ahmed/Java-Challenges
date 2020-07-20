import java.util.Scanner;
class CheckISBN {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt ISBN-10");
		int isbn = input.nextInt();
		// 0 1 3 6 0 1 2 6 7
		
		
		int d9 = isbn % 10; // 7
 		isbn = isbn / 10; // 01360126
		int d8 = isbn % 10; // 6
		isbn = isbn / 10; // 0136012
		int d7 = isbn % 10; // 2
		isbn = isbn / 10; // 013601
		int d6 = isbn % 10; // 1
		isbn = isbn / 10; // 01360
		int d5 = isbn % 10; // 0
		isbn = isbn / 10; // 0136
		int d4 = isbn % 10; // 6
		isbn = isbn / 10; // 013
		int d3 = isbn % 10; // 3
		isbn = isbn / 10; // 01
		int d2 = isbn % 10; // 1
		isbn = isbn / 10; // 0
		int d1 = isbn % 10; // 0
		
	
		int cal_tenth_digit = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
		
		if(cal_tenth_digit != 10)
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + cal_tenth_digit);
		else
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");	
		
	}
	
}