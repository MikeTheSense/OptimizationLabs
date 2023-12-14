package com.company.sixthLab.hands;

import com.company.sixthLab.cards.Card;
import com.company.sixthLab.decks.Deck;

import java.util.ArrayList;

public abstract class Hand {
    protected ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void takeCardFromDeck(Deck deck){
        hand.add(deck.drawCard());
    }

    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + " || ";
        }
        return output;
    }
    public abstract int calculateValue();

    public Card getCard(int index){
        return hand.get(index);
    }
}
