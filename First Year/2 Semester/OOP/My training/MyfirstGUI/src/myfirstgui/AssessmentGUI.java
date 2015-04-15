/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgui;


import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Wagner de Oliveira
 */
public class AssessmentGUI extends JFrame{
        //declare objects
    
    private JPanel p;
    private JLabel titleLbl;
    private JLabel nameLbl;
    private JLabel typeLbl;
    private JLabel weightingLbl;
    private JTextField nameTf;
    private JTextField typeTf;
    private JTextField weightingTf;
    private JButton addBtn;
    
    public AssessmentGUI(){
       //set size and location of jframe
        setSize(500,500);
        setLocation(10,10);
        
        //create panel
        p = new JPanel();
        //set panel layout
        p.setPanel(null);
        //set background colour of panel
        p.setBackground(color.white);
        //add panel to jframe
        add(p);
        
        //create objects
        titleLbl = new JLabel("Assessment Label"):
        nameLbl = new JLabel("Assessment Name:");
        typeLbl = new JLabel("Assessment type:");
        weighting = new JLabel("Assessment Weighting:");
        
        nameTf = new JTextField();
        typeTf = new JTextField();
        weightingTf = new JTextField();
        
        addBtn = new Jbutton("Add Assessment");
        
        //set bounds of objects (x, y, width, height
        
        titleLbl.setBounds(10, 10, 200, 30);
        nameLbl.setBounds(10, 50, 200, 30);
        typeLbl.setBounds(10, 100, 200, 30);
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
