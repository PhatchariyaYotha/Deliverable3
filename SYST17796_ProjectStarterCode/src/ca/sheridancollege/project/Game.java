/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    
     public Game() {
        this.name = "War";
        this.players = new ArrayList<>();
        Player p1 = new Player("Mark"){
        @Override
                public void play(GroupOfCards deck){
     
     }
        };
        
        Player p2 = new Player("Sam"){
        
        @Override
        public void play(GroupOfCards deck){
     
     }
        };
        
        players.add(p1);
        players.add(p2);
    }

    public Game(String name, ArrayList<Player> players) {
        this.name = name;
        this.players =players;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public void play(){
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();

        // Deal the cards to the players
        for (Player player : getPlayers()) {
            for (int i = 0; i < deck.getSize() / getPlayers().size(); i++) {
                Card card = deck.getCards().remove(0);
                player.addCardToHand(card);
            }
        }

        while (true) {
            // Each player plays a card
            Card card1 = getPlayers().get(0).playCard();
            Card card2 = getPlayers().get(1).playCard();

            System.out.println(getPlayers().get(0).getName() + " plays " + card1);
            System.out.println(getPlayers().get(1).getName() + " plays " + card2);

            // Determine the winner of the round
            Player roundWinner;
            if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
                roundWinner = getPlayers().get(0);
            } else if (card2.getRank().ordinal() > card1.getRank().ordinal()) {
                roundWinner = getPlayers().get(1);
            } else {
                roundWinner = null; // It's a draw
            }

            if (roundWinner != null) {
                roundWinner.addCardToHand(card1);
                roundWinner.addCardToHand(card2);
                System.out.println("Round winner: " + roundWinner.getName());
            } else {
                System.out.println("It's a draw!");
            }
            System.out.println();

            // Check if any player has won the game
            if (getPlayers().get(0).hasWon() || getPlayers().get(1).hasWon()) {
                declareWinner(getPlayers().get(0), getPlayers().get(1));
                break;
            }
        }
    
    }

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
    
    

}//end class
