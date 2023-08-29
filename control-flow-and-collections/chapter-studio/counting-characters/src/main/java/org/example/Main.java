package org.example;
//Not sure why this isn't working.
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> individual = new HashMap<>();


        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be " +
                "zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        char[] charactersInString = quote.toCharArray();

        for(char i : charactersInString) {
            if (individual.containsKey(i)){
                individual.put(i, individual.get(i) +1);
            }else{
                individual.put(i, 1);
            }
            }
        for (Map.Entry entry : individual.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}