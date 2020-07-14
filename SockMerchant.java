import java.util.Scanner;

class SockMerchant {
	
	public static int sockMerchant(int [] sockColor) {
		
		int pair = 0;
		int counter = 0;
		
		for(int i=0; i<sockColor.length; i++) {
			
			for(int j=i; j<sockColor.length-1; j++) {
				
				if(sockColor[i] != -1 || sockColor[j+1] != -1) {
					
					if(sockColor[i] == sockColor[j+1]) {
						
						counter++;
						sockColor[i] = -1;
						sockColor[j+1] = -1;
						break;
						
					}
					
				}
				
			}
			
			if(counter == 1)
				pair++;
			
			counter = 0;
					
		
		}
		
		return pair;
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt No.Of Socks");
		int n = input.nextInt();
		
		System.out.println("Prompt Space Separated Colors Of Socks");
		int [] sockColor = new int[n];
			
		for(int i=0; i<sockColor.length; i++) {
			
			sockColor[i] = input.nextInt();
		}	
		
		System.out.println(sockMerchant(sockColor));
			
	}
	
}