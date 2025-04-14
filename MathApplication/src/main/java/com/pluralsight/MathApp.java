package com.pluralsight;

import static java.lang.Math.copySign;

public class MathApp {

    // This is the main method where all my code will run
    public static void main(String[] args) {

        int bobs_salary = 55000;
        int garys_salary = 100000;

        int highestSalary = Math.max(bobs_salary, garys_salary);

        System.out.println("1. The Highest salary is " + highestSalary);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        int carPrice = 150000;
        int truckPrice = 160000;

        System.out.println("2. The lowest price is " + Math.min(carPrice,truckPrice));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double radius = 7.25;
        double area = Math.PI * radius * radius;

        System.out.println("3. Area of the circle is " + area);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("4. The square root of " + number + " is " + squareRoot);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;


        double distanceBetween =Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("5. Distance between the two points " + distanceBetween);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double value = -3.8;

        double absoluteValue = Math.abs(value);

        System.out.println("6. The absolute value is " + absoluteValue);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        double random_number = Math.random();

        System.out.println("7. Random Number = " + random_number);
        





    }
}
