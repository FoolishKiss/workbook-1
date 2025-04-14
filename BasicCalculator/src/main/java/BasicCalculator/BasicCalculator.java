package BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner basicCalculator = new Scanner(System.in);
        // ask user for first number
        System.out.print("Enter first number 1: ");
        //user provides first number
        int num1 = basicCalculator.nextInt();

        // ask user for second number
        System.out.print("Enter second number 2: ");
        // user provides second number
        int num2 = basicCalculator.nextInt();

        // eats up leftover CRLF
        basicCalculator.nextLine();

        // ask user what they want to do
        System.out.println("What do you want to do? ");
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");

        // user picks option
        String userOption = basicCalculator.nextLine().toUpperCase();

        // Result
        int result = 0;

        // shows operator symbol
        String operator = "";


        // operations when chose
        if (userOption.equals("A")) {
            operator = "+";
            result = addNum(num1, num2);
        } else if (userOption.equals("S")) {
            operator = "-";
            result = subtractNum(num1, num2);
        } else if (userOption.equals("M")) {
            operator = "*";
            result = multiplyNum(num1, num2);
        } else if (userOption.equals("D")) {
            operator = "/";
            result = divideNum(num1, num2);
        }
        // print out answer for user
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }
    // function for *
    public static  int multiplyNum(int num1, int num2){
        return num1 * num2;
    }
    // function for +
    public static  int addNum(int num1, int num2){
        return num1 + num2;
    }
    // function for -
    public static  int subtractNum(int num1, int num2){
        return num1 - num2;
    }
    // function for /
    public static  int divideNum(int num1, int num2){
        return num1 / num2;
    }
}
