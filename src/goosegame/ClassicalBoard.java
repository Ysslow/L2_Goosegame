package goosegame;

/** ClassicalBoard Class */
public class ClassicalBoard extends Board {
    
    /** ClassicalBoard Constructor */
    public ClassicalBoard(){
        super(64);
    }

    protected void initBoard(){
        for (int i = 0; i < this.nbOfCells ; i++){
            if(i == 9 || i == 18 || i == 27 || i == 36 || i == 45 || i == 54){ // les « cases oie » sont les cases 9, 18, 27, 36, 45 et 54 ;
                this.theCells[i] = new GooseCell(); 
                this.theCells[i].setIndex(i);
            }
            else if(i == 31 || i == 52){ // les « cases piège » sont les cases 31 (le puits) et 52 (prison) ;
                this.theCells[i] = new TrapCell();
                this.theCells[i].setIndex(i);
            }
            else if(i == 19){ // la case 19 est une « case d’attente » ;
                this.theCells[i] = new WaitCell();
                this.theCells[i].setIndex(i);
            }
            else if(i == 6 || i == 42 || i == 58){ // les « cases de téléportation » sont les cases 6,42 et 58 ;
                this.theCells[i] = new TeleportCell();
                this.theCells[i].setIndex(i);
            }
            else{
                this.theCells[i] = new Cell();
                this.theCells[i].setIndex(i); // les cases basiques ;
            }
        }
    }
    
}
