package goosegame;

/** Cell class */
public class Cell {

    /** Attributes */
    protected Player p;
    /** Attributes */
    protected int index;
    
    /** Constructor for Cell
     */
    public Cell(){
        this.p = null;
    }

    /** get the current index of the cell
     * @return the current index
     */
    public int getIndex(){
        return this.index;
    }

    /** get the current player on the cell
     * @return the current player
     */
    public Player getPlayer(){
        return this.p;
    }

    /** set a player on the cell 
     * @param p a player
    */
    public void setPlayer(Player p){
        this.p = p;
    }

    /** set an index for the cell 
     * @param index the index
    */
    public void setIndex(int index){
        this.index = index;
    }

    /** check if the cell is empty
     * @return true if empty / false either
     */
    public boolean isEmpty(){
        return this.p == null;
    }

    /** do the bounce
     * 
     * @param number the number for the bounce
     * @return the current value of the bounce
     */
    protected int bounce(int number){
        return 0;
    }

    /**
     * check if the player can escape
     * @return true if he can, false if he can't
     */
    protected boolean canEscape(){
        return true;
    }

    /** reinitialise the player value */
    public void reset(){
        this.p = null;
    }
}