class Divisible_By_Five_And_Six {
	
	public static void main(String [] args) {
		
		for(int i=100; i<=1000; i++) {
			
			if(i % 5 == 0 && i % 6 == 0)
				System.out.print(i + " ");
			
		}
		
	}
	
}