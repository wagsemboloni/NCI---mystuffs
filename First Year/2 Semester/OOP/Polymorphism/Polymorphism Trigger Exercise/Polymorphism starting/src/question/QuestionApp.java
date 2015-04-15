/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author room3.03
 */
public class QuestionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question q = new Question("When", "there", 10, "there");
        MultiChoice mc = new MultiChoice("Who", "me", 20, "there", "opt1", "opt2", "opt3");
        System.out.println("done");        
    }
}
