class GradingEnglish {
	
	public static void main(String [] args) {
		
		int [] data = {71,64,30,33};
		int round = 0;
		
		for(int i=0; i<data.length; i++) {
			
			if(data[i] < 38) {
				
				System.out.println(data[i]);
				continue;
			}
			
			round = data[i];	
			
			while(true) {
				
				if(round % 5 == 0) {
						
					if(round - data[i] < 3) 
						System.out.println(round);
					
					if(round - data[i] == 3)
						System.out.println(data[i]);
					
					
					
					break;
				}	
				
				round++;
			}
			
		}
		
	}
}