/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable3;

/**
 *
 * @author phatchariyaaa
 */
public class Player {
    private String name;
    private int score;
    private GroupOfCard hand;
    
    public Player(String name){
        this.name = name;
        this.score = 0;
        this.hand = new GroupOfCard();
    }
    
    public String getNanme(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void increaseScore(int points){
        score += points;
    }
    
    public void addCardToHand(Card card){
        hand.addCard(card);
    }
    
}
