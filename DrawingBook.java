import java.util.Scanner;

class DrawingBook {
		
	public static int retPageNo(int totalPages, int page) {
		
		int pageNo=0;
		int cycle=1;
		
		for(int i=1; i<=totalPages; i++) {
			
			if(cycle<2) {
	
				cycle++;
			
			} else {
				cycle=1;
				pageNo++;
				
			}
			
			if(page == i) {
				return pageNo;
			}
			
		}
		
		return 0;
		
	}	
		
	public static void main(String [] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt Total No.of Pages In a Book");
		int totalPages = input.nextInt();

		System.out.println("Prompt a page Number");
		int page = input.nextInt();	
		
		System.out.println(retPageNo(totalPages, page));
		
		
	}
	
}