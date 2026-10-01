/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		 Scanner sc = new Scanner(System.in); 

		 System.out.print("Please input your first number: ");
		 int inputnum1 = sc.nextInt();

		 System.out.print("Please input your second number: ");
		 int inputnum2 = sc.nextInt();

		boolean answer = inputnum1 > inputnum2;
		if(answer){

			System.out.println("Your numbers are different!");
		}
        answer = inputnum1 < inputnum2;
		if(answer){

			System.out.println("Your numbers are different!");
		}

        answer = inputnum1 == inputnum2;
		if(answer){

			System.out.println("Your numbers are the same!");
		}


	}
}
