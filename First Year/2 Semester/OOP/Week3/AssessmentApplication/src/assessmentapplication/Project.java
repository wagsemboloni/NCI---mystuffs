/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentapplication;

import java.util.Date;

/**
 * Project.java
 * 5th Feb 2013
 * @author fsheridan
 */
public class Project extends Assessment{
    private Date deadline;
    
    public Project(int weighting, String name, String type, Date deadline){
        super(weighting, name, type);
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
}
