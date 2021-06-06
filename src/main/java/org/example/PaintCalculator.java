/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {

        final double coverage = 350.0;

        Scanner getWidth = new Scanner(System.in);
        Scanner getLength = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        Integer length= getLength.nextInt();

        System.out.print("What is the width of the room in feet? ");
        Integer width = getWidth.nextInt();

        Integer area_ft = length * width;

        // Big Brain forcing the round up amirite?
        Integer gallons = (int) Math.ceil(area_ft / coverage);

        System.out.println(String.format("You will need to purchase %d gallons of paint to cover %d square feet.",gallons,area_ft));

    }
}
