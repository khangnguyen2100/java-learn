package com.javaLearn.Mortgage;


public class Main {
    public static void calcMortgage() {
        // get principal
        long principal = (long) Console.readNumber("principal", 0, Double.MAX_VALUE);
        // get annual interest rate
        long interestRate = (int) Console.readNumber("annual interest rate", 0, 100);
        // get period
        byte periodYears = (byte) Console.readNumber("period", 0, Byte.MAX_VALUE);

        // calc mortgage
        Mortgage mortgageCalculator = new Mortgage(
                principal,
                periodYears,
                interestRate
        );

        MortgageReport mortgageReport = new MortgageReport(mortgageCalculator);

        mortgageReport.printOutMortgage();
        mortgageReport.printOutPaymentSchedule();
    }

}
