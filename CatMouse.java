import java.util.Scanner;

class CatMouse {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt number of queries");
		int q = input.nextInt();
		
		int catA = 0;
		int catB = 0;
		int mouse = 0;
		int i=100;
		
		while(q>=1) {
			
			catA = input.nextInt();
			catB = input.nextInt();
			mouse = input.nextInt();
			
			while(true) {
			
			if(catA<mouse)
				catA++;
			else
				catA--;
			
			if(catB<mouse)
				catB++;
			else
				catB--;
			
			//System.out.println("Cat A: " + catA + " Cat B: " + catB + " Mouse: " + mouse);
			
			if(catA==mouse && catA!=catB) {
				System.out.println("Cat A");
				break;
			} else if(catB==mouse && catA!=catB) {
				System.out.println("Cat B");
				break;
			} else if(catA==catB) {
				System.out.println("Mouse");
				break;
			}

		
			}
		
		q--;
		
		}
		
	} 
	
}