/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author carole
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // This applications creates 4 people who work at a firm
        // one Manager, one Director, one Consultant and one Engineer
        // It tests the constructor and prints out the details of each 
        // method
        
        Engineer e;
        e = new Engineer("Jack Jones", 101, 20000.0);
        Consultant c = new Consultant("Jane Smith", 102, 10, 20.0);
        Manager m = new Manager ("Frank O'Reilly", 103, 40000, "Marketing");
        Director d = new Director("Jill Connor", 104, 60000, "Marketing", 1000000);
        
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Employee ID: "+e.getEmpId());        
        System.out.println("Employee Salary: "+e.getSalary());
        System.out.println(" ============================== ");
    
        
     
        System.out.println("Employee Name: "+c.getName());
        System.out.println("Employee ID: "+c.getEmpId());        
        System.out.println("Employee Salary: "+c.getSalary());
        System.out.println(" ============================== ");

        System.out.println("Employee Name: "+m.getName());
        System.out.println("Employee ID: "+m.getEmpId());        
        System.out.println("Employee Salary: "+m.getSalary());
        System.out.println("Dept Name: "+m.getDeptName());
        System.out.println(" ============================== ");
        
        System.out.println("Employee Name: "+d.getName());
        System.out.println("Employee ID: "+d.getEmpId());        
        System.out.println("Employee Salary: "+d.getSalary());
        System.out.println("Dept Name: "+d.getDeptName());
        System.out.println("Dept Budget: "+ d.getBudget());
        System.out.println(" ============================== ");
    }
}
