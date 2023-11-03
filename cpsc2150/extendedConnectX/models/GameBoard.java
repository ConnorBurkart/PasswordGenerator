package cpsc2150.extendedConnectX.models;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)

 */
/**
 * This class contains the methods that can be done by the game in order to validate token positions
 * and to advance the game.
 *
 * @invariant 3 <= ROWS <= 100 AND 3 <= COLUMNS <= 100 And 3 <= numToWin <= 25
 *
 * @corresponds num_rows = ROWS
 * @corresponds num_columns = COLUMNS
 * @corresponds num_to_win = numToWin
 *
 */
public class GameBoard extends AbsGameBoard implements IGameBoard
{
    private static int ROWS;
    private static int COLUMNS;
    private static int numToWin;
    private static char[][] playersGameBoard;

    /**
     * Constructs a speed efficient GameBoard that is a 2D array with a size
     * specified by the parameters and contains a blank space for every position
     * on the GameBoard
     *
     * @param aRow number of rows for the GameBoard
     * @param aCol number of columns for the GameBoard
     * @param numWin number required to win the game
     *
     * @pre 3 <= aRow <= 100 AND 3 <= aCol <= 100 And 3<= numWin <= 25
     *
     * @post [Creates instance of empty 2D array to represent gameBoard of size ROWSxCOLUMNS]
     * AND ROWS = aRow AND COLUMNS = aCol AND numToWin = numWin
     */
    public GameBoard(int aRow, int aCol, int numWin)
    {
    // -------- Need to update contract ------- //

        ROWS = aRow;
        COLUMNS = aCol;
        numToWin = numWin;
        playersGameBoard = new char[ROWS][COLUMNS];
    }

    /**
     * Drops a token to the bottom of the board in the specified
     * column
     * 
     * @param p indicates player's character
     *  
     * @param c indicates the column number
     * 
     * @pre 3 <= c <= COLUMNS AND [checkIfFree() for column, c, should return true.]
     * 
     * @post [GameBoard array at column c, contains player character]
     * AND [Instance variables Row = #row AND Column = #Column]
     * ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    public void dropToken(char p, int c)
    {
        //places the character p in column c. The token will be placed in the lowest available row in column c.
        for (int i = 0; i < getNumRows(); i++) {
            if (!Character.isLetter(playersGameBoard[i][c])) {
                playersGameBoard[i][c] = p;
                return;
            }
        }
    }

    /**
     * Check which character is at any position on the GameBoard and returns said character.
     *
     * @param pos Current position in the GameBoard array.
     *
     * @return Player token that is at desired position as a Character
     *
     * @pre None
     *
     * @post [whatsAtPos returns which player's character is at the current position on the game board
     * array] ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    public char whatsAtPos(BoardPosition pos)
    {

        //returns what is in the GameBoard at position pos If no marker is there, it returns a blank space char.
        if (Character.isLetter(playersGameBoard[pos.getRow()][pos.getColumn()])) {
            return playersGameBoard[pos.getRow()][pos.getColumn()];
        }
        else {
            return ' ';
        }

    }

    /**
     * Returns the value for ROWS
     *
     * @return the value for ROWS as an int
     *
     * @pre None
     *
     * @post getNumRows = ROWS AND ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     *
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the value for COLUMNS
     *
     * @return the value for COLUMNS as an int
     *
     * @pre None
     *
     * @post getNumColumns = COLUMNS AND ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     *
     */
    public int getNumColumns()
    {
        return COLUMNS;
    }

    /**
     * Returns the value for numToWin
     *
     * @return the value for numToWin as an int
     *
     * @pre None
     *
     * @post getNumColumns = COLUMNS AND ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin
     *
     */
    public int getNumToWin()
    {
        return numToWin;
    }



}
