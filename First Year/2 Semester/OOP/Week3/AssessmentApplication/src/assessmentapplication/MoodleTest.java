/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentapplication;

import java.util.Date;

/**
 * MoodleTest.java
 * 5th Feb 2013
 * @author fsheridan
 */
public class MoodleTest extends Test{
    private Date open;
    private Date closed;
    private String password;
    
    public MoodleTest(int weighting, String name, String type, int numQuestions, int duration, Date open, Date closed, String password){
        super(weighting, name, type, numQuestions, duration);
        this.open = open;
        this.closed = closed;
        this.password = password;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
