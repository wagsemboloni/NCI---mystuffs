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
public class Essay extends StudentQuiz {
    private int maxWordsCount;
    
    public Essay(String questionText, String correctAns, String ans, int mark, int maxWordsCount){
        super(questionText, correctAns, ans, mark);
        this.maxWordsCount = maxWordsCount;
    }
    
    public int computeWordsCount(){
        String userAns = super.getAns();
        for(int i = 0; i < userAns.length();i++){
            if(userAns.charAt(i)== ' '){
                maxWordsCount++;            
            } 
        }
        return maxWordsCount + 1;
    }

    public int getMaxWordsCount() {
        return computeWordsCount();
    }
    
    
    
}
