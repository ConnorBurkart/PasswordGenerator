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
     * @post [Creates instance of empty 2D array to represent gameBoard of size ROWSxCOLUMNS]
     * AND ROWS = 9 AND COLUMNS = 7 AND numToWin = 5
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
     * AND [Instance variables Row = #row AND Column = #Column]
     * ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    public void dropToken(char p, int c)
    {
        //places the character p in column c. The token will be placed in the lowest available row in column c.
        for (int i = 0; i < getNumRows(); i++) {
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
     * array] ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
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

        //return playersGameBoard[pos.getRow()][pos.getColumn()];
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
     * gameboard, return true iff the player is not at the corresponding position]
     * ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    /*
    public boolean isPlayerAtPos(BoardPosition pos, char player)
    {
        //Returns true if char for player is same as pos on GameBoard.
        if (playersGameBoard[pos.getRow()][pos.getColumn()] == player)
        {
            return true;
        }

        return false;
    }
     */

    /**
     * Creates a string for the GameBoard containing each value within 2D gameboard array.
     *
     * @return the GameBoard array as a String.
     *
     * @pre None
     *
     * @post [toString returns each value contained within the 2D GameBoard array
     * as a string formatted as the GameBoard] AND ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin
     * AND self = #self
     * 
     */
    @Override
    public String toString()
    {
        //Begins string with header for the output GameBoard
        String boardString = "|0|1|2|3|4|5|6|\n";

        for (int i = getNumRows() - 1; i >= 0; i--) {
            for (int j = 0; j < getNumColumns(); j++) {
                //Creates a new BoardPosition for current spot on GameBoard
                BoardPosition currentPos = new BoardPosition(i, j);
                boardString += ('|');

                /*
                if (whatsAtPos(currentPos) != 'X' && whatsAtPos(currentPos) != 'O') {
                    boardString += ' ';
                }
                else {
                    //Appends value at currentPos to the String
                    boardString += (whatsAtPos(currentPos));
                }
                 */
                boardString += (whatsAtPos(currentPos));
            }
            boardString += ('|');
            boardString += '\n';
        }

        //Returns the generated String
        return boardString;
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
