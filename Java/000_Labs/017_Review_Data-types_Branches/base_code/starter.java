/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String userchoice = sc.nextLine();

		if(userchoice.equals("wizard") || userchoice.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.  Spend them wisely.");

			System.out.print("Strength (1-10): ");
			int userstrength = sc.nextInt();
			if(userstrength > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Strength (1-10):");
				userstrength = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength) + " left to spend.");
			System.out.print("Dexterity (1-10): ");
			int userdexterity = sc.nextInt();
			if(userdexterity > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Dexterity (1-10):");
				userdexterity = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity) + " left to spend.");
			System.out.print("Intelligence (1-10): ");
			int userintelligence = sc.nextInt();
			if(userintelligence > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Intelligence (1-10):");
				userintelligence = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence < 0){
					System.out.println("Please input a smaller value.");
					System.out.println("Intelligence (1-10):");
					userintelligence = sc.nextInt();
				}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence) + " left to spend");
			System.out.print("Charisma (1-10): ");
			int usercharisma = sc.nextInt();
			if(usercharisma > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence-usercharisma < 0){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence-usercharisma) + " left to spend");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS" );
		System.out.println("You're a " + userchoice + " with the following stats!");
		System.out.println("Strength - " + userstrength);
		System.out.println("Dexterity - " + userdexterity);
		System.out.println("Intelligence - " + userintelligence);
		System.out.println("Charisma - " + usercharisma);

		
		}
		else if(userchoice.equals("warrior") || userchoice.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.  Spend them wisely.");

			System.out.print("Strength (1-10): ");
			int userstrength = sc.nextInt();
			if(userstrength > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Strength (1-10):");
				userstrength = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength) + " left to spend.");
			System.out.print("Dexterity (1-10): ");
			int userdexterity = sc.nextInt();
			if(userdexterity > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Dexterity (1-10):");
				userdexterity = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity) + " left to spend.");
			System.out.print("Intelligence (1-10): ");
			int userintelligence = sc.nextInt();
			if(userintelligence > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Intelligence (1-10):");
				userintelligence = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence < 0){
					System.out.println("Please input a smaller value.");
					System.out.println("Intelligence (1-10):");
					userintelligence = sc.nextInt();
				}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence) + " left to spend");
			System.out.print("Charisma (1-10): ");
			int usercharisma = sc.nextInt();
			if(usercharisma > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence-usercharisma < 0){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence-usercharisma) + " left to spend");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS" );
		System.out.println("You're a " + userchoice + " with the following stats!");
		System.out.println("Strength - " + userstrength);
		System.out.println("Dexterity - " + userdexterity);
		System.out.println("Intelligence - " + userintelligence);
		System.out.println("Charisma - " + usercharisma);

		}
		else if(userchoice.equals("rogue") || userchoice.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.  Spend them wisely.");

			System.out.print("Strength (1-10): ");
			int userstrength = sc.nextInt();
			if(userstrength > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Strength (1-10):");
				userstrength = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength) + " left to spend.");
			System.out.print("Dexterity (1-10): ");
			int userdexterity = sc.nextInt();
			if(userdexterity > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Dexterity (1-10):");
				userdexterity = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity) + " left to spend.");
			System.out.print("Intelligence (1-10): ");
			int userintelligence = sc.nextInt();
			if(userintelligence > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Intelligence (1-10):");
				userintelligence = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence < 0){
					System.out.println("Please input a smaller value.");
					System.out.println("Intelligence (1-10):");
					userintelligence = sc.nextInt();
				}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence) + " left to spend");
			System.out.print("Charisma (1-10): ");
			int usercharisma = sc.nextInt();
			if(usercharisma > 10){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
				if(20-userstrength-userdexterity-userintelligence-usercharisma < 0){
				System.out.println("Please input a smaller value.");
				System.out.println("Charisma (1-10):");
				usercharisma = sc.nextInt();
			}
			System.out.println("You have " + (20-userstrength-userdexterity-userintelligence-usercharisma) + " left to spend");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS" );
		System.out.println("You're a " + userchoice + " with the following stats!");
		System.out.println("Strength - " + userstrength);
		System.out.println("Dexterity - " + userdexterity);
		System.out.println("Intelligence - " + userintelligence);
		System.out.println("Charisma - " + usercharisma);

		}
		else{
			System.out.println("You've decided not to choose a role. Please rerun program");
		}

		
		

	}
}
