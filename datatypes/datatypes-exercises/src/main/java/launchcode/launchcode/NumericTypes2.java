package launchcode.launchcode;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main (String[] args){
        double numMiles;
        double amountGas;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter number of Miles Driven:");
        numMiles = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Please enter amount of Gas consumed:");
        amountGas = input.nextDouble();
        input.close();

        double mpg = numMiles / amountGas;
        System.out.println("Your running on "+ mpg + " mpg.");

    }
}
