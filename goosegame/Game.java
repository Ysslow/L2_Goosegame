package goosegame;

import java.util.List;
import java.util.ArrayList;

/** Game Class */
public class Game {
    
    /** Attributes */
    private List<Player> thePlayers;
    /** Attributes */
    private Board Board;

    
    /** Game Constructor
     * @param board the board of the game
     */
    public Game(Board board){
        this.thePlayers = new ArrayList<Player>();
        this.Board = board;
    }

    /** get the board
     * 
     * @return the board
     */
    public Board getBoard(){
        return this.Board;
    }

    /** add a player to the game
     * @param p the added player
     */
    public void addPlayer(Player p){
        p.setCell(new Cell());
        this.thePlayers.add(p);
    }

    /** check if a player can play
     * @param p the tested player
     * @return true if he can / false if he can't
     */
    public boolean canPlay(Player p){
        return p.getCell().canEscape();
    }

    /** move a player to a new cell
     * 
     * @param p the player
     * @param index the new index
     * @param oldcell the index of the oldcell
     */
    public void move(Player p, int index, int oldcell){
        int tmp = 0;
        if(index > 63){
            tmp = index - 63;
            index = 63 - tmp;
            //System.out.println("deuxième if et index vaut" + index );
        }
        // System.out.println(this.Board.theCells[index]);
        // System.out.println(this.Board.theCells[index].bounce(index - p.getCell().getIndex() + 1));
        if(this.Board.theCells[index].bounce(index - p.getCell().getIndex() + 1) != 0 && index<=63){
            if(this.Board.theCells[index] instanceof GooseCell){
                //System.out.println(this.Board.theCells[index]);
                //System.out.println(index);
                index = p.getCell().getIndex() + this.Board.theCells[index].bounce(index - p.getCell().getIndex());
                if(index > 63){
                    tmp = index - 63;
                    index = 63 - tmp;
                    //System.out.println("deuxième if et index vaut" + index );
                }
                //System.out.println("GooseCell et index vaut" + index );
            }
            if(this.Board.theCells[index] instanceof TeleportCell){
                //System.out.println(this.Board.theCells[index]);
                //System.out.println(index);
                index = this.Board.theCells[index].bounce(index - p.getCell().getIndex());
                //System.out.println("TeleportCell et index vaut" + index );
            }
        }
        if(this.Board.theCells[index].isEmpty() == false && this.Board.theCells[index] instanceof TrapCell){
            this.Board.theCells[oldcell].reset();
            Player ancienPlayer = this.Board.theCells[index].getPlayer();
            ancienPlayer.setStuck(false);
            // System.out.println(ancienPlayer + " et " + p);
            p.setCell(this.Board.theCells[index]);
            p.setStuck(true);
            this.Board.theCells[index].setPlayer(p);
        }
        if(this.Board.theCells[index].isEmpty() && this.Board.theCells[index] instanceof Cell){
            this.Board.theCells[oldcell].reset();
            p.setCell(this.Board.theCells[index]);
            if(this.Board.theCells[index] instanceof TrapCell){
                p.setStuck(true);
            }
            if(this.Board.theCells[index] instanceof WaitCell){
                p.setStuck(true);
                p.setWait(2);
            }
            this.Board.theCells[index].setPlayer(p);
        }
    }

    /** Play the game */
    public void play(){
        int index = 0;
        int diceThrow = 0;
        int oldcell = 0;
        Player winner = null;
        boolean AllTrapped = false;
        while (this.getBoard().theCells[63].isEmpty() && AllTrapped == false){
            int cpt = 0;
            for(int i = 0; i < this.thePlayers.size(); i++){
                if(this.thePlayers.get(i).GetStuck() == false){
                    oldcell = this.thePlayers.get(i).getCell().getIndex();
                    diceThrow = this.thePlayers.get(i).twoDiceThrow();
                    index = this.thePlayers.get(i).getCell().getIndex() + diceThrow;
                    // System.out.println(this.thePlayers.get(i) + " et " + index + " et " + oldcell);
                    move(this.thePlayers.get(i), index, oldcell);
                    System.out.println("le joueur " + this.thePlayers.get(i) + " est sur la cellule " + oldcell + " il réalise un lancer de " + diceThrow + " et atteint la cellule " + this.thePlayers.get(i).getCell().getIndex());
                    if (this.thePlayers.get(i).getCell().getIndex() == 63){
                        winner = this.thePlayers.get(i);
                        break;
                    }
                }
                else{
                    if(this.thePlayers.get(i).getCell() instanceof WaitCell){
                        this.thePlayers.get(i).waiting();
                    }
                    else{
                        cpt += 1;
                        if(cpt == this.thePlayers.size()){
                            System.out.println("Tout les joueurs sont bloqués, match nul");
                            AllTrapped = true;
                    }
                    }
                }
            }
        }
        if(AllTrapped == false){
            System.out.println(winner + " est arrivé sur la case finale (63)");
        }
    }
}
