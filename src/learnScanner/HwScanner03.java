package learnScanner;

import java.util.Scanner;

public class HwScanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***** Calcutale Salary *****");

        System.out.println("Enter your per hourly salary");
        double perHourSalary=input.nextDouble();
        System.out.println("Wage per Hour is "+perHourSalary);

        System.out.println("Enter your weekly working hours");
        int workingHour=input.nextInt();
        System.out.println("Weekly Working Hours are :"+workingHour);

        //System.out.println("Weekly Salary");
        double weekSalary= workingHour*perHourSalary;
        System.out.println("Weekly Salary is :"+weekSalary);

        //System.out.println("Monthly Salary");
        double monthSalary= weekSalary*4;
        System.out.println("Monthly Salary is :"+monthSalary);

        //System.out.println("Whole year Gross Salary");
        //double yGrossSalary= monthSalary*12; //But, this equation will give wrong numbers as;
        // 12 months has 48 weeks, but actually we have 52 weeks. So..
        double yGrossSalary=weekSalary*52;
        System.out.println("Annual Gross Salary is "+yGrossSalary);

        System.out.println("Enter Tax bracket");
        double tax= input.nextDouble();
        System.out.println("Annual Tax is :"+tax);

        //System.out.println("Whole year Net Salary");
        double yNetSalary= yGrossSalary-yGrossSalary*tax;
        System.out.println("Annual Net Salary is :"+yNetSalary);


    }
}
