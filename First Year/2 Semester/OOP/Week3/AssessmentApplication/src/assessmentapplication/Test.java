/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentapplication;

/**
 *Test.java
 * 5th Feb 2013
 * @author fsheridan
 */
public class Test extends Assessment {
    private int numQuestions;
    private int duration;
    
    public Test(int weighting, String name, String type, int numQuestions, int duration){
        super(weighting, name, type);
        this.numQuestions = numQuestions;
        this.duration = duration;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
