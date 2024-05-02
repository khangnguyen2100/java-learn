package com.javaLearn.Mortgage;

public class Mortgage {
    private final static byte MONTHS = 12;
    private final static byte PERCENT = 100;
    private float principal;
    private int years;
    private float interestRate;
    private int periodMonths;
    private float monthInterestRate;

    public Mortgage(
            float principal,
            int years,
            float interestRat
    ) {
        setPrincipal(principal);
        setYears(years);
        setInterestRat(interestRat);
    }


    // methods
    public float handleCalcMortgage() {
        // calculating mortgage
        float x = (float) Math.pow(1 + monthInterestRate, periodMonths);
        return principal * ((monthInterestRate * x) / (x - 1));
    }

    public double handleCalcMortgageBalance(
            short numberOfPaymentMade
    ) {
        // calculating mortgage
        float x = (float) Math.pow((1 + monthInterestRate), periodMonths);
        return (float) (
                principal * (x - Math.pow((1 + monthInterestRate), numberOfPaymentMade)) /
                        (x - 1)
        );
    }

    public double[] getRemainingBalances() {
        short numberOfPaymentMade = 1;
        double[] balances = new double[periodMonths];

        do {
            double result = handleCalcMortgageBalance(numberOfPaymentMade);

            balances[numberOfPaymentMade - 1] = result;
            numberOfPaymentMade++;

        } while (numberOfPaymentMade <= periodMonths);
        return balances;
    }

    // getter and setter
    private float getPrincipal() {
        return principal;
    }

    private void setPrincipal(float principal) {
        this.principal = principal;
    }

    private int getYears() {
        return years;
    }

    private void setYears(int years) {
        this.years = years;
        this.periodMonths = years * MONTHS;
    }

    private float getInterestRat() {
        return interestRate;
    }

    private void setInterestRat(float interestRate) {
        this.interestRate = interestRate;
        this.monthInterestRate = interestRate / PERCENT / MONTHS;
    }
}
