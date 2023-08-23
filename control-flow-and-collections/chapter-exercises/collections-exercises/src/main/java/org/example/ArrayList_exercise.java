package org.example;

import java.util.ArrayList;

public class ArrayList_exercise {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for(int integer : arr) {
            if(integer % 2 == 0) {
                total += integer;
            }
        }
        return total;

    }

    public static ArrayList<String> wordLength(ArrayList<String> arr) {
        ArrayList<String> length = new ArrayList<>();
        for(String string: arr){
            if(string.length() == 5) {
                length.add(string);
            }
        }
        return length;
    }

}
