import java.util.Scanner;
public class A_Very_Big_Sum {
	
	public static long getBigSum(long[] data, int size) {
		
		long sum = 0;
		
		for(int i=0; i<size; i++) {
			
			sum += data[i];
		}
		
		return sum;
	}
	
	public static void main(String [] args) {
		
		int N = 5;
		Scanner input = new Scanner(System.in);
		long [] data = new long[N];
		System.out.println("Enter Data For An Array");
		
		for(int i=0; i<N; i++) {
			data[i] = input.nextLong();
		}
		
		long sum = getBigSum(data,N);
		System.out.println("Sum Is: " + sum);
	}
	
}