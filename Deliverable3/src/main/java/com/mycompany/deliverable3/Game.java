/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverable3;

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
    }
    


 
  
}
