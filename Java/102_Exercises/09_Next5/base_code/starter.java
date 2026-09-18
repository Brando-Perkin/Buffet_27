/*
 *	Author: Brando Perkin
 *  Date: 9/15/2026
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		
		int initialnum = num;
		
		System.out.println("Here are the next 5 numbers! "); 
		System.out.println(initialnum + ", " + (initialnum + 1) + ", " + (initialnum + 2) + ", " + (initialnum + 3) + ", " + (initialnum + 4) + ", " + (initialnum + 5));
		
		System.out.println("Here are the next 5 multiples of " + initialnum + "!");
		System.out.println(initialnum + ", " + initialnum * 2 + ", " + initialnum * 3 + ", " + initialnum * 4 + ", " + initialnum * 5 + ", " + initialnum * 6);

		double numdivide = (double)initialnum / 100;
		System.out.println("Here is " + initialnum + " divided by 100!");
		System.out.println(numdivide);

		double numdivide2 = (double)initialnum / 10;
		System.out.println("Here is " + initialnum + " divided by 10!");
		System.out.println(numdivide2);

	}
}
