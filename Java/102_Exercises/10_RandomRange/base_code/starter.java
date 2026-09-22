/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program. 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		System.out.print("Please enter an integer:");
		int small = sc.nextInt();

		System.out.print("Please enter another integer(bigger than the first):");
		int large = sc.nextInt();

		System.out.println("Your range is " + small + " to " + large + ".");
	    System.out.println("Here are 5 numbers generated in that range.");
	    int num1 = (int)(Math.random() * (large - small) + small);
		int num2 = (int)(Math.random() * (large - small) + small);
		int num3 = (int)(Math.random() * (large - small) + small);
		int num4 = (int)(Math.random() * (large - small) + small);
		int num5 = (int)(Math.random() * (large - small) + small);
		System.out.println(num1 + " , " + num2 + " , " + num3 + " , " + num4 + " , " + num5);
		
		
	 
	 






	}
}
