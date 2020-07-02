import java.util.Scanner;

class Kangroo {
	
	public static String checkKangrooLocs(int x1, int v1, int x2, int v2) {
		
		if(x2 > x1 && v2 > v1) {
			
			return "No";
			
		} else {
			
			while(true) {
			
			x1 += v1;
			x2 += v2;
			
			if(x1 == x2) {
				return "Yes";
			}	
			
		}
			
			
		}
		
		
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("Prompt space separated values of x1,v1 and x2,v2");
		int x1 = input.nextInt();
		int v1 = input.nextInt();
		int x2 = input.nextInt();
		int v2 = input.nextInt();
		
		System.out.println(checkKangrooLocs(x1,v1,x2,v2));
	}
	
}