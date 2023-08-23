package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(11);
            nums.add(12);
            nums.add(13);
            nums.add(14);
            nums.add(15);
            nums.add(16);
            nums.add(17);
            nums.add(18);
            nums.add(19);
            nums.add(20);
            System.out.println(ArrayList_exercise.sumEven(nums));

            ArrayList<String> length = new ArrayList<>();
            length.add("Apple");
            length.add("Banana");
            length.add("Orange");
            length.add("Mango");
            length.add("Grape");
            length.add("Kiwi");
            length.add("Watermelon");
            length.add("Melon");
            length.add("Lichi");
            length.add("Strawberry");
            length.add("BlackBerry");
            System.out.println(ArrayList_exercise.wordLength(length));

}
}