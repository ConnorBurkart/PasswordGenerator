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
 * @invariant [GameBoard should be valid 9x7 size board] AND
 * [Instance variables Row and Column must be ROW = 9 and COLUMN = 7]
 * AND [Player must be "X" or "O"]
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
     * Constructs a GameBoard that is a size of 9x7 and contains
     * blank spaces for each position in the 9x7
     *
     * @pre None
     *
     * @post [Creates instance of empty 2D array to represent gameBoard of size ROWSxCOLUMNS]
     * AND ROWS = 9 AND COLUMNS = 7 AND numToWin = 5
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
     * @param p indicates player's character [player character is 'x' or 'o']
     *  
     * @param c indicates the column number
     * 
     * @pre c > 0 AND c <= 7 AND [checkIfFree() for column, c, should return true.]
     * 
     * @post [GameBoard array at column, c, contains player character ('x' or 'o')]
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
     * Check which character is at any position on the Gameboard and returns said character.
     *
     * @param pos Current position on the gameboard array.
     *
     * @return Player token that is at desired position as a Character
     *
     * @pre None
     *
     * @post [whatsAtPos returns which player's character (X or O) is at the current position on the game board
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
