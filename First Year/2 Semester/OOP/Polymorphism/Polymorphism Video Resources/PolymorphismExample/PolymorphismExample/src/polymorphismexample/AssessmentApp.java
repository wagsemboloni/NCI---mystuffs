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
public class AssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assessment a = new Test("OOP Exam", "Terminal", 30, 10, 60);
        System.out.println(a.getDetails());
        
        a.changeDuration(a,120);
        System.out.println(a.getDetails());
        
        
        

        
        
    }
}
