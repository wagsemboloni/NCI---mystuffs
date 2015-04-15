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
        
        Employee emp;
        Engineer eng;
        Consultant con;
        Manager man;
        Director dir;
        
        emp = new Employee("Philip Scott", 101);
        eng = new Engineer("Jack Jones", 101, 20000.0);
        con = new Consultant("Jane Smith", 102, 10, 20.0);
        man = new Manager ("Frank O'Reilly", 103, 40000, "Marketing");
        dir = new Director("Jill Connor", 104, 60000, "Marketing", 1000000);
        
        System.out.println(emp.getDetails());
        System.out.println(eng.getDetails());
        System.out.println(con.getDetails());
        System.out.println(man.getDetails());
        System.out.println(dir.getDetails());
        
        // Now declare a two more Employee objects
        Employee e1, e2;
        
        // Construct Employee e1 to be a Manager and Employe e2 to be a Director
        e1 = new Manager("Paul Ross", 103, 40000, "Marketing");
        e2 = new Director("Caroline Noonan", 104, 60000, "Marketing", 1000000);

        // Check to see if e1 an instance of Manager, if it is change the deptName 
        // type and print getDetails
        if (e1 instanceof Manager){
            Manager m = (Manager) e1;
            System.out.print("Before Change: "+m.getDetails());

            m.setDeptName("Finance");
            System.out.print("After Change:"+m.getDetails());
        }
        // Check to see if e1 an instance of Manager, if it is change the deptName 
        // type and the size of budget and print getDetails
         if (e2 instanceof Director){
            Director d = (Director) e2;
            System.out.print("Before Change:"+d.getDetails());
            d.setDeptName("HR");
            d.setBudget(2000000);
            System.out.print("After Change:"+d.getDetails());
        }
    }
}
