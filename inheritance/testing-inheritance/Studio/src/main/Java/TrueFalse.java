
public class TrueFalse extends Question{


    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer){
        if(answer.equalsIgnoreCase(this.getaAnswer())){
            return true;
        }else{
            return false;
        }
    }
}
