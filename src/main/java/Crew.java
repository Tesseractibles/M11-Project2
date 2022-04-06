package com.company;

public class Crew extends com.company.Person {
    protected String department;


    public Crew(String name, double pay, double payEarned, String department) {
        super(name, pay, payEarned);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
