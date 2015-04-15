/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgui2;

/**
 *
 * @author Wagner Semboloni
 */
import java.awt.Color;
import javax.swing.*;
public class AssessmentGUI extends JFrame {
    //declare objects section
    private JPanel p;
    private JLabel titleLbl;
    private JLabel nameLbl;
    private JLabel typeLbl;
    private JLabel weightingLbl;
    
    //text field 
    private JTextField nameTf;
    private JTextField typeTf;
    private JTextField weightingTf;
    
    //;button
    private JButton addBtn;
    
    //constructor
    public AssessmentGUI(){
       //set size and location of the jframe
        setSize(500, 500);
        setLocation(10, 10);
        
        //create the panel
        p = new JPanel();
        
        //set the panel layout
        p.setLayout(null);
        
        //set background
        p.setBackground(Color.white);
        
        //add the panel to the jframe
        add(p);
        
        //create objects
        titleLbl = new JLabel ("Assessment Label");
        nameLbl = new JLabel("Assessment Name:");
        typeLbl = new JLabel("Assessment Type: ");
        weightingLbl = new JLabel("Assessment Weighting: ");
        
        nameTf = new JTextField();
        typeTf = new JTextField();
        weightingTf = new JTextField();
        
        //button
        addBtn = new JButton("Add Assessement");
        
        //set the bounds of each objects (x, y, width, height)
        titleLbl.setBounds(10, 10, 200, 30);
        nameLbl.setBounds(10, 50, 200, 30);
        typeLbl.setBounds(10 , 100, 200, 30);
        weightingLbl.setBounds(10, 150, 200, 30);
        
        nameTf.setBounds(230, 50, 200, 30);
        typeTf.setBounds(230, 100, 200, 30);
        weightingTf.setBounds(230, 150, 200, 30);
        
        addBtn.setBounds(10, 200, 150, 30);
        
        p.add(titleLbl);
        p.add(nameLbl);
        p.add(typeLbl);
        p.add(weightingLbl);
        p.add(nameTf);
        p.add(typeTf);
        p.add(weightingTf);
        p.add(addBtn);
        
    }
    
    
}
