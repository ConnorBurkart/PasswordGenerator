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
 *  or '' at any point.] AND [num_to_win indicates number of consecutive matches to win the game, this must be equal to 5]
 *
 */
public interface IGameBoard {

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
     * an 'X' or an 'O'.)] AND [Row = #Row AND Column = #Column]
     * AND self = #self
     * */
    public default boolean checkIfFree(int c) {
        //returns true if the column can accept another token; false otherwise.
        BoardPosition pos = new BoardPosition(0, c);
        if (whatsAtPos(pos) == 'X' || whatsAtPos(pos) == 'O') {
            return false;
        }

        return true;
    }

    public void dropToken(char p, int c);

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
    public default boolean checkForWin(int c) {
        /*this function will check to see if the last token placed in column c resulted in the player winning the game.
        If so it will return true, otherwise false. Note: this is not checking the entire board for a win, it is just
        checking if the last token placed results in a win. You may call other methods to complete this method */
        BoardPosition pos = new BoardPosition(0, c);
        char playerChar = ' ';

        for (int i = 0; i < getNumRows(); i++) {
            pos = new BoardPosition(i, c);
            if (whatsAtPos(pos) == 'X' || whatsAtPos(pos) == 'O') {
                playerChar = whatsAtPos(pos);
                break;
            }
        }

        if (checkVertWin(pos, playerChar) || checkHorizWin(pos, playerChar) || checkDiagWin(pos, playerChar)) {
            return true;
        }

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
    public default boolean checkTie() {
        /*this function will check to see if the game has resulted in a tie. A game is tied if there are no free board
        positions remaining. You do not need to check for any potential wins because we can assume that the players
        were checking for win conditions as they played the game. It will return true if the game is tied and
        false otherwise.*/
        for (int i = 0; i < getNumColumns(); i++) {
            if (checkIfFree(i)) {
                return false;
            }
        }

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
    public default boolean checkHorizWin(BoardPosition pos, char p) {
        int count = 0;
        BoardPosition originalPos = pos;
        while (pos.getColumn() < getNumColumns() - 1) {
            pos = new BoardPosition(pos.getRow(), pos.getColumn() + 1);


            if (whatsAtPos(pos) == p) {
                count++;
            }


        }

        if (count == getNumToWin() - 1) {
            return true;
        }

        count = 0;
        pos = originalPos;

        while(pos.getColumn() > 0) {
            pos = new BoardPosition(pos.getRow(), pos.getColumn() - 1);

            if (whatsAtPos(pos) == p) {
                count++;
            }


        }

        if (count == getNumToWin() - 1) {
            return true;
        }

        return false;
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
    public default boolean checkVertWin(BoardPosition pos, char p) {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        vertically. Returns true if it does, otherwise false*/

        int count = 0;

        while (pos.getRow() < getNumRows() - 1 && count < getNumRows() - 1) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn());

            if (whatsAtPos(pos) != p) {
                break;
            }
            count++;
        }

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
     * returns false iff last placed token was not 5th or in a consecutive row.] AND self = #self.
     */
    public default boolean checkDiagWin(BoardPosition pos, char p) {

        int count = 0;
        BoardPosition originalPos = pos;

        while (pos.getRow() < getNumRows() - 1 && pos.getColumn() < getNumColumns() - 1) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn() + 1);

            if (whatsAtPos(pos) == p) {
                count++;
            }
        }

        if (count == getNumToWin() - 1) {
            return true;
        }

        pos = originalPos;
        count = 0;

        while (pos.getRow() < getNumRows() - 1 && pos.getColumn() > 0) {
            pos = new BoardPosition(pos.getRow() + 1, pos.getColumn() - 1);

            if (whatsAtPos(pos) == p) {
                count++;
            }
        }

        if (count == getNumToWin() - 1) {
            return true;
        }

        return false;
    }

    public char whatsAtPos(BoardPosition pos);

    public boolean isPlayerAtPos(BoardPosition pos, char player);

    public String toString();

    public int getNumRows();

    public int getNumColumns();

    public int getNumToWin();

}
