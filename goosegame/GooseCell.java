package goosegame;

/** GooseCell Class */
public class GooseCell extends Cell{
    /** GooseCell constructor */
    public GooseCell(){
        super();
    }
    
    /** make the rebound */
    protected int bounce(int number){
        return number*2;
    }

    protected boolean canEscape(){
        return true;
    }
}
