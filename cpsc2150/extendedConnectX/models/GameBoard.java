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
 * [Instance variables Row and Column must be Row = 9 and Column = 7]
 * AND [BoardPosition object must be valid, Row > 0
 * AND Row <= 9 AND Column > 0 AND Column <= 7] AND [Player must be "X" or "O"]
 *
 */
public class GameBoard implements IGameBoard
{
    private static int ROWS = 9;
    private static int COLUMNS = 7;
    private static char[][] playersGameBoard;
    /**
     * Constructs a GameBoard that is a size of 9x7 and contains
     * blank spaces for each position in the 9x7
     *
     * @pre None
     *
     * @post [Creates instance of empty 2D array to represent gameBoard] AND [instance variables
     * Row = 9 and Column = 7]
     */
    public GameBoard()
    {
        playersGameBoard = new char[ROWS][COLUMNS];

    }

    /**
     * Checks if the desired column is full of tokens or has
     * free space.
     * 
     * @param c column number to check if position is free.
     * 
     * @return [true if free OR false if occupied]
     * 
     * @pre c >= 0 AND c <= 6
     * 
     * @post [checkIfFree true iff gameBoard[][c] = " " AND true iff gameBoard[0][c] = " "
     * (returns false iff gameBoard[][c] is occupied by either
     * an 'X' or an 'O'.)] AND [Row = #Row AND Column = #Column and gameBoard[][] = #gameBoard[][].]
     * AND self = #self
     */
    public boolean checkIfFree(int c)
    {
        //returns true if the column can accept another token; false otherwise.
        if (playersGameBoard[ROWS - 1][c] == ' ') {
            return true;
        }

        return false;

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
        for (int i = ROWS - 1; i >= 0; i--) {
            if (playersGameBoard[i][c] == 'X' || playersGameBoard[i][c] == 'O' ) {
                continue;
            }
            else {
                playersGameBoard[i][c] = p;
                break;
            }
        }
    }

    /**
     * Checks to see if there are 5 tokens in a row, up,
     * or diagonal
     * 
     * @param c indicates column number to check.
     *
     * @return [returns true iff 5 of the same players tokens (X or Y) are placed in a consecutive
     * horizontal, vertical, or diagonal row. False iff 5 tokens are not consecutively placed.]
     * 
     * @pre c >= 1 AND c <= 7 [C is the column in which the latest token was placed.]
     * 
     * @post [checkForWin returns true iff the last placed token is the 5th consecutive token in a vertical,
     * horizontal, or diagonal row. False iff the last placed token is not 5th or consecutive in a vertical,
     * horizontal, or diagonal row.] AND self = #self
     */
    public boolean checkForWin(int c)
    {
        /*this function will check to see if the last token placed in column c resulted in the player winning the game.
        If so it will return true, otherwise false. Note: this is not checking the entire board for a win, it is just
        checking if the last token placed results in a win. You may call other methods to complete this method */
        return false;
    }

    /**
     * Check to see if the game has ended in a tie
     *
     * @return [true iff all positions on 2D gameBoard array are full return false if
     * gameBoard array is not full]
     *
     * @pre None
     *
     * @post [Checks each space on the gameBoard to see if it is occupied and if the entire gameBoard array
     * is occupied then returns true, else returns false because the game is still able to continue.] AND self = #self
     */
    public boolean checkTie()
    {
        /*this function will check to see if the game has resulted in a tie. A game is tied if there are no free board
        positions remaining. You do not need to check for any potential wins because we can assume that the players
        were checking for win conditions as they played the game. It will return true if the game is tied and
        false otherwise.*/
        return true;
    }

    /**
     * Check if either player has 5 tokens connected horizontally
     *
     * @param pos Indicates current position on the board
     *
     * @param p Indicates the player's character [X's or O's]
     *
     * @return [Boolean, returns true iff player has horizontal win, false iff they do not have horizontal win.]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [Returns true iff last token placed in the 5th consecutive in a horizontal row, returns false
     * iff last placed token was not 5th or in a consecutive row.] AND self = #self
     */
    public boolean checkHorizWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in
        a row horizontally. Returns true if it does, otherwise false*/
        return true;
    }

    /**
     * Check if either player has 5 tokens connected vertically
     * 
     * 
     * @param pos Indicates the position on the gameBoard
     *
     * @param p Indicates the player's character [X's or O's]
     *
     * @return [Boolean, returns true iff player wins at vertical position, false iff player
     * does not win at vertical position.]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [checkVertWin returns true iff last placed token was 5th consecutive token in a vertical alignment.
     * returns false iff last placed token was not 5th or in a consecutive row.] AND self = #self.
     */
    public boolean checkVertWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        vertically. Returns true if it does, otherwise false*/
        return true;
    }

    /**
     * Check if either player has 5 tokens connected diagonally
     *
     * @param pos Indicates position on gameBoard
     *
     * @param p Indicates the player's character [X's or O's]
     *
     * @return [Boolean, returns true iff player wins at diagonal position and false iff player
     * does not win at vertical position.]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [[checkDiagWin returns true iff last placed token was 5th consecutive token in a diagonal alignment.
     * returns false iff last placed token was not 5th or in a consecutive row.] AND self = #self.
     */
    public boolean checkDiagWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        diagonally. Returns true if it does, otherwise false Note: there are two diagonals to check*/
        return true;
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
        return " ";
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
        return 0;
    }














}
