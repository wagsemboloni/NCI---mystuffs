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
        Question q = new Question("When", "tomorrow", 10, "yesterday");
        MultiChoice mc = new MultiChoice("Who", "me", 20, "you", "opta", "optb", "optc");
        System.out.println(q.getDetails());        
        System.out.println(mc.getDetails());
    }
}
