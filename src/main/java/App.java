package com.company;

import java.util.*;

public class App {
    public static void main(String[] args) {


        List<Actor> actorList = new ArrayList<>();
        List<Crew> crewList = new ArrayList<>();

        com.company.Person person = new com.company.Person("Ramu", 50, 50);
        Actor actor = new Actor("Shyam", 5000, 5000.00, "Extra");
        Crew crew = new Crew("Shant", 300.00,300.00, "Collections");
        Director director = new Director("Vijay", 1000.00, 1000.00, "Movie Creation");
        PA pa = new PA("Ravana", 500.00, 500.00, 50 , "Movie creation");
        Movie movie = new Movie("Fiction", director, actorList, crewList, 25000000.00, 5000000.00);


        actorList.add(actor);
        crewList.add(director);
        crewList.add(pa);
        crewList.add(crew);


        double initialMovieBudget = movie.getBudget();
        double totalPayout = movie.payDay();
        double paPay = pa.getPayEarned();
        double movieMoneySpent = movie.getMoneySpent();
        double movieProfit = movie.getProfit();
        double directorRoyalties = director.royaltiesEarned(movieProfit);
        double afterDirectorProfit = movieProfit - directorRoyalties;


        System.out.format("\nPaPay: %.2f", paPay);
        System.out.format("\nMoney Spent (including payday): %.2f", movieMoneySpent);
        System.out.format("\nProfits: %.2f", movieProfit);
        System.out.format("\nDirector Royalties: %.2f",directorRoyalties);
        System.out.format("\nAfter paying director profit: %.2f\n",afterDirectorProfit);
    }
}
