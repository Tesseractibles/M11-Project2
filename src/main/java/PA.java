package com.company;

public class PA extends com.company.Crew {
    protected int hoursWorked;

    public PA(String name, double pay, double payEarned, int hoursWorked, String department) {
        super(name, pay, payEarned, department);
        this.hoursWorked = hoursWorked;
        this.payEarned = hoursWorked * pay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
