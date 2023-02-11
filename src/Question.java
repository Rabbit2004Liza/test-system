public class Question {
    private int number;
    private String text;
    private Answer[] answerOptions = new Answer[4];
    private int rightAnswer;
    public Question(int number, String text, Answer[] answerOptions)
    {
        this.number = number;
        this.text = text;
        for (int i = 0; i < this.answerOptions.length; i++) {
            this.answerOptions[i] = answerOptions[i];
        }
        for (int i = 0; i < answerOptions.length; i++) {
            if (answerOptions[i].getIsRight())
                this.setRightAnswer(i+1);
        }
    }
    private void setRightAnswer(int rightAnswer)
    {
        this.rightAnswer = rightAnswer;
    }
    public int getRightAnswer()
    {
        return this.rightAnswer;
    }
    public void printQuestionAndAnswerOptions(){
        System.out.println(this.text);
        for (int i = 0; i < answerOptions.length; i++) {
            System.out.println(i+1+") "+this.answerOptions[i].getText());
        }
    }

}
