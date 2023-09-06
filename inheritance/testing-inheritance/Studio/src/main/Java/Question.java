public abstract class Question {
    private String aQuestion;
    private String aAnswer;

    public Question(String question, String answer){
        this.aQuestion = question;
        this.aAnswer = answer;
    }

    public String getaQuestion() {
        return aQuestion;
    }

    public void setaQuestion(String aQuestion) {
        this.aQuestion = aQuestion;
    }

    public String getaAnswer() {
        return aAnswer;
    }

    public void setaAnswer(String aAnswer) {
        this.aAnswer = aAnswer;
    }

    public abstract boolean checkAnswer(String answer);
}
