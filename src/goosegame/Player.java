package goosegame;

import java.util.Random;

/** A player in the "jeu de l'oie" game */
public class Player {

   private static final Random ALEA = new Random();

   /** current cell of the player */
   protected Cell cell;
   /** name of the player */
   protected String name;
   /** Check if the player is stuck */
   protected Boolean stuck;
   /** Check if the player is in waiting time*/
   protected int wait;


   /**
    * When created, player has no cell, it must be added to the game to have one
    * 
    * @param name the name of this player
    */
   public Player(String name) {
      this.name = name;
      this.cell = null;
      this.stuck = false;
   }


   /* toString method
    */
   public String toString() {
      return this.name;
   }

   /**
    * returns the current cell of the player
    * 
    * @return the current cell of the player
    */
   public Cell getCell() {
      return this.cell;
   }

   /**
    * returns the current stuckstatus of the player
    * 
    * @return the current stuckstatus of the player
   */
   public boolean GetStuck() {
      return this.stuck;
   }

   /**
    * changes the stuck status of the player
    * 
    * @param b the boolean
    */
    public void setStuck(boolean b) {
      this.stuck = b;
   }

   /**
    * changes the cell of the player
    * 
    * @param newCell the new cell
    */
   public void setCell(Cell newCell) {
      this.cell = newCell;
   }

   /**
    * changes the wait of the player
    * 
    * @param nb the number of waiting turn
    */
    public void setWait(int nb) {
      this.wait = nb;
   }

   /**
    * pass a turn
    */
    public void waiting(){
      if(this.wait > 0){
         this.stuck = true;
         this.wait -= 1;
      }
      else{
         this.stuck = false;
      }
      
   }

   /**
    * result of a 1d6 throw
    * 
    * @return random result of a 1d6 throw
    */
   private int oneDieThrow() {
      return ALEA.nextInt(6) + 1;
   }

   /**
    * result of a 2d6 throw
    * 
    * @return random result of a 2d6 throw
    */
   public int twoDiceThrow() {
      int result = oneDieThrow() + oneDieThrow();
      return result;
   }

   /** Check if the players are Equals
     * 
     * @return true if Equals
     * @param o another player
     */
    public boolean equals(Object o){
      if (! (o instanceof Player)){
          return false;
      }
      Player other = (Player) o;
      return this.name == other.name;
  }
}// Player
