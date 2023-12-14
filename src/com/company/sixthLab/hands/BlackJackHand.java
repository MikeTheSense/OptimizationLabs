package com.company.sixthLab.hands;

import com.company.sixthLab.cards.Card;

public class BlackJackHand extends Hand {
    //private ArrayList<Card> hand;
    public BlackJackHand(){
        super();
    };

    public int calculateValue(){
        int value = 0;
        int aceCount = 0;
        for(Card card: hand){
            value += card.getValue();
            if (card.getValue() == 1){
                aceCount ++;
                value+=10;
            }
        }
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }
        return value;
    }


}
