/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);
		int randomnum = (int)(Math.random()*1000 + 1);

		System.out.println("Welcome to the guessing game!");
		System.out.print("Please guess a number: ");
		int guess = sc.nextInt();

		if(guess == randomnum){
			System.out.println("You got the number!");
		}
		else if(guess < randomnum || guessagain < randomnum){
			System.out.println("The number is higher.");
			System.out.print("Please guess a number: ");
			int guessagain = sc.nextInt();
		}
		else if(guess > randomnum || guessagain > randomnum){
			System.out.println("The number is lower.");
			System.out.print("Please guess a number: ");
			int guessagain = sc.nextInt(); 
		}



		
	}
}
