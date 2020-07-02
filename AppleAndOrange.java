import java.util.*;

class AppleAndOrange {
	
	public static void appleOrange() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("House Start Point And End Point Space Separated");
		int startHouse = input.nextInt();
		int endHouse = input.nextInt();
	
		System.out.println("Location of apples Tree And Orange Tree");
		int appleTreeLoc = input.nextInt();
		int orangeTreeLoc = input.nextInt();
	
		System.out.println("Number of apples m and number of oranges n");
		int fallApples = input.nextInt();
		int fallOranges = input.nextInt();
	
		int [] appleDistances = new int[fallApples];
		int [] orangeDistances = new int[fallOranges];
		
		System.out.println("Prompt Distances Of Apples Space Separated");
		
		for(int i=0; i<appleDistances.length; i++) {
			
			appleDistances[i] = input.nextInt();
			
		}
		
		System.out.println("Prompt distances of oranges space separated");
		
		for(int i=0; i<orangeDistances.length; i++) {
			
			orangeDistances[i] = input.nextInt();
			
		}
		
		int calAppleDist = 0;
		int appleOnHouse = 0;
		int calOrangeDist = 0;
		int orangeOnHouse =0;
		
		for(int i=0; i<appleDistances.length; i++) {
			
			calAppleDist = appleDistances[i] + appleTreeLoc;
			
			if(calAppleDist >= startHouse && calAppleDist <= endHouse)
				appleOnHouse++;
			
		}
		
		for(int i=0; i<orangeDistances.length; i++) {
			
			calOrangeDist = orangeDistances[i] + orangeTreeLoc;
			
			if(calOrangeDist >= startHouse && calOrangeDist <= endHouse)
				orangeOnHouse++;
			
		}
		
		System.out.println("No Of Apples On House: " + appleOnHouse);
		System.out.println("No Of Oranges On House: " + appleOnHouse);
		
	}
	
	
	public static void main(String args[]) {
		
		appleOrange();
		
		
	}
	
}