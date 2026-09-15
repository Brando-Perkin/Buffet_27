/*
    Lecture note example - Input!!
*/

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        String greeting = "Welcome to Brando's Imbiss!";
        String menu = "Here's our menu:";
        
        System.out.println(greeting); 
        System.out.println(menu); 
        
        String item1 = "1. Currywurst";
        String item2 = "2. Döner Kebab";
        String item3 = "3. Spezi";
        
        double item1Price = 4.99;
        double item2Price = 6.99;
        double item3Price = 2.99;
        
        System.out.println(item1 + " - $" + item1Price);
        System.out.println(item2 + " - $" + item2Price);
        System.out.println(item3 + " - $" + item3Price);

        Scanner sc = new Scanner(System.in);
        System.out.println("Who is purchasing?");
        String name = sc.nextLine();
        System.out.println("How many Currywurst are you purchasing?"); 
        int item1Quantity = sc.nextInt();
        System.out.println("How many Döner Kebab are you purchasing?");
        int item2Quantity = sc.nextInt();
        System.out.println("How many Spezi are you purchasing?");
        int item3Quantity = sc.nextInt();
       
        double item1Total = item1Price * item1Quantity;
        double item2Total = item2Price * item2Quantity;
        double item3Total = item3Price * item3Quantity;
        System.out.println("Total is:" + (item1Total + item2Total + item3Total));


	}
}
