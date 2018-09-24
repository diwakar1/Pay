package com.company;

public class Pay {



    public static double weeklySalary( int hours, double payRate){
        return hours*payRate;
    }

    public static double weeklySalary( double yearlyRate) {
        return yearlyRate/52;
    }
}
