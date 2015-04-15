/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismexample;

import java.util.Date;

/**
 *
 * @author fsheridan
 */
public class MoodleTest extends Test {
    private Date open;
    private Date closed;
    private String password;
    
    public MoodleTest(String name, String type, int weighting, int numQuestions, int duration, Date open, Date closed, String password){
        super(name, type, weighting, numQuestions, duration);
        this.open = open;
        this.closed = closed;
        this.password = password;
    }
    
}
