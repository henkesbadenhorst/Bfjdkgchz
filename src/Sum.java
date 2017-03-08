
import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		System.out.println("Sum of two numbers");
		
		Scanner scr = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Supply first number(s)");
		n1 = scr.nextInt();
		
		System.out.println("Supply second number(s)");
		n2 = scr.nextInt();
		
		System.out.println(n1 + n2);
	}
}
