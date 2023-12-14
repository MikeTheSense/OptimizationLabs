package com.company.sixthLab.players;

import com.company.sixthLab.decks.BlackJackDeck;
import com.company.sixthLab.hands.BlackJackHand;

import java.util.Scanner;

public class BlackJackPlayer extends Person{
    Scanner input = new Scanner(System.in);
    //Create a new Player

    public BlackJackPlayer(String name){
        super(name,  new BlackJackHand());
    }

    public boolean hasBlackjack(){
        if(this.getHand().calculateValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void printHand() {
            System.out.println(getName() + "'s hand looks like this:");
            System.out.println(this.hand + " Valued at: " + this.hand.calculateValue());
    }

    public void makeDecision(BlackJackDeck deck){
        int  decision = 0;
        boolean getNum = true;

        //while were getting a number...
        while(getNum){

            try{
                System.out.println("Would you like to: 1) Hit or 2) Stand");
                decision = input.nextInt();
                getNum = false;

            }
            catch(Exception e){
                System.out.println("Don't do that IBLIS!");
                input.next();
            }
        }

        if (decision == 1) {
            this.hit(deck);
            if(this.getHand().calculateValue()>20){
                return;
            }
            else{
                this.makeDecision(deck);
            }
        } else {
            System.out.println("You stand.");
        }
    }
    public void hit(BlackJackDeck deck){
        if (deck.hasCards()){
            this.hand.takeCardFromDeck(deck);
            System.out.println(this.hand);
        }
    }
}
