/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author carole
 */
public class Director extends Manager{
    private double budget;
    
    public Director(String name, int empId, double salary, String deptName, double budget){
        super(name, empId, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    public String getDetails(){
        return super.getDetails()+"\n Budget:"+budget;
    }
    
}
