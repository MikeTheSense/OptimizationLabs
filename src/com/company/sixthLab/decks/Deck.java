package com.company.sixthLab.decks;

import com.company.sixthLab.cards.Card;
import com.company.sixthLab.cards.SUIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
    private List<Card> cards;

    public Deck(int[] ranks, SUIT[] suits){
        this.cards = new ArrayList<>();
        initializeDeck(ranks, suits);
        shuffle();
    }

    private void initializeDeck(int[] ranks, SUIT[] suits){
        if (ranks!=null&&suits!=null){
            for (SUIT suit : suits)
                for (int rank : ranks)
                    this.cards.add(new Card(suit,rank));
        }
    }
    private void shuffle(){
        Collections.shuffle(this.cards);
    }

    public boolean hasCards(){
        if (cards.size() > 0) return true;
        else return false;
    };
    public Card drawCard(){
        if(!cards.isEmpty()){
            return cards.remove(0);
        }
        return null;
    }
    public String toString(){
        String result = "";
        for (Card i : cards){
           result += i;
           result += "\n";
        }
        return result;
    }
}
