class BreakRecord {
	
	public static void main(String [] args) {
		
		int [] score = {3,4,21,36,10,28,35,5,24,42};
		
		int hfirstScore = score[0] ;
		int lfirstScore = score[0] ;
		int high = 0;
		int low = 0;
		
		for(int i=0; i<score.length; i++) {
			
			if(hfirstScore < score[i]) {
				
				hfirstScore = score[i] ;
				high++;
			} 
			
			if(score[i] < lfirstScore) {
				
				lfirstScore = score[i] ;
				low++;
			} 
			
			
		}
		
		System.out.println(high + " " + low) ;
		
	}
	
}