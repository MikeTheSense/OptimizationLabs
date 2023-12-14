package com.company.sixthLab.decks;

import com.company.sixthLab.cards.SUIT;

public class BlackJackDeck extends Deck {
    private static int[] blackJackRanks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    private static SUIT[] blackJackSuits = { SUIT.SPADE, SUIT.HEART, SUIT.CROSS, SUIT.DIAMOND};

    public BlackJackDeck() {
        super(blackJackRanks, blackJackSuits);
    }

}
