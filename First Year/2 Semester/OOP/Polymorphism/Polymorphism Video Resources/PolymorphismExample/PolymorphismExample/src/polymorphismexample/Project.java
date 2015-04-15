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
public class Project extends Assessment{
    private Date deadline;
    
    public Project(String name, String type, int weighting, Date deadline){
        super(name, type, weighting);
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    
    
}
