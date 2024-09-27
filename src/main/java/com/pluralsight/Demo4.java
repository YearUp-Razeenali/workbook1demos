package com.pluralsight;

import java.util.*;

public class Demo4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        //String name = "Razeen";

        System.out.print("Hi, whats your name? ");
        String name = s.nextLine();
        String greeting = "Hello " + name;

//        int number_of_days_per_week_watches_TV = 5;
//        int minsPerDayOnAverage = 70;

        System.out.print("On average, how many day a week do you watch TV? ");
        int number_of_days_per_week_watches_TV = s.nextInt();
        s.nextLine();

        System.out.print("When you do watch tv, how many mins do you watch? ");
        int minsPerDayOnAverage = s.nextInt();
        s.nextLine();

        int minsPerWeek = number_of_days_per_week_watches_TV * minsPerDayOnAverage;
        int minPerYear = minsPerWeek * 52;

        int hoursPerYear = minPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        //int workWeeksPerYearWatchingTV2 = (5 * 70  *  52 / 60 ) / 35;

        System.out.println("If "+name+ " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " Week vacation every year.");

        //System.out.println("If "+name+ " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV2 + " Week vacation every year.");

        //System.out.println(greeting);

    }

}
