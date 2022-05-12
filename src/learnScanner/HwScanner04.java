package learnScanner;

import java.util.Scanner;

public class HwScanner04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***** Calcutale Salary *****");

        System.out.println("Enter your per hourly salary");
        double perHourSalary=input.nextDouble();
        System.out.println("Wage per Hour is "+perHourSalary);

        System.out.println("Enter your weekly working hours");
        int workingHour=input.nextInt();
        System.out.println("Weekly Working Hours are :"+workingHour);

        double gWeekSalary= workingHour*perHourSalary;
        System.out.println("Gross Weekly Salary is :"+gWeekSalary);

        System.out.println("Enter Tax bracket");
        double tax= input.nextDouble();
        System.out.println("per paycheck Tax is :"+tax);

        double nWeekSalary= gWeekSalary-gWeekSalary*tax;
        System.out.println("Net Weekly Salary is :"+nWeekSalary);

        double monthSalary= nWeekSalary*4;
        System.out.println("Monthly Salary is :"+monthSalary);

        double yGrossSalary=nWeekSalary*52;
        System.out.println("Annual Gross Salary is "+yGrossSalary);

        int aBonus=15000;
        System.out.println("Annual Bonus is :"+aBonus);

        double aBonusAfterTax=aBonus-aBonus*tax;
        System.out.println("Annual bonus after tax is :"+aBonusAfterTax);

        double yNetSalary= yGrossSalary+aBonusAfterTax;
        System.out.println("Annual Net Salary is :"+yNetSalary);


    }
}
