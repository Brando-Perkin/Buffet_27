/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);

		int money = 100;
		String playagain = "yes";

		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than or equal to your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("---------------------------------------------------------");

		while (money > 0) {

			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			playagain = sc.nextLine();

			if(playagain.equalsIgnoreCase("n") || playagain.equalsIgnoreCase("no")){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}
			if(!playagain.equalsIgnoreCase("y") && !playagain.equalsIgnoreCase("yes")){
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("---------------------------------------------------");
				continue;
			}
			
			System.out.println();
			System.out.print("You have $" + money + ". ");
			System.out.print("How much would you like to wager?: ");
			int userwager = sc.nextInt();
			sc.nextLine();

			while(userwager <= 0 || userwager > money){
				System.out.println("Invalid wager. Try again.");
				System.out.print("How much would you like to wager?: ");
				userwager = sc.nextInt();
			}

			int num1 = (int)(Math.random() * 10) + 1;
			int num2 = (int)(Math.random() * 10) + 1;
			int num3 = (int)(Math.random() * 10) + 1;

			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("--------------------");
			System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
			System.out.println("--------------------");

			if(num1 == num2 && num2 == num3) {
				money += userwager * 2;
				System.out.println("JACKPOT!!! All three numbers match!");
				System.out.println("You won $" + (userwager * 2) + "!");
			}
			else if(num1 == num2 || num1 == num3 || num2 == num3){
				money += userwager;
				System.out.println("Two number match! You doubled your wager!");
				System.out.println("You won $" + userwager + "!");
			}
			else{
				money -= userwager;
				System.out.println("Didnt win this time, better luck next time!");
			}

			System.out.println("You now have $" + money + ".");
			System.out.println("------------------------------------------------");

		}

		if(money == 0){
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		}

	}
}
