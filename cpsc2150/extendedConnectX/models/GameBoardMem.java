package cpsc2150.extendedConnectX.models;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)

 */

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * This class contains the methods that can be done by the game in order to validate token positions
 * and to advance the game for the memory efficient option.
 *
 * @invariant
 *
 * @corresponds num_rows = ROWS
 * @corresponds num_columns = COLUMNS
 * @corresponds num_to_win = numToWin
 *
 */
public class GameBoardMem extends AbsGameBoard implements IGameBoard {

    private static HashMap<Character, List<BoardPosition>> gameMap;
    private int ROWS;
    private int COLUMNS;
    private static int numToWin;

    /**
     * Constructs a memory efficient GameBoard that is the size specified by the parameters
     * and contains blank positions for every space on the board
     *
     * @param aRow number of rows for the GameBoard
     * @param aCol number of columns for the GameBoard
     * @param numWin number required to win the game
     *
     * @pre 3 <= aRow <= 100 AND 3 <= aCol <= 100 AND 3 <= numWin <= 25
     * @post ROWS = aRow AND COLUMNS = aCol AND numToWin = numWin
     */
    public GameBoardMem(int aRow, int aCol, int numWin) {
        gameMap = new HashMap<>();
        ROWS = aRow;
        COLUMNS = aCol;
        numToWin = numWin;
    }


    /**
     * Check which character is at any position on the GameBoard and returns said character.
     *
     * @param pos Current position on the GameBoard HashMap.
     *
     * @return Player token that is at desired position as a Character
     *
     * @pre None
     *
     * @post [whatsAtPos returns which player's character is at the current position on the game board
     * array] ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    @Override
    public char whatsAtPos(BoardPosition pos) {

        for (char c : gameMap.keySet()) {
            for (BoardPosition p : gameMap.get(c)) {
                if (p.equals(pos)) {
                    return c;
                }
            }
        }

        return ' ';
    }

    /**
     * Determine which player has placed a token at the position
     * on the GameBoard
     *
     * @param pos Indicates current position on the GameBoard
     *
     * @param player character of the player
     *
     * @return [boolean, true iff correct player token is at position
     * false iff other player is at position]
     *
     * @pre None
     *
     * @post [isPlayerAtPos returns true iff the player is at the corresponding position on the
     * GameBoard, return true iff the player is at the corresponding position]
     * AND self = #self AND num_rows = #num_rows AND num_columns = #num_columns AND num_to_win = #num_to_win
     */
    @Override
    public boolean isPlayerAtPos(BoardPosition pos, char player) {
        if (gameMap.containsKey(player)) {
            if (gameMap.get(player).contains(pos)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Drops a token to the bottom of the board in the lowest unoccupied specified
     * column
     *
     * @param p indicates player's character
     *
     * @param c indicates the column number
     *
     * @pre 3 <= c <= ROWS
     *
     * @post [GameBoard array at column c, contains player character]
     * AND [Instance variables Row = #row AND Column = #Column]
     * ROWS = #ROWS AND COLUMNS = #COLUMNS AND numToWin = #numToWin AND self = #self
     */
    @Override
    public void dropToken(char p, int c) {

        //Initializes a BoardPosition object and List for key,value pair
        BoardPosition pos = new BoardPosition(0, c);

        //Updates pos until blank space is found.
        if (whatsAtPos(pos) != ' ') {
            while (whatsAtPos(pos) != ' ') {
                pos = new BoardPosition(pos.getRow() + 1, c);
            }
        }

        List<BoardPosition> positList = new ArrayList<BoardPosition>();

        //Makes sure position is not already on the list.
        if (gameMap.get(p) == null) {
            positList.add(pos);
            gameMap.put(p, positList);
        }
        else {
            gameMap.get(p).add(pos);
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
    @Override
    public int getNumRows() {
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
    @Override
    public int getNumColumns() {
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
    @Override
    public int getNumToWin() {
        return numToWin;
    }
}
