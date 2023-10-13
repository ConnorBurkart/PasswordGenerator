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
public class GameBoard implements IGameBoard
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
     * @post [Creates instance of empty 2D array to represent gameBoard] AND ROWS = 9 AND COLUMNS = 7 AND numToWin = 5
     */
    public GameBoard()
    {
        ROWS = 9;
        COLUMNS = 7;
        numToWin = 5;
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
     * AND [Instance variables Row = #row AND Column = #Column] AND self = #self
     */
    public void dropToken(char p, int c)
    {
        //places the character p in column c. The token will be placed in the lowest available row in column c.
        for (int i = getNumRows() - 1; i >= 0; i--) {
            if (playersGameBoard[i][c] == 'X' || playersGameBoard[i][c] == 'O' ) {
                continue;
            }
            else {
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
     * array] AND self = #self
     */
    public char whatsAtPos(BoardPosition pos)
    {
        //returns what is in the GameBoard at position pos If no marker is there, it returns a blank space char.

        if (playersGameBoard[pos.getRow()][pos.getColumn()] == 'X' || playersGameBoard[pos.getRow()][pos.getColumn()] == 'O') {
            return playersGameBoard[pos.getRow()][pos.getColumn()];
        }
        else {
            return ' ';
        }
    }

    /**
     * Determine which player has placed a token at the position
     * on the Gameboard
     *
     * @param pos Indicates current position on the GameBoard
     *
     * @param player character of the player [X or O]
     *
     * @return [boolean, true iff correct player token is at position
     * false iff other player is at position]
     *
     * @pre [player = "X" OR player = "O"]
     *
     * @post [isPlayerAtPos returns true iff the player (x or o) is at the corresponding position on the
     * gameboard, return true iff the player is not at the corresponding position] AND self = #self
     */
    public boolean isPlayerAtPos(BoardPosition pos, char player)
    {
        /*returns true if the player is at pos; otherwise, it returns false. Note: this method will be implemented very
        similarly to whatsAtPos, but it's asking a different question. We only know they will be similar because we
        know GameBoard will contain a 2D array. If the data structure were to change in the future,
        these two methods could be radically different.*/
        if (playersGameBoard[pos.getRow()][pos.getColumn()] == player)
        {
            return true;
        }

        return false;
    }

    /**
     * Create a string from values for row and column
     * in the format "<row>,<column>"
     *
     * @return the values input for Row and Column as a string ["<row>,<column>"]
     *
     * @pre None
     *
     * @post [toString returns the row and column number formatted as "<row>,<column>".
     * Converts the row and column to a string and this is output to the players.] AND self = #self
     * 
     */
    @Override
    public String toString()
    {
        String boardString = "|0|1|2|3|4|5|6|\n";

        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumColumns(); j++) {
                BoardPosition currentPos = new BoardPosition(i, j);
                boardString += ('|');
                boardString += (whatsAtPos(currentPos));
            }
            boardString += ('|');
            boardString += '\n';
        }
        return boardString;
    }
    public int getNumRows()
    {
        return ROWS;
    }
    public int getNumColumns()
    {
        return COLUMNS;
    }
    public int getNumToWin()
    {
        return numToWin;
    }














}
