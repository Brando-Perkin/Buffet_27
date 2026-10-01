/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);

        System.out.println("Random color: rgb(" + r + ", " + g + ", " + b+")");
        System.out.println("Complementary Color: rgb(" + r + ", " + g + ", " + b+")");
        getColor(r, g, b);
        getColor(255-r, 255-g, 255-b);

        System.out.println("Triadic Colors:");
        getColor(r, g, b);
        getColor(b, r, g);
        getColor(g, b, r);
       
        System.out.println("Dark Color:");
        int rmax = (int)(Math.random()*128);
        int gmax = (int)(Math.random()*128);
        int bmax = (int)(Math.random()*128);
        getColor(rmax, gmax, bmax);
        
        System.out.println("Light Color:");
        int rmin = (int)(Math.random()+128*255);
        int gmin = (int)(Math.random()+128*255);
        int bmin = (int)(Math.random()+128*255);
        getColor(rmin, gmin, bmin);
        




		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
