/*
Question:
Lily has a chocolate bar with numbered squares. She wants to share it with Ron for his birthday. She
decides to share a contiguous segment of the bar selected such that the sum of the integers on the
squares is equal to a given value. The length of the segment will match Ron's birth month. The sum of the
segments will match his birth day. You must determine how many ways she can divide the chocolate.

Sample Input:
5
1 2 1 3 2
3 2

Sample Output:
2

*/

import java.util.Scanner;

class BirthdayChocolate {
	
	public static int birthdayChocolate(int [] score, int d, int m) {
		
		int counter=0;
		int seg=0;
		int u = m;
		
		for(int i=0; i<score.length; i+=u-1) {
			
			if(m < score.length) {
				
				for(int j=i; j<m; j++)
					counter += score[j];
			
			} else if(m == score.length) {
				
				counter = score[0] ;
				seg++;
				return seg;
			}
			
			
			if(counter == d)
				seg++;
			
			counter=0;
			m += m-1;
		}
		
		return seg;
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Prompt Number Of Segments Of a Chocolate");
		int n = input.nextInt();
		int [] segs = new int[n];
		
		System.out.println("Prompt space separated block numbers");
		for(int i=0; i<segs.length; i++)
			segs[i] = input.nextInt();
		
		System.out.println("Prompt space separated birthday and month") ;
		int d=input.nextInt();
		int m=input.nextInt();
		
		System.out.println(birthdayChocolate(segs, d, m));
		
	}
	
}