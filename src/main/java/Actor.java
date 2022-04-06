package com.company;

public class Actor extends com.company.Person {
    protected String role;


    public Actor(String name, double pay, double payEarned, String role) {
        super(name, pay, payEarned);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
