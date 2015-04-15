/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleguiapplication;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author carole
 */
public class SimpleGUI extends JFrame{
        //declare objects
        private JPanel p;
        private JLabel num1JLabel;
        private JLabel num2JLabel;
        private JTextField num1JTextField;
        private JTextField num2JTextField;
        private JButton addJButton;
        private JButton mulJButton;
    
        public SimpleGUI(){
            setSize(500, 250);  //set size of JFrame
            setLocation(10, 10);//set Location of JFrame on Screen
        
            p = new JPanel();//create panel
            p.setLayout(null);//set layout of panel
            p.setBackground(Color.red);
            add(p); //add panel to JFrame

            //create objects
            num1JLabel = new JLabel("Enter Numer 1:");
            num2JLabel = new JLabel("Enter Numer 2:");
            num1JTextField = new JTextField();
            num2JTextField = new JTextField();
            addJButton = new JButton("Add");
            mulJButton = new JButton("Multiply");
            
            //set bounds		 
            num1JLabel.setBounds(10, 10, 200, 30); //x, y, width, height
            num2JLabel.setBounds(10, 50, 200, 30);
            num1JTextField.setBounds(230, 10, 200, 30);
            num2JTextField.setBounds(230, 50, 200, 30);
            addJButton.setBounds(10, 100, 200, 30);
            mulJButton.setBounds(230, 100, 200, 30);

            //add objects to panel
            p.add(num1JLabel);
            p.add(num2JLabel);
            p.add(num1JTextField);
            p.add(num2JTextField);
            p.add(addJButton);
            p.add(mulJButton);
        }
}
