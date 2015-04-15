/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentapplication;

/**
 *
 * @author fsheridan
 */
public class AssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t = new Test(30, "OOPTest", "MidTerm", 10, 20);
        
        System.out.println("Test 1:" + " Name: "+ t.getName()+ " Type: "+t.getType()+" Weighting" + t.getWeighting()+ " Duration:" + t.getDuration() + " Num Questions" + t.getNumQuestions());
    }
}
