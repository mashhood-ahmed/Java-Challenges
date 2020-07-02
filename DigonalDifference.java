import java.util.Scanner;
class DigonalDifference {
	
	public static int primaryDiagonal(int [][] data) {
		
		int rows = data.length;
		int cols = data[0].length;
		int sum = 0;
		
		for(int i=0, j=0; i<rows; i++, j++) {
			
			sum += data[i][j];
		}
		
		return sum;
		
	}
	
	public static int secondaryDiagonal(int [][] data) {
		
		int rows = data.length;
		int cols = data[0].length;
		int sum = 0;
		
		for(int i=0, j=cols-1; i<rows; i++, j--) {
			
			sum += data[i][j];
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt Integer N");
		int N = input.nextInt();
		int [][] data = new int[N][N];
		
		System.out.println("Enter Rows And Columns");
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N; j++) {
				
				data[i][j] = input.nextInt();
			}
		}
			
			
		int a = secondaryDiagonal(data);
		int b = primaryDiagonal(data);
		
		System.out.println("Primary Diagonal: " + b);
		System.out.println("Secondary Diagonal: " + a);
		
		int res = b - a;
		System.out.println("Absolute Difference b/w Sum of its Diagonals: " + Math.abs(res));
	}
	
}