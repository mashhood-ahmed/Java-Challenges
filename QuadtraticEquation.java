import java.util.Scanner;

class QuadtraticEquation {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double dis = b * b - 4 * a * c;
		
		if(dis > 0) {
			
			double r1 = -b + Math.sqrt(b*b-4*a*c) / 2*a;
			double r2 = -b - Math.sqrt(b*b-4*a*c) / 2*a;
			
			System.out.println("the equation has roots " + r1 + " and " + r2);
			
		} else if(dis == 0) {
			
			double r1 = -b + Math.sqrt(b*b-4*a*c) / 2*a;
			System.out.println("the equation has one root " + r1);
			
		} else {
			
			System.out.println("Equation has no roots");
		}
		
	}
	
}