package rentalCarCalculator;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        // starts scanner to get user inputs
        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter pick up date: "); // ask user for pickup date
        String pickupDate = userInput.nextLine();  // gets user input and puts it in variable pickup date

        System.out.println("Enter number of rental days: ");  // ask user for number of rental days
        int rentalDays = userInput.nextInt();  // gets user input and put into variable rental days

        // clears leftover new line char
        userInput.nextLine();

        System.out.println("Do you want the electric toll tag? (yes or no): ");  // ask user if they want electronic toll tag
        String tollTag = userInput.nextLine();  // take user input and put into variable toll tag
        boolean wantsTollTag = tollTag.equalsIgnoreCase("yes");  // if user input is yes the wantTollTag is true

        System.out.println("Do you want GPS? (yes or no): "); // ask if user wants GPS
        String gps = userInput.nextLine();  // take user input and put into variable gps
        boolean wantsGps = gps.equalsIgnoreCase("yes");  // if user input is yes wantGps is true

        System.out.println("Do you want roadside assistance? (yes or no): ");  //ask user if they want roadside assistance
        String roadsideAssistance = userInput.nextLine();  // take user input and put into variable roadsideAssistance
        boolean wantsRoadsideAssistance = roadsideAssistance.equalsIgnoreCase("yes");  // if user input is yes wantsRoadsideAssistance is true


        System.out.println("Enter your age: ");  //ask user for age
        int age = userInput.nextInt();  // take user input and put into variable age


        double baseRate = 29.99;  // rental rate
        double basicCost = rentalDays * baseRate;  // cost before options
        double tollTagRate = 3.95;  // toll tag rate
        double gpsRate = 2.95;  // gps rate
        double roadsideRate = 3.95;  // roadside assistance rate
        double optionsCost = 0.0;  // options start at 0

        // based off user inputs calculates options cost
        if (wantsTollTag) {
            optionsCost += rentalDays * tollTagRate;
        }
        if (wantsGps) {
            optionsCost += rentalDays * gpsRate;
        }
        if (wantsRoadsideAssistance) {
            optionsCost += rentalDays * roadsideRate;
        }

        // underage surcharge starts at 0
        double underageSurcharge = 0.0;

        // if user is under 25 has to pay 30% more
        if (age < 25) {
            underageSurcharge = basicCost * 0.30;
        }

        // total cost
        double totalCost = basicCost + optionsCost + underageSurcharge;

        // Display the results to user
        System.out.println("\n ---Rental Summary---");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.println("Rental Days: " + rentalDays);

        System.out.printf("Base Rental Cost: $%.2f\n", basicCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf("Underage Surcharge Cost: $%.2f\n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);



    }
}