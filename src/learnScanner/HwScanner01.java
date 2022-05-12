package learnScanner;

import java.util.Scanner;

public class HwScanner01 {

    public static void main(String[] args) { //Step 1

        Scanner input = new Scanner(System.in); //Step 2 (in this step have to import)

        System.out.println("Enter your first name"); // 3

        String fname=input.nextLine();                // 4
        System.out.println("My first name is: "+fname); // 5

        System.out.println("Enter your last name"); // 6

        String lname=input.nextLine();              // 7
        System.out.println("My last name is: "+lname); // 8




    }
}
