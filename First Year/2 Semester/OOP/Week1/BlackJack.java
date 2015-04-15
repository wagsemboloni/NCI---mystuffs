/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author colm
 */
public class BlackJack {
    int first;
    int second;
    int third;
    int fourth;
    int fifth;
    int total;
    Random randomGenerator = new Random();
    public BlackJack(){
        first = 0;
        second = 0;
        third = 0;
        fourth = 0;
        fifth = 0;
        total = 0;
    }

    public void dealHand(){
        first = randomGenerator.nextInt(11)+1;
        second = randomGenerator.nextInt(11)+1;
        calcTotal();
    }

    public void dealAnotherCard(){
        if(third == 0){
            third = randomGenerator.nextInt(11)+1;
        } else if (fourth == 0){
            fourth = randomGenerator.nextInt(11)+1;
        } else if (fifth == 0){
            fifth = randomGenerator.nextInt(11)+1;
        }
        calcTotal();
    }

    public int getTotal(){
        return total;
    }

    public String getCurrentHand(){
        return String.valueOf(first) + ", " + String.valueOf(second) + ", " + String.valueOf(third) + ", " + String.valueOf(fourth) + ", " + String.valueOf(fifth);
    }

    private void calcTotal(){
        total = first + second + third + fourth + fifth;
    }



}
