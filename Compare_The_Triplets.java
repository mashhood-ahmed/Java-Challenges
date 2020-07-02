public class Compare_The_Triplets {
	
	public static int [] compareTriplets(int [] alice, int [] bob) {
		
		int aliceScore=0;
		int bobScore=0;
		
		for(int i=0; i<3; i++) {
			
			if(alice[i] > bob[i]) {
				
				aliceScore++;
				
			} else if(alice[i] < bob[i]) {
				
				bobScore++;
			} 
		}
		
		return new int[]{aliceScore,bobScore};
		
	}
	
	public static void main(String [] args) {
		
		int [] score = compareTriplets(new int[]{17,28,30}, new int[]{99,16,8});
		System.out.println("Alice Score: " + score[0] + " Bob's Score: " + score[1]);
		
	}
	
}