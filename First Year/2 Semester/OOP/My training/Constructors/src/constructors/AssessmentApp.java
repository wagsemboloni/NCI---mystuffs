/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.util.Date;

/**
 *
 * @author Wagner Semboloni
 */
public class AssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Assessment a = new Assessment();
        a.setName("OOP Project");
        a.setType("Continuous Assessment");
        a.setWeighting(35);
        
        System.out.println("Assessment name: "+ a.getName());
        System.out.println("Assessment type: "+ a.getType());
        System.out.println("Assessment Weighting: "+ a.getWeighting());
        
        Assessment b = new Assessment("OOP Exam", "Terminal Assessment",60);
        System.out.println("================================");
        System.out.println("Assessment name: "+ b.getName());
        System.out.println("Assessment type: "+ b.getType());
        System.out.println("Assessment Weighting: "+ b.getWeighting());
        
        // A new instance of the Project class called p
        Date d = new Date(13,04,2015);
        Projects p = new Projects("OOP Project","Continous Assessment", 30, d );
        
        System.out.println(p.getName());
        System.out.println(p.getType());
        System.out.println(p.getWeighting());
        System.out.println(p.getDeadline());
        
        //A new instance of the test class
        
        Test t = new Test("OOP Exam", "Terminal exam", 70 , 10 , 60);
        System.out.println(t.getName());
        System.out.println(t.getType());
        System.out.println(t.getWeighting());
        System.out.println(t.getDuration());
        System.out.println(t.getNumQuestions());
        
    }
    
}
