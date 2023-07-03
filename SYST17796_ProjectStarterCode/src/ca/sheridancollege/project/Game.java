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
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     * @param p1
     * @param p2
     */
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
