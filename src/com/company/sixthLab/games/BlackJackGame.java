package com.company.sixthLab.games;

import com.company.sixthLab.decks.BlackJackDeck;
import com.company.sixthLab.players.BlackJackDealer;
import com.company.sixthLab.players.BlackJackPlayer;

public class BlackJackGame {
    private BlackJackDeck deck;
    private BlackJackDealer dealer;
    private BlackJackPlayer player;

    public BlackJackGame(){
        deck = new BlackJackDeck();
        dealer = new BlackJackDealer("Igma");
        player = new BlackJackPlayer("Ahmedeles");

    }

    public void startRound() {
        //dealer.clean();
        //player.clean();


        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        dealer.printFirstHand();
        player.printHand();

        player.makeDecision(deck);
        if(player.hasBlackjack()){
            System.out.println("You have Blackjack! You win!");
            System.out.print("Dealer hand was : ");
            dealer.printHand();
            //startRound();
        }



        if(player.getHand().calculateValue() > 21) {
            System.out.println("You have gone over 21.");
            //startRound();
        }

        while(dealer.getHand().calculateValue()<14){
            System.out.println("Dealer takes card");
            dealer.hit(deck);
        }
        System.out.println("Things out");
        System.out.println("Dealer hand looks like this: ");
        System.out.println(dealer.getHand());

        if (dealer.hasBlackjack()) {

            if (player.hasBlackjack()) {
                System.out.println("You both have 21 - Push.");
                //startRound();
            } else {
                System.out.println("Dealer has BlackJack. You lose.");
                //dealer.printHand();
               // startRound();
            }
            return;
        }

        if(dealer.getHand().calculateValue()>21){
            System.out.println("Dealer busts");
            //startRound();
        }
        else if(dealer.getHand().calculateValue() > player.getHand().calculateValue()){
            System.out.println("You lose.");
           // startRound();
        }
        else if(player.getHand().calculateValue() > dealer.getHand().calculateValue()){
            System.out.println("You win.");
            //startRound();
        }
        else{
            System.out.println("Push.");
           // startRound();
        }
    }
}
