/*
You are given an array of integers, a1,a2,a3,...an-1 , and a positive integer k, . Find and print the
number of pairs (i,j) where i<j and a[i] + a[j] is divisible by k.

sample input
6 3 
1 3 2 6 1 2

sample output
5

*/

import java.util.*;

class DivisibleSumPair {
	
	public static int divisibleSumPair(int s[], int k) {
		
		int counter = 0;
		
		for(int i=0; i<s.length; i++) {
			
			for(int j=i+1; j<s.length; j++) {
				
				if(i < j && (s[i]+s[j]) % k == 0)
					counter++;
				
			}
			
		}
		
		return counter;
	}
	
	public static void main(String [] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Prompt Space Separated Values of n and k");
			int n = input.nextInt();
			int k = input.nextInt();
			
			int [] data = new int[n];
			System.out.println("Prompt Space Separated " + n + " Numbers") ;
			for(int i=0; i<data.length; i++) {
				
				data[i] = input.nextInt();
				
			}
		
		
			System.out.println(divisibleSumPair(data, k));
	}
	
}