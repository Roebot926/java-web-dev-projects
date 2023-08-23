package launchcode.launchcode;

import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args){
        int length;
        int width;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        length = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        width = input.nextInt();
        input.close();

        area = length*width;
        System.out.println("The are of the rectangle is: " + area);

    }

}
