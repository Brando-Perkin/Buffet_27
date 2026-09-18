/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine(); 
		
		System.out.println("How old are you?"); 
		String age = sc.nextLine();
		
		System.out.println("What month were you born in?");
		String birthMonth = sc.nextLine();
		
		System.out.println("What day were you born on?");
		String birthDay = sc.nextLine(); 
		
		System.out.println("What year were you born in?");
		String birthYear = sc.nextLine();
		
		System.out.println("How much is a buck fifty?");
		String buckFifty = sc.nextLine(); 
	}
}
