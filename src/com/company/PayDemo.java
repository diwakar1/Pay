package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by diwakarsharma on 9/24/18.
 */
public class PayDemo {
    public static void main(String[] args) {

        String selection;
        double payRate;
        double yearlyRate;
        int hours;
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#,##0.00");
        System.out.println("Enter h for hourly and y for salaried");
        selection = input.next();
        boolean isValid = false;
       do {

            switch (selection) {
                case "h":
                case "H":
                    System.out.println("How many hours did you worked? Enter hours:");
                    hours = input.nextInt();
                    System.out.println("How much pay rate did you get? Enter payrate:");
                    payRate = input.nextDouble();
                    System.out.println("Weekly gross pay is: $" + f.format(Pay.weeklySalary(hours, payRate)));
                    isValid=true;
                    break;


                case "Y":
                case "y":
                    System.out.println("How much is your yearly rate? Enter yearly rate: ");
                    yearlyRate = input.nextDouble();
                    System.out.println("The weekly  gross pay is: $" + f.format(Pay.weeklySalary(yearlyRate)));
                    isValid=true;
                    break;
                default:
                    System.out.println("This is invalid selection");
                    System.out.println("Enter h for hourly and y for salaried");
                    selection = input.next();


                break;

            }
        } while (isValid==false || (!selection.equalsIgnoreCase("h"))&&(!selection.equalsIgnoreCase("y")));
    }
}

