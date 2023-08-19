/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable3;

/**
 *
 * @author phatchariyaaa
 */
public class Card {
    private Rank rank;
    
    public Card(Rank rank){
        this.rank = rank;
    }
    
    
}

enum Rank{
    ACE(1), 
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);
    
    private final int value;
    
    Rank(int value){
        this.value =value;
    }
    
    public int getValue(){
        return value;
    }
    
    
}
