import java.util.*;

class BirthdayCakeCandles {
	
	public static int candles(int [] data) {
		
		Arrays.sort(data);
		int candleCounter = 0;
		int bigCandle = data[data.length-1];
		
		for(int i=0; i<data.length; i++) {
			
			if(data[i] == bigCandle) {
				candleCounter++;
			}
			
		}
		
		return candleCounter;
	}
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Prompt The Age Of Your Niece");
		int age = input.nextInt();
		
		int [] data = new int[age];
		System.out.println("Prompt the height of the candles space separated");
		
		for(int i=0; i<data.length; i++) {
			
			data[i] = input.nextInt();
		}
		
		System.out.println("Number Of Candles To be Blow Up First " + candles(data)) ;
	}
}