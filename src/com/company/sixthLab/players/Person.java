package com.company.sixthLab.players;

import com.company.sixthLab.hands.Hand;

public abstract class Person <T extends Hand> {
    protected T hand;
    private String name;

    Person(String name, T hand){
        this.hand = hand;
        this.name = name;
    }

    public T getHand() {
        return hand;
    }

    public void setHand(T hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void printHand();
}
