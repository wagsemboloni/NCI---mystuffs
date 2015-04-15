/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.util.Date;

/**
 *
 * @author Wagner de Oliveira       
 */
public class Projects extends Assessment{
    private Date deadline;
    
    public Projects(String name, String type, int weighting, Date deadline){
        super(name, type, weighting);
        this.deadline = deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }
    
}
