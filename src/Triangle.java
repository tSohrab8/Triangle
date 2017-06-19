import java.util.*;

public class Triangle {
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the value of the three sides of a triangle, separated by spaces");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a == b && a == c){
			System.out.println("This is an equilateral triangle");
		}
		
		else if ((a*a == (b*b + c*c)) || (b*b == (a*a + c*c)) || (c*c == (a*a + b*b) )) {
			System.out.println("This is a right triangle");
		}
		
		else{
			System.out.println("This is neither a right triangle nor an equilateral triangle");
		}
		
	}

}
