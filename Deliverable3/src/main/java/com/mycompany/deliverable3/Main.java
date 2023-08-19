/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable3;

/**
 *
 * @author phatchariyaaa
 */
public class Main {
    public static void main(String[]args){
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        ArrayList<Player>players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        
        Game game = new Game("War Card Game", players);
        game.play();

    }
    
    
}
