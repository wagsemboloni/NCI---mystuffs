package question;

public class Question {
    //data members - attributes common to all types of questions
    private String questionText;
    private String correctAnswer;
    private int mark;
    private String answer;
    
    //overloaded constructor - used to create a new object and set values of all variables
    public Question(String questionText, String correctAnswer, int mark, String answer){
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.mark = mark;
        this.answer = answer;
    }
    //getters and setters for all data members
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }   
           
    public String getDetails(){
        return "Question:"+questionText+" \n Correct Answer: "+correctAnswer+ "\n Mark:"+mark+"\n Answer:"+answer;
    }
}










