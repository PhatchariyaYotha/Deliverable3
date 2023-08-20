/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverable3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phatchariyaaa
 */


public class Game {
    
    private String name;
    private ArrayList<Player>players;
    private int timer;
    
    public Game (String name, ArrayList<Player>players){
        this.name = name;
        this.players = players;
        this.timer = 30;
        
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Player>getPlayers(){
        return players;
    }
    
    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }
    
    public void setTimer(int timeLimit){
        this.timer = timeLimit;
    }
    
    public void play(){
        GroupOfCard deck = new GroupOfCard();
        for (Rank rank : Rank.values()){
            for (int i = 0; i<players.size();i++){
                players.get(i).addCardToHand(new Card(rank));
            }
        }
        deck.shuffle();
    
    
    while (!players.get(0).getHand().isEmpty() && !players.get(1).getHand().isEmpty()) {
            Card card1 = players.get(0).playCard();
            Card card2 = players.get(1).playCard();

    int compareResult = card1.getRank().compareTo(card2.getRank());
        if (compareResult > 0) {
            players.get(0).increaseScore(2);
                players.get(0).addCardToHand(card1);
                players.get(0).addCardToHand(card2);
            }else if (compareResult < 0) {
                players.get(1).increaseScore(2);
                players.get(1).addCardToHand(card1);
                players.get(1).addCardToHand(card2);
            } else {
                List<Card> warCards = new ArrayList<>();
                warCards.add(card1);
                warCards.add(card2);
                
                for (int i = 0; i < 3; i++) {
                if (!players.get(0).getHand().isEmpty() && !players.get(1).getHand().isEmpty()) {
                    warCards.add(players.get(0).playCard());
                    warCards.add(players.get(1).playCard());
                }
            }
                if (!players.get(0).getHand().isEmpty() && !players.get(1).getHand().isEmpty()){
                    Card warCard1 = players.get(0).playCard();
                    Card warCard2 = players.get(1).playCard();
                    
                    int warCompareResult = warCard1.getRank().compareTo(warCard2.getRank());
                    if (warCompareResult > 0) {
                        players.get(0).increaseScore(warCards.size() * 2);
                        players.get(0).getHand().addAll(warCards);
                        players.get(0).addCardToHand(warCard1);
                        players.get(0).addCardToHand(warCard2);

                    }else if (warCompareResult < 0) {
                        players.get(1).increaseScore(warCards.size() * 2);
                        players.get(1).getHand().addAll(warCards);
                        players.get(1).addCardToHand(warCard1);
                        players.get(1).addCardToHand(warCard2);

                    }else {
                        players.get(0).getHand().addAll(warCards);
                    }
                    

                }


                

            }


        }
        Player winner = players.get(0).getScore() > players.get(1).getScore() ? players.get(0) : players.get(1);
        System.out.println("Winner: " + winner.getName());
    }
}

    



 
  

