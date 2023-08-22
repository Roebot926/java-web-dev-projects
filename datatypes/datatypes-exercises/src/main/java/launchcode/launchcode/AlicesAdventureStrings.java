package launchcode.launchcode;

import java.util.Locale;
import java.util.Scanner;
public class AlicesAdventureStrings {
    public static void main(String[] args){
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, ‘and what is the use of " +
                "a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what word do you want to search for:");
        String word = input.nextLine();
        String str1 = str.toLowerCase();
        String word1 = word.toLowerCase();

        System.out.println(str1.contains(word1));

        Integer index = str.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = str.replace(word,"");

        System.out.println(modifiedSentence);
    }
}
