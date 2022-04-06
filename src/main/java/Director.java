package com.company;

public class Director extends com.company.Crew {
    private double royalty;

    public Director(String name, double pay, double payEarned, String department) {
        super(name, pay, payEarned, department);
        royalty = 0.01;
    }

    public double royaltiesEarned(double movieProfits) {
        return movieProfits * royalty;
    }

    public double getRoyalty() {
        return royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }
}
