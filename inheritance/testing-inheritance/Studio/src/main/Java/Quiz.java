import java.lang.reflect.Array;
import java.security.DigestException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question a){
        this.questions.add(a);
    }


    public void runQuiz(){
        double i = 0;
        for (Question a: questions){
            System.out.println(a.getaQuestion());
            String userInput = sc.nextLine();
            if (a.checkAnswer(userInput)){
                i++;
            }
        }
        System.out.println("Grade: " + df.format(gradeQuiz(i))+"%");
    }

    public double gradeQuiz(double correct){
        return correct/3 * 100;
    }

}
