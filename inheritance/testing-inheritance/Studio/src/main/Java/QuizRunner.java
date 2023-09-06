
import java.util.Scanner;
public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultiChoice mc = new MultiChoice("Who was the first female Astronaut?" + "\nA: Sally Rode \nB: Sally Raid \nC: Salty Sally \nD: Sally Ride", "D");
        myQuiz.addQuestion(mc);

        TrueFalse tf = new TrueFalse("\nWas Sally Ride the first female Astronaut"+ "\nTrue or False", "true");
        myQuiz.addQuestion(tf);

        CheckBox cb = new CheckBox("\nSally Ride liked Playing Which sports in her free time?"+"\nA: Tennis \nB: Volleyball \nC: Soccer \nD: Softball", "A B D");
        myQuiz.addQuestion(cb);



        myQuiz.runQuiz();
    }
}
