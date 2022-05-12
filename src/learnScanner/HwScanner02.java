package learnScanner;

import java.util.Scanner;

public class HwScanner02 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname=input.nextLine();
        System.out.println("My first name is: "+fname);

        System.out.println("Enter your last name");
        String lname=input.nextLine();
        System.out.println("My last name is: "+lname);

        System.out.println("Enter your age");
        int age=input.nextInt();
        System.out.println("My age is: "+age);

        System.out.println("Have you get a job?");
        boolean jobStatus=input.nextBoolean();
        System.out.println("My Job Status is: "+jobStatus);

        System.out.println("What is your monthly expected salary?");
        double mexpSalary=input.nextDouble();
        System.out.println("My expected salary is: "+mexpSalary);

        System.out.println("What is your dress size?");
        char dSize=input.next().charAt(0);
        System.out.println("My dress Size is: "+dSize);

    }

}
