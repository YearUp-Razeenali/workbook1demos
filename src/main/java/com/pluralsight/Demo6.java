package com.pluralsight;

import java.util.*;

public class Demo6 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        //Scanner s2 = new Scanner(System.in); could be named anything but using on we use lower-case Scanner

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Howdy " + name);

    }
}
