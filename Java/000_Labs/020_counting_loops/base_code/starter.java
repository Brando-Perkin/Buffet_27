/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String username = sc.nextLine();
		System.out.print("Please enter how many times you'd like to print your name: ");
		int usernum = sc.nextInt();
		System.out.println("--------------------------------------------------------------------------");
		
		int printnum = 0;
		while(true){
			if(printnum >= usernum){
				break;
			}
			System.out.println(username);
			printnum = printnum + 1;
			
		}


		
	}
}
