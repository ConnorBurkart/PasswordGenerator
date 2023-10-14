/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)

*/

package cpsc2150.extendedConnectX.models;

/**IGameBoard contract
 * GameBoard represents the board for extendedConnect X
 *
 *@initialization Ensures:
 *              GameBoard contains no player values and is
 *              of size num_rows x num_columns
 *
 *@defines: num_rows : z
 *          num_columns : z
 *          num_to_win : z
 *
 *@constraints: |self| = num_rows x num_columns AND [GameBoard cannot contain any characters besides an 'X', 'O',
 *or '' at any point.] AND [num_to_win indicates number of consecutive matches to win the game, this must be equal to 5]
 *
 */
public interface IGameBoard {

    /**checkIfFreeContract
     * Returns true if column contains free space
     *
     * @param c indicates column number to check
     *
     *@return [boolean, true IFF column contains ' ', false otherwise]
     *
     *@pre c < num_columns
     *
     *@post [self = #self AND returns true IFF column contains a ' ' and returns
     * false otherwise] AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     *
     */
    public default boolean checkIfFree(int c) {

        //Creates boardPosition at row 0 and column c on GameBoard
        BoardPosition pos = new BoardPosition(0, c);

        //Checks that particular column is not full by checking top position in column
        if (whatsAtPos(pos) == 'X' || whatsAtPos(pos) == 'O') {
            return false;
        }

        return true;
    }

    public void dropToken(char p, int c);

    /** checkForWinContract
     * Checks to see if there are 5 tokens in a row, up,
     * or diagonal
     *
     * @param c indicates column number to check.
     *
     * @return [returns true iff 5 of the same players tokens (X or Y) are placed in a consecutive
     * horizontal, vertical, or diagonal row. False iff 5 tokens are not consecutively placed.]
     *
     * @pre c >= 0 AND c <= num_of_columns - 1
     *
     * @post [checkForWin returns true iff the last placed token is the 5th consecutive token in a vertical,
     * horizontal, or diagonal row. False iff the last placed token is not 5th or consecutive in a vertical,
     * horizontal, or diagonal row.] AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns
     * AND num_to_win = #num_to_win
     */
    public default boolean checkForWin(int c) {

        //Creates BoardPosition object for position 0,c.
        BoardPosition pos = new BoardPosition(0, c);
        char playerChar = ' ';

        for (int i = 0; i < getNumRows(); i++) {

            //Updates pos to new position going down the row
            pos = new BoardPosition(i, c);

            //Loop stops once last placed token is found.
            //Last placed token should be the uppermost token in column.
            if (whatsAtPos(pos) == 'X' || whatsAtPos(pos) == 'O') {
                playerChar = whatsAtPos(pos);
                break;
            }
        }

        //Checks if last placed token resulted in any valid win state
        if (checkVertWin(pos, playerChar) || checkHorizWin(pos, playerChar) || checkDiagWin(pos, playerChar)) {
            return true;
        }

        return false;
    }

