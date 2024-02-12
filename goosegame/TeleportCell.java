package goosegame;

/** TeleportCell Class */
public class TeleportCell extends Cell{

    /** TeleportCell Constructor */
    public TeleportCell(){
        super();
    }

    /** do the teleport */
    protected int bounce(int number){
        if(this.index == 6){
            return 12;      // 6 -> 12 
        }
        else if(this.index == 42){
            return 30;      // 42 -> 30
        }
        else{
            return 1;       // 58 -> 1
        }   
    }

    protected boolean canEscape(){
        return true;
    }
}
