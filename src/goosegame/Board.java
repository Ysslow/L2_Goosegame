package goosegame;

/** Abstract Class Board */
public abstract class Board {

    /** Attributes */
    protected Cell[] theCells;
    /** Attributes */
    protected final int nbOfCells;


    /** Board Constructor
     * @param number the number of cells
     */
    public Board(int number){
        this.nbOfCells = number;
        this.theCells = new Cell[this.nbOfCells];
        this.initBoard();
        }

    /** initiate the board */
    protected abstract void initBoard();

    /** get a cell at a specific index
     * @param index the current index
     * @return the cell
     */
    public Cell getCell(int index){
        return theCells[index];
    }

    /** get the number of cell
     * @return the number of cell
     */
    public int getNbOfCells(){
        return nbOfCells;
    }
}
