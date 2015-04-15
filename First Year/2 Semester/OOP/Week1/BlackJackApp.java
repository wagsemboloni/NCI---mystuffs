/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author colm
 */
public class BlackJackApp {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String answer = "";
        BlackJack myBlackJack = new BlackJack();
        myBlackJack.dealHand();
        do{
            answer = JOptionPane.showInputDialog(null, myBlackJack.getCurrentHand() + ", Would you like another card? (y/n").toLowerCase();
            if(answer.equals("y")){
                myBlackJack.dealAnotherCard();
            }
        } while (answer.equals("y"));


    }

}
