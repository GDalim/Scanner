package learnScanner;

import java.util.Scanner;

public class HwScanner {

    // What is Scanner?
    // Scan the document and return as image file or pdf file.
    // Scanner take input from user and provide output in console.

    //Scanner in java is a class.

    public static void main(String[] args) {
        //create an object of scanner class
        //Scanner class comes from JDK so we have to import it from class/ util
        //Argument need to pass. So,
        // we need to put input inside argument"()"/System.in inside the parenthesis or brackets.

        Scanner input=new Scanner(System.in); //here the object name is input

        System.out.println("Enter your name");

        //Underneath line will request to enter a string value during runtime
        String name=input.nextLine(); //here the method name after input. is next or nextline

        System.out.println("My name is: "+name);


    }

}
