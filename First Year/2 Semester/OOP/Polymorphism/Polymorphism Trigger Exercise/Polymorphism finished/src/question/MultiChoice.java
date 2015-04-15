package question;

public class MultiChoice extends Question {
    //data members - only attributes exclusive to MultiChoice quetsions
    private String optionA;
    private String optionB;
    private String optionC;
    
    //overloaded constructor - parameters include all att's from Question and those from Multichoice question
    public MultiChoice(String questionText, String correctAnswer, int mark, String answer, String optionA, String optionB, String optionC){
        super(questionText, correctAnswer,mark,answer);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }
    
    //getters and setters for only new data members
    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+ " \nOptionA: "+optionA+"\n Option B: "+optionB +"\n OptionC: "+optionC;
    }
}










