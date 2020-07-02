import java.util.Scanner;

class PlusMinus {
	
	public static void calPlusMinus(int [] data) {
		
		int size = data.length;
		int noOfPos = 0;
		int noOfNeg = 0;
		int noOfZero = 0;
				
		for(int i=0; i<size; i++) {
			
			if(data[i] > 0)
				noOfPos++;
			else if(data[i] < 0)
				noOfNeg++;
			else
				noOfZero++;
			
		}
		
		float pos = ((float) noOfPos/size);
		float negs = ((float) noOfNeg/size);
		float zeros = ((float) noOfZero/size);
		
		System.out.format("%.6f\n",pos);
		System.out.format("%.6f\n",negs);
		System.out.format("%.6f\n",zeros);
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int N = input.nextInt();
		
		int [] data = new int[N];
		
		System.out.println("Enter Array Elements");

		for(int i=0; i<N; i++) {
			
			data[i] = input.nextInt();
		}
		
		calPlusMinus(data);
		
	}
}