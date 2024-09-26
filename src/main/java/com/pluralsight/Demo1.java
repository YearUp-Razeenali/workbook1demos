package com.pluralsight;

public class Demo1 {

    public static void main(String [] args){
        System.out.println("Hello World");

       //int identifer = 1;
        String name = "Razeen";


        String greeting = "Hello " + name;

        int number_of_days_per_week_watches_TV = 5;
        int minsPerDayOnAverage = 70;

        int minsPerWeek = number_of_days_per_week_watches_TV * minsPerDayOnAverage;
        int minPerYear = minsPerWeek * 52;

        int hoursPerYear = minPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        int workWeeksPerYearWatchingTV2 = (5 * 70  *  52 / 60 ) / 35;

        System.out.println("If "+name+ " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " Week vacation every year.");

        System.out.println("If "+name+ " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV2 + " Week vacation every year.");

        System.out.println(greeting);

    }

}
