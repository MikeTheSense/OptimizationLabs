package com.company.sixthLab.cards;

import com.company.sixthLab.cards.SUIT;

public class Card {
    private SUIT suit;
    private int value;

    public Card (SUIT suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    public String getPrintableValue(){
        String result;
        switch (value) {
            case 1:
                result = "A";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "3";
                break;
            case 4:
                result = "4";
                break;
            case 5:
                result = "5";
                break;
            case 6:
                result = "6";
                break;
            case 7:
                result = "7";
                break;
            case 8:
                result = "8";
                break;
            case 9:
                result = "9";
                break;
            case 10:
                result = "10";
                break;
            case 11:
                result = "Jack";
                break;
            case 12:
                result = "Queen";
                break;
            case 13:
                result = "King";
                break;
            case 14:
                result = "Joker";
                break;
            default:
                result = "No printable value";
        }
        return result;
    }
    @Override
    public String toString(){
        return getPrintableValue() + " of " + suit;
    }
}
