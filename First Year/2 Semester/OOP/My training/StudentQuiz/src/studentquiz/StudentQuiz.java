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
public class StudentQuiz {
    private String questionText, correctAns, ans;
    private int mark;
    
    public StudentQuiz(){
        questionText = new String();
        correctAns = new String();
        ans = new String();
        mark = 0;
    }
    //overload Constructor
    public StudentQuiz(String questionText, String correctAns, String ans, int mark){
        this.questionText = questionText;
        this.correctAns = correctAns;
        this.ans = ans;
        this.mark = mark;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public String getAns() {
        return ans;
    }

    public int getMark() {
        return mark;
    }
    
    public String getDetails(){
        return "Question:"+questionText+" \n Correct Answer: "+correctAns+ "\n Mark:"+mark+"\n Answer:"+ans;
    }
    
    
}
