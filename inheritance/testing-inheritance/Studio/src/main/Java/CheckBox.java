public class CheckBox extends Question{

    public CheckBox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer){
        String actualAnswer = this.getaAnswer();
            if(answer.equalsIgnoreCase(actualAnswer)){
                return true;
            }else{
                return false;
            }
    }
}
