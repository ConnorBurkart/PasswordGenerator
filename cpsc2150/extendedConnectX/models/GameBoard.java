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
public class GameBoard
{
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
     */
    public boolean checkIfFree(int c)
    {
        //returns true if the column can accept another token; false otherwise.
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
     */
    public void dropToken(char p, int c)
    {
        //places the character p in column c. The token will be placed in the lowest available row in column c.
    }

    /**
     * Checks to see if there are 4 tokens in a row, up,
     * or diagonal
     * 
     * @param c 
     * @return [true if 4 tokens connected in a row, up, or diagonal
     * false if 4 not connected]
     * 
     * @pre c >= 0 AND c <= 6
     * 
     * @post [checkForWin = true OR checkForWin = false] AND [GameBoard = #GameBoard]
     */
    public boolean checkForWin(int c)
    {
        /*this function will check to see if the last token placed in column c resulted in the player winning the game.
        If so it will return true, otherwise false. Note: this is not checking the entire board for a win, it is just
        checking if the last token placed results in a win. You may call other methods to complete this method */
    }

    /**
     * Check to see if the game has ended in a tie
     *
     * @return [true if all positions on Gameboard are full
     * false if game has not ended]
     *
     * @pre None
     *
     * @post [checkTie = True OR checkTie = False] [GameBoard = #GameBoard]
     */
    public boolean checkTie()
    {
        /*this function will check to see if the game has resulted in a tie. A game is tied if there are no free board
        positions remaining. You do not need to check for any potential wins because we can assume that the players
        were checking for win conditions as they played the game. It will return true if the game is tied and
        false otherwise.*/
    }

    /**
     * Check if either player has 4 tokens connected horizontally
     *
     * @param pos
     *
     * @param p
     *
     * @return [Boolean, returns true iff player has horizontal win, false iff they do not have horizontal win.]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [checkHorizWin = True OR checkHorizWin = false] [pos = #pos]
     */
    public boolean checkHorizWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in
        a row horizontally. Returns true if it does, otherwise false*/
    }

    /**
     * Check if either player has 4 tokens connected vertically
     * 
     * 
     * @param pos
     *
     * @param p
     *
     * @return [Boolean, returns true iff player wins at vertical position, false iff player
     * does not win at vertical position.]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [checkVertWin = true OR checkVertWin = false] [pos = #pos]
     */
    public boolean checkVertWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        vertically. Returns true if it does, otherwise false*/
    }

    /**
     * Check if either player has 4 tokens connected diagonally
     *
     * @param pos
     *
     * @param p
     *
     * @return [Boolean, returns true iff, false otherwise]
     *
     * @pre [p = "X" OR p = "O"]
     *
     * @post [checkDiagWin = true OR checkDiagWin = false] [pos = #pos]
     */
    public boolean checkDiagWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        diagonally. Returns true if it does, otherwise false Note: there are two diagonals to check*/
    }

    /**
     * Check which character is at any position on the Gameboard and returns said character.
     *
     * @param pos
     *
     * @return Player token that is at desired position as a Character
     *
     * @pre [pos equals valid BoardPosition, Row > 0 AND Row <= 9 AND Column > 0 AND Column <= 7]
     *
     * @post whatsAtPos = "X" OR whatsAtPos = "O" OR whatsAtPos = "" [pos = #pos]
     */
    public char whatsAtPos(BoardPosition pos)
    {
        //returns what is in the GameBoard at position pos If no marker is there, it returns a blank space char.
    }

    /**
     * Determine which player has placed a token at the position
     * on the Gameboard
     *
     * @param pos
     *
     * @param player
     *
     * @return [boolean, true iff correct player token is at position
     * false iff other player is at position]
     *
     * @pre [player = "X" OR player = "O"]
     *
     * @post [isPlayerAtPos = true OR isPlayerAtPos = false] [pos = #pos]
     */
    public boolean isPlayerAtPos(BoardPosition pos, char player)
    {
        /*returns true if the player is at pos; otherwise, it returns false. Note: this method will be implemented very
        similarly to whatsAtPos, but it's asking a different question. We only know they will be similar because we
        know GameBoard will contain a 2D array. If the data structure were to change in the future,
        these two methods could be radically different.*/
    }

    /**
     * Create a string from values for row and column
     * in the format "<row>,<column>"
     *
     * @return the values input for Row and Column to a string
     * formatted as "<row>,<column>"
     *
     * @pre None
     *
     * @post [toString = "<row>,<column>"] AND Row = #Row AND Column = #Column
     * 
     */
    @Override
    public String toString(){

    }














}
