package cpsc2150.extendedConnectX.models;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)


 */
/**
 * This class contains the methods that can be done by the game in order to validate token positions
 * and to advance the game.
 *
 * @invariant [GameBoard should be valid 9x7 size board] AND [BoardPosition object must be valid, Row > 0
 * AND Row <= 9 AND Column > 0 AND Column <= 7]
 *
 */
public class GameBoard
{
    /**
     * Constructs a GameBoard that is a size of 9x7 and contains
     * blank spaces for each position in the 9x7
     * 
     */
    public GameBoard()
    {

    }

    /**
     * Checks if the desired collumn is full of tokens or has
     * free space.
     * 
     * @param c number to indicate which collumn to check
     * 
     * @return true if free   false if occupied
     * 
     * @pre c >= 0 AND c <= 6
     * 
     * @post 
     */
    public boolean checkIfFree(int c)
    {
        //returns true if the column can accept another token; false otherwise.
    }

    /**
     * Drops a token to the bottom of the board in the specified
     * collumn
     * 
     * @param p The player character which will be placed in the
     * specified collumn
     *  
     * @param c The collumn which the token will be placed in
     * 
     * @pre c >= 0 AND c <=6 
     * 
     * @post 
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
     * @return true if 4 tokens connected in a row, up, or diagonal
     * false if 4 not connected
     * 
     * @pre c >= 0 AND c <= 6
     * 
     * @post 
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
     * 
     * @return true if all positions on gameboard are full
     * false if game has not ended
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
     * 
     * @param pos 
     * @param p 
     * @return 
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
     * @param pos Desired position on the gameboard
     * @param p 
     * @return 
     */
    public boolean checkVertWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        vertically. Returns true if it does, otherwise false*/
    }

    /**
     * Check if either player has 4 tokens connected diagonally
     * 
     * 
     * @param pos Desired position on the gameboard
     * @param p 
     * @return 
     */
    public boolean checkDiagWin(BoardPosition pos, char p)
    {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        diagonally. Returns true if it does, otherwise false Note: there are two diagonals to check*/
    }

    /**
     * Check which character is at any position on the gameboard
     * 
     * 
     * @param pos Desired position on the gameboard
     * @return Player token that is at desired position
     */
    public char whatsAtPos(BoardPosition pos)
    {
        //returns what is in the GameBoard at position pos If no marker is there, it returns a blank space char.
    }

    /**
     * Determine which player has placed a token at the position
     * on the gameboard
     * 
     * 
     * @param pos Desired position on the gameboard
     * @param player 
     * @return true iff correct player token is at position
     * false if other player is at position
     */
    public boolean isPlayerAtPos(BoardPosition pos, char player)
    {
        /*returns true if the player is at pos; otherwise, it returns false. Note: this method will be implemented very
        similarly to whatsAtPos, but it's asking a different question. We only know they will be similar because we
        know GameBoard will contain a 2D array. If the data structure were to change in the future,
        these two methods could be radically different.*/
    }

    /**
     * 
     * 
     * 
     * 
     */
    @Override
    public String toString(){

    }














}
