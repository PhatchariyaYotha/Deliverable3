/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author phatchariyaaa
 */
public class MainGame {
    public static void main(String[] args){
        
        Game warGame;
        warGame = new Game(){
            @Override
            public void play(){
                
                GroupOfCards deck = new GroupOfCards(52);
                deck.shuffle();
                
                int numPlayers = getPlayers().size();
                int cardsPerPlayer = deck.getSize() / numPlayers;
                
                for (Player player : getPlayers()) {
                    for (int i = 0; i < cardsPerPlayer; i++) {
                        Card card = deck.getCards().remove(0);
                        player.addCardToHand(card);
                    }
                }

                while (true) {
                    // Each player plays a card
                    ArrayList<Card> playedCards = new ArrayList<>();
                    for (Player player : getPlayers()) {
                        Card card = player.playCard();
                        playedCards.add(card);
                        System.out.println(player.getName() + " plays " + card);
                    }

                    int maxRank = -1;
                    Player roundWinner = null;
                    for (Iterator<Player> it = getPlayers().iterator(); it.hasNext();) {
                        Player player = it.next();
                        int rank = player.getRank(playedCards.get(0));
                        if (rank > maxRank) {
                            maxRank = rank;
                            roundWinner = player;
                        }
                    }

                    for (Card card : playedCards) {
                        roundWinner.addCardToHand(card);
                    }

                    System.out.println("Round winner: " + roundWinner.getName());
                    System.out.println();
                    
                    
                    if (!roundWinner.hasWon()) {
                    } else {
                        declareWinner;
                        break;
                    }
                }
            }

            @Override
            public void declareWinner(Player p1, Player p2){
        
        System.out.println("Game Over!");
        System.out.println(p1.getName() + " points: " + p1.getScore());
        System.out.println(p2.getName() + " points: " + p2.getScore());

        if (p1.getScore() > p2.getScore()) {
            System.out.println("Congratulations to " + p1.getName() + "!");
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println("Congratulations to " + p2.getName() + "!");
        } else {
            System.out.println("It's a draw!");
        }
    }
        };


        warGame.play();


                
                
        }
    };
}

    

