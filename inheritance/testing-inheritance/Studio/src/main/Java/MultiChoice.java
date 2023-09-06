public class MultiChoice extends Question{

    public MultiChoice(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getaAnswer();
        if (answer.equalsIgnoreCase(this.getaAnswer())) {
            return true;
        } else {
            return false;
        }
    }
}
