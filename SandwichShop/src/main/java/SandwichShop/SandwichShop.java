package SandwichShop;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //Starts scanner
        Scanner sandwichShop = new Scanner(System.in);

        //ask user to choose a sandwich size
        System.out.println("Choose sandwich size (1 = Regular, 2 = Large):");

        // stores input into variable size
        int size = sandwichShop.nextInt();

        // based off input it finds the base price
        double basePrice;
        if (size == 1){
            basePrice = 5.45;
            System.out.println("You want a regular");
        } else if (size == 2) {
            basePrice = 8.95;
            System.out.println("You want a large");
        }else {
            System.out.println("Wrong size!");
            return;
        }
        // ask user if they want it loaded
        System.out.println("Would you like the sandwich loaded? (Y/N)");

        // clear the new line char
        sandwichShop.nextLine();

        // stores input into variable loaded
        String loaded = sandwichShop.nextLine().toUpperCase();

        // loaded price after user input
        if (loaded.equals("Y")){
            if (size == 1){
                basePrice += 1.00;
                System.out.println("That brings your price to " + "$" + basePrice);
            }else {
                basePrice += 1.75;
                System.out.println("That brings your price to " + "$" + basePrice);
            }
        }
        // ask user age for discount
        System.out.println("Whats your age you might be able to get a discount");

        // stores user input in variable age
        int age = sandwichShop.nextInt();

        //based of user age finds the discount amount
        double discount = 0.0;
        if (age <= 17){
            discount = 0.10;
            System.out.println("You get a 10% discount");
        } else if (age >= 65) {
            discount = 0.20;
            System.out.println("You get a 20% discount");
        }else {
            System.out.println("Sorry no discount for you");
        }
        // calculate final price
        double finalPrice = basePrice - (basePrice * discount);

        //tell user the final cost
        System.out.println("Your total is " + "$" + finalPrice);

    }
}
