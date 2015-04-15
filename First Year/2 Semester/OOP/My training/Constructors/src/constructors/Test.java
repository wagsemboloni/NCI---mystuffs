/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author Wagner de Oliveira
 */
public class Test extends Assessment {
    private int numQuestions, duration;
    
    public Test(String name, String type, int weighting, int numQuestions, int duration){
        super(name, type, weighting);
        this.numQuestions = numQuestions;
        this.duration = duration;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getDuration() {
        return duration;
    }
    
}
