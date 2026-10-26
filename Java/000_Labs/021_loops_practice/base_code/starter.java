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
		int guess = 0;

		while(guess != randomnum){
		System.out.print("Please guess a number: ");
		guess = sc.nextInt();	
		
			if(guess < randomnum){
			System.out.println("The number is higher.");		
			}
			else if(guess > randomnum){
			System.out.println("The number is lower."); 
			}
			else{
			System.out.println("Congratulations! You got the number!");
			}

		}
	}
}
