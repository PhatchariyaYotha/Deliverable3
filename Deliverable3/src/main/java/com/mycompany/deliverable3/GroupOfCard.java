/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author phatchariyaaa
 */
public class GroupOfCard {
    private final ArrayList<Card>cards;
    
    public GroupOfCard(){
        this.cards = new ArrayList<>();
        
    /**
     *
     * @return
     */
    public ArrayList<Card> getCards(){
            return cards;
        }
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
    }

}
    

