import java.util.Scanner;

public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	public static void main(String args[]){
		double a;
		Scanner in = new Scanner(System.in);
		System.out.print("Number : ");
		a = in.nextDouble();
		if (a>=0) {
			System.out.print("\n Positive");
		}
		else
			System.out.print("\n Negative");
		
	}
}
