/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)

*/

package cpsc2150.extendedConnectX.models;

public abstract class AbsGameBoard implements IGameBoard
{
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
    public String toString() {

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
}
