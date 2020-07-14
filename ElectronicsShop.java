import java.util.Scanner;

class ElectronicsShop {
	
	public static int electronicShop(int [] kprice, int [] mprice, int money) {
		
		int sum = 0;
		int max = 0;
		
		for(int i=0; i<kprice.length; i++) {
			
			for(int j=0; j<mprice.length; j++) {
			
				if(kprice[i] + mprice[j] <= money)
					sum = kprice[i] + mprice[j];
				
				if(sum > max)
					max = sum;
						
			}
			
		}	
		
		if(max > 0)
			return max;
		
		return -1;
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt space-separated 's', 'n' and 'm'");	
		int s = input.nextInt();
		int n = input.nextInt();
		int m = input.nextInt();

		int [] kbPrice = new int[n];
		int [] mousePrice = new int[m];
		
		System.out.println("Prompt space-separated keyboard prices");
		for(int i=0; i<kbPrice.length; i++)
			kbPrice[i] = input.nextInt();
		
		System.out.println("Prompt space-separated Mouse prices");
		for(int i=0; i<mousePrice.length; i++)
			mousePrice[i] = input.nextInt();
		
		
		System.out.println(electronicShop(kbPrice, mousePrice, s));
	}
	
}