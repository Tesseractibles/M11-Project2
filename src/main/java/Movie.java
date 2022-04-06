package com.company;

import java.util.*;

public class Movie {
    protected String genre;
    protected com.company.Director director;
    protected List<com.company.Actor> actors;
    protected List<com.company.Crew> crew;
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profit;


    public Movie(String genre, com.company.Director director, List<com.company.Actor> actors, List<com.company.Crew> crew, double budget, double moneyEarned) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneyEarned = moneyEarned;
    }


    public double calculateProfit() {
        double moneyEarned = getMoneyEarned();
        double moneySpent = getMoneySpent();
        double budgetTotal = getBudget();
        return (moneyEarned - moneySpent) + budgetTotal;
    }

    public double payDay() {

        double totalActorPay = 0;
        double totalCrewPay = 0;
        double payTotal = 0;


        for (int i = 0; i < actors.size(); i++) {
            totalActorPay += actors.get(i).getPayEarned();
        } for (int i=0; i < crew.size(); i++) {
            totalCrewPay += crew.get(i).getPayEarned();
        }

        payTotal = totalActorPay + totalCrewPay;

        moneySpent += payTotal;

        return payTotal;
    }

    public String getGenre() {
        return genre;
    }

    public com.company.Director Director() {
        return director;
    }

    public List<com.company.Actor> getActors() {
        return actors;
    }

    public List<com.company.Crew> getCrew() {
        return crew;
    }

    public double getBudget() {
        return budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public double getProfit() {
        return calculateProfit();
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(com.company.Director director) {
        this.director = director;
    }

    public void setActors(ArrayList<com.company.Actor> actors) {
        this.actors = actors;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCrew(ArrayList<com.company.Crew> crew) {
        this.crew = crew;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
