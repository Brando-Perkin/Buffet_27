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

		System.out.print("Please enter a width: ");
		int width = sc.nextInt();

		System.out.print("Please enter a height: ");
		int height = sc.nextInt();

		int y = 0;
		while(true){
			if(y == height){
				break;
			}
			int x = 0;
			while(true){
			if(x == width){
			break;
			}
			System.out.print("*");
			x = x + 1;
			
		}
		System.out.println();
		y = y + 1;
	}
	}
}
