package goosegame;

/** WaitCell Class */
public class WaitCell extends Cell{

    /** WaitCell Constructor */
    public WaitCell(){
        super();
    }

    protected boolean canEscape(){
        return false;
    }
}