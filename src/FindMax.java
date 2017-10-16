import java.util.Scanner;

public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x ,y ;
		Scanner in  = new Scanner(System.in);
		System.out.print("First Number : ");
		x = in.nextDouble();
		System.out.print("Second Number : ");
		y = in.nextDouble();
		
		if(x>y) {
			System.out.print("\n Maximum number is "+ x);
		}
		else
			System.out.print("\n Maximum number is "+ y);

	}

}
