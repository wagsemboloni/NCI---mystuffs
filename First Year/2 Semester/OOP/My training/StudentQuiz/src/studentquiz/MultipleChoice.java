/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentquiz;

/**
 *
 * @author Wagner de Oliveira   
 */
public class MultipleChoice extends StudentQuiz {
    private String optionA, optionB, optionC, optionD;
    
    public MultipleChoice(String questionText, String correctAns, String ans, int mark, String optionA, String optionB, String optionC, String optionD){
        super(questionText, correctAns, ans, mark);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }
    @Override
    public String getDetails(){
         return "Option A:"+optionA+" \n Option B: "+optionB+ "\n Option C:"+optionC+"\n Option D:"+optionD;
    }
}
