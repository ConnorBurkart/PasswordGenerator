package cpsc2150.extendedConnectX.models;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)

*/
/**
 * This board position class contains all data related to a possible position on the board.
 * BoardPosition contains a Row and Column number.
 */
public class BoardPosition
{
    private int Row;
    private int Column;

    /**
     * Constructs a BoardPosition object that indicates the exact
     * position of a token within the 9x7 range of the board.
     *
     * @param aRow number of Rows
     * @param aColumn number of Columns
     *
     * @pre aRow > 0 AND aRow <= 9 AND aColumn > 0 AND aColumn <= 7
     *
     * @post Row = aRow AND Column = aColumn
     */
    public BoardPosition(int aRow, int aColumn)
    {
        //parameterized constructor for BoardPosition
        Row = aRow;
        Column = aColumn;
    }

    /**
     * returns the row number for BoardPosition
     *
     * @return The row number as an integer.
     *
     * @pre None
     * 
     * @post getRow = Row AND Row = #Row AND Column = #Column
     */
    public int getRow()
    {
        return Row;
    }

    /**
     * returns the column number for BoardPosition
     *
     * @return The column number as an integer.
     *
     * @pre None
     * 
     * @post getColumn = Column AND Row = #Row AND Column = #Column
     */
    public int getColumn()
    {
        return Column;
    }

    /**
     * Takes in a BoardPosition object and returns true if two BoardPositions are equal to each
     * other.
     *
     * @param obj [Parameters are BoardPosition object]
     *
     * @return [boolean, true iff two BoardPosition objects have the same Row and Column values and False iff
     * two BoardPosition objects have different Row and Column values.]
     *
     * @pre None
     *
     * @post [equals iff (this.Row - obj.Row AND this.Column - obj.Column AND
     * [this and obj are both instances of BoardPosition])]
     * AND self = #self AND Row = #Row AND Column = #Column
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        return false;
    }

    /**
     * Takes the values for Row and Column and converts them into string format "<Row>,<Column>"
     *
     * @return The values for Row and Column as a string.
     *
     * @pre None
     *
     * @post [toString = "<Row>,<Column>"] AND Row = #Row AND Column = #Column
     */
    @Override
    public String toString()
    {
        return "<" + Row + ">" + "<" + Column + ">";
    }
}