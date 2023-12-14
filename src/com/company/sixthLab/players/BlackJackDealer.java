package com.company.sixthLab.players;

import com.company.sixthLab.decks.BlackJackDeck;
import com.company.sixthLab.hands.BlackJackHand;
import com.company.sixthLab.hands.Hand;

public class BlackJackDealer extends Person {
    public BlackJackDealer(String name) {
        super(name, new BlackJackHand());
    }


    @Override
    public void printHand() {
        System.out.println("(Dealer) " + getName() + "'s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculateValue());
    }
    public void printFirstHand(){
        System.out.println("The dealer's hand looks like this:");
        System.out.println(hand.getCard(0));
        System.out.println("The second card is face down.");
    }

    public boolean hasBlackjack(){
        if(this.getHand().calculateValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }
    public void hit(BlackJackDeck deck){
        if (deck.hasCards()){
            this.hand.takeCardFromDeck(deck);
            //System.out.println(this.hand);
        }
    }
}
