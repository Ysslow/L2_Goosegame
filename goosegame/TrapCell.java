package goosegame;

/** TrapCell Class */
public class TrapCell extends Cell {
    
    /** TrapCell Constructor */
    public TrapCell(){
        super();
    }

    protected boolean canEscape(){
        return false;
    }
}

