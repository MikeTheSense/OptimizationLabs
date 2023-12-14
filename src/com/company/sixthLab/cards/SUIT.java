package com.company.sixthLab.cards;

public enum SUIT {
    SPADE("Spades"),
    HEART("Hearts"),
    CROSS("Crosses"),
    DIAMOND("Diamonds");

    String suitName;

    SUIT(String name){
        this.suitName = name;
    }
    public String toString(){
        return suitName;
    }
}
