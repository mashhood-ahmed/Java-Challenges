class MiniMaxSum {
	
	public static void printMiniMaxSum(int [] data) {
		
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		for(int i=0; i<data.length; i++) {
			
			for(int j=0; j<data.length; j++) {
				
				if(i!=j) {
					
					sum += data[j];
		
				}
				
			}
			
			if(sum > max) 
				max = sum;
			
			if(sum < min)
				min = sum;
			
			sum = 0;
		}
		
		System.out.println(max + " " + min);
		
	}
	
	public static void main(String [] args) {
		
		int [] data = {1,3,5,7,9};
		printMiniMaxSum(data);
		
	} 
}