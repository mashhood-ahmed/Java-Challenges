import java.util.*;
class BetweenTwoSets {
		
		
	public static int betweenTwoSets(int [] a, int [] b) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=20; i++) {
			
			if(i%a[0]==0 && i%a[1]==0)
				list.add(i);
			
		}
		
		int counter = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			if(b[0] % list.get(i)==0 && b[1] % list.get(i)==0 && b[2] % list.get(i)==0)
				counter++;
			
		}
		
		return counter;
	}
	
		
	public static void main(String [] args) {
		
		/*
		* this program will only work when setOne size is '2' and setTwo size is '3'
		*/
		
		int [] setOne = {2,4};
		int [] setTwo = {16,32,96};
		
		System.out.println(betweenTwoSets(setOne, setTwo));
}
		
		
	}	
		
		
	