    /**checkTieContract
     * Check to see if the game has ended in a tie
     *
     * @return [true iff all positions on GameBoard are full return false if
     * GameBoard is not full]
     *
     * @pre None
     *
     * @post [Checks each space on the gameBoard to see if it is occupied and if the entire gameBoard array
     * is occupied then returns true, else returns false because the game is still able to continue.] AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public default boolean checkTie() {

        for (int i = 0; i < getNumColumns(); i++) {

            //If no column is free then game ends in tie
            if (checkIfFree(i)) {
                return false;
            }
        }
        return true;
    }

    /**checkHorizWinContract
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
     * @post [Returns true iff last token placed in the 5th consecutive in a horizontal alignment, returns false
     * iff last placed token was not 5th or in a consecutive row.] AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public default boolean checkHorizWin(BoardPosition pos, char p) {

        int count = 0;
        //Used to remember original BoardPosition
        BoardPosition originalPos = pos;

        //Keeps column number from exceeding the number of columns
        while (pos.getColumn() < getNumColumns() - 1) {
            //Updates BoardPosition by updating column by 1
            pos = new BoardPosition(pos.getRow(), pos.getColumn() + 1);

            //count is iterated if token at pos matches p
            if (whatsAtPos(pos) == p) {
                count++;
            }

        }

        //Win occurs if count matches number to win
        if (count == getNumToWin() - 1) {
            return true;
        }

        //Resets count and pos for checking columns backwards
        count = 0;
        pos = originalPos;

        //Makes sure column value does not go below 0.
        while(pos.getColumn() > 0) {

            //pos is moved left 1 position.
            pos = new BoardPosition(pos.getRow(), pos.getColumn() - 1);

            //count iterates if token at pos matches p
            if (whatsAtPos(pos) == p) {
                count++;
            }


        }

        //win condition occurs if count matches num to win
        if (count == getNumToWin() - 1) {
            return true;
        }

        return false;
    }

    /**checkVertWinContract
     * Check if either player has 5 tokens connected vertically
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
     * returns false iff last placed token was not 5th or in a consecutive row.]
     * AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public default boolean checkVertWin(BoardPosition pos, char p) {

        int count = 0;

        //Makes sure row position does not exceed number of rows
        while (pos.getRow() < getNumRows() - 1 && count < getNumRows() - 1) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn());

            //Loop stops if token at pos does not match p
            if (whatsAtPos(pos) != p) {
                break;
            }

            //count iterates if token at pos and p match.
            count++;
        }

        //win condition occurs if count = num to win
        if (count == getNumToWin() - 1) {
            return true;
        }

        return false;
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
     * @post [checkDiagWin returns true iff last placed token was 5th consecutive token in a diagonal alignment.
     * returns false iff last placed token was not 5th or in a consecutive row.]
     * AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public default boolean checkDiagWin(BoardPosition pos, char p) {

        int count = 0;
        BoardPosition originalPos = pos;

        //Makes sure Row and Column value for pos is not invalid
        while (pos.getRow() < getNumRows() - 1 && pos.getColumn() < getNumColumns() - 1) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn() + 1);

            //count iterates if tokens on right vertical match
            if (whatsAtPos(pos) == p) {
                count++;
            }
        }

        //Win condition occurs if count = num to win
        if (count == getNumToWin() - 1) {
            return true;
        }

        pos = originalPos;
        count = 0;

        //Makes sure Row and Column value for pos is not invalid
        while (pos.getRow() < getNumRows() - 1 && pos.getColumn() > 0) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn() - 1);

            //count iterates if tokens on left vertical match
            if (whatsAtPos(pos) == p) {
                count++;
            }
        }

        //win condition occurs if count matches num to win
        if (count == getNumToWin() - 1) {
            return true;
        }

        return false;
    }

    /**whatsAtPosContract
     * Returns the player's character at GameBoard position
     *
     * @param pos Indicates position on gameBoard
     *
     * @return player's character (X or O or ' ') as a char.
     *
     * @pre [pos is Valid BoardPosition object]
     *
     * @post [whatsAtPos returns the character (X, O, or ' ') at the provided BoardPosition]
     * AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public char whatsAtPos(BoardPosition pos);

    /**isPlayerAtPosContract
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
     * AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public boolean isPlayerAtPos(BoardPosition pos, char player);

    /**toStringContract
     * Creates a string containing each value on GameBoard.
     *
     * @return the GameBoard formatted correctly as a String.
     *
     * @pre None
     *
     * @post [toString returns each value contained within the GameBoard
     * as a string formatted correctly] AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public String toString();

    /**getNumRowsContract
     * Returns the number of Rows on the GameBoard
     *
     * @return the number of Rows as an int
     *
     * @pre None
     *
     * @post getNumRows = num_rows AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public int getNumRows();

    /**getNumColumnsContract
     * Returns the number of Columns on the GameBoard
     *
     * @return the number of Columns as an int
     *
     * @pre None
     *
     * @post getNumColumns = num_columns AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public int getNumColumns();

    /**getNumRowsContract
     * Returns the number needed to win the game
     *
     * @return the number to win as an int
     *
     * @pre None
     *
     * @post getNumToWin = num_to_win AND self = #self
     * AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    public int getNumToWin();

}
