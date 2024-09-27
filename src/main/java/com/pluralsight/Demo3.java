package com.pluralsight;

public class Demo3 {

//    public static void main(String args[]){
//        int count = 11;
//        float unitPrice = 7.12f; //this is an error without the f
//        float taxRate = 0.825f;
//        float totalCost;
//        totalCost = (count * unitPrice) * (1 + taxRate);
//        System.out.println(totalCost);
//    }

    public static void main(String[] args) {
        int natKidCount = 2, brittKidCount = 4;
        int mostKids = Math.max(natKidCount, brittKidCount);
        System.out.println(
                "The biggest family has " + mostKids + " kids");
    }
}
