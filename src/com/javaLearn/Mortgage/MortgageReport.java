package com.javaLearn.Mortgage;

import java.text.NumberFormat;

public class MortgageReport {
    public static final NumberFormat NUMBER_FORMAT = NumberFormat.getCurrencyInstance();
    final private Mortgage mortgage;

    public MortgageReport(Mortgage mortgage) {
        this.mortgage = mortgage;
    }

    public void printOutPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        double[] balances = mortgage.getRemainingBalances();
        for (int i = 1; i <= balances.length; i++) {
            System.out.println(
                    "Month " + i + " payment: " +
                            NUMBER_FORMAT.format(Math.round(balances[i - 1])));
        }
        System.out.println();
    }

    public void printOutMortgage() {
        float result = mortgage.handleCalcMortgage();
        String formattedMortgage = NUMBER_FORMAT.format(Math.round(result));

        System.out.println("MORTGAGE");
        System.out.println("----------------");
        System.out.println("Month payment: " + formattedMortgage);
        System.out.println();
    }
}
