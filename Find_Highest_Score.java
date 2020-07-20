import java.util.Scanner;

class Find_Highest_Score {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		String name=null;
		int score = 0;
		int max=0;
		
		System.out.println("Prompt Number Of Students");
		int noOfStds = scan.nextInt();
		
		while(noOfStds > 0) {
				
			System.out.println("Prompt Student Name And Score");	
			String stdName = scan.next();
			int stdScore = scan.nextInt();
			
			if(stdScore > max) {
				
				max = stdScore;
				name = stdName;
				score = stdScore;
			}
			
			noOfStds--;
		}
			
		System.out.println("Name of student is: " + name + " score is: " + score);
		
	}
	
}