/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Ascii Museum!");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1. Sports");
		System.out.println("2. Food");
		System.out.println("3. Fun facts");
		
		String exhibitinput = sc.nextLine();

		if(exhibitinput.equals("sports") || exhibitinput.equals("Sports")){
			System.out.println("Here are 2 Sports options!");
			System.out.println("Please select which one you'd like to play.");
			System.out.println("1. Soccer");
			System.out.println("2. Basketball");
			String exhibitinput2 = sc.nextLine();
			if(exhibitinput2.equals("soccer") || exhibitinput2.equals("Soccer")){
				System.out.println("                     ___");
				System.out.println(" o__        o__     |   |");
				System.out.println("/|          /\\      |   |");
				System.out.println("/ > o        <\\     |   |");
				
            	}
			else if(exhibitinput2.equals("basketball") || exhibitinput2.equals("Basketball")){
				System.out.println("				 |\\");
				System.out.println("  				  \\O");
				System.out.println(" 				   |");
				System.out.println("  				  /|");
				System.out.println("				 |  \\");


			}

		}
		else if(exhibitinput.equals("food") || exhibitinput.equals("Food")){
			System.out.println("Here are 2 Food options!");
			System.out.println("Please select which one you'd like to eat.");
			System.out.println("1. Pizza");
			System.out.println("2. Apple");
			String exhibitinput2 = sc.nextLine();

			if(exhibitinput2.equals("pizza") || exhibitinput2.equals("Pizza")){
			System.out.println("// \"\"--.._");
			System.out.println("||  (_)  _ \"-_");
			System.out.println("||    _ (_)    '-.");
			System.out.println("||   (_)   __..-'");
			System.out.println("\\__..--\"\"");

				
			}
			else if((exhibitinput2.equals("apple")) || (exhibitinput2.equals("Apple"))){
			System.out.println(" ,--./,-.");
			System.out.println("/,-._.--~\\");
			System.out.println("__}  {     ");
			System.out.println("\\-\\._,-`-,");
			System.out.println(" `._,._,'");

			}

	

		}
		else if(exhibitinput.equals("fun facts") || (exhibitinput.equals("Fun Facts")) || (exhibitinput.equals("Fun facts")) || (exhibitinput.equals("fun Facts"))){
			System.out.println("Here are 2 Fun fact category options!");
			System.out.println("Please select which one you'd like to learn about.");
			System.out.println("1. Shrimp anatomy");
			System.out.println("2. History");
			String exhibitinput2 = sc.nextLine();

			if(exhibitinput2.equals("shrimp anatomy") || (exhibitinput2.equals("Shrimp Anatomy")) || (exhibitinput2.equals("Shrimp anatomy")) || (exhibitinput2.equals("shrimp Anatomy"))){
			System.out.println("A shrimp's heart is located in its head region.");


			}
			else if(exhibitinput2.equals("history") || (exhibitinput2.equals("History"))){
			System.out.println("Ketchup was sold as a medicine in the 1830s to treat indigestion before it became a popular condiment.");

			}
		}
		else{
			System.out.println("That exhibit does not exist!?!");
		}

		


		
	}
}
