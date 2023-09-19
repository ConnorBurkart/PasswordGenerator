package cpsc2150.extendedConnectX.models;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)


 */

public class BoardPosition
{
    private int Row;
    private int Column;

    /**
     * Constructs a BoardPosition object that indicates the exact
     * position of a token within the 9x7 range of the board.
     *
     * @param aRow
     * @param aColumn
     *
     * @pre aRow > 0 AND aRow <= 9 AND aColumn > 0 AND aColumn <= 7
     *
     * @post Row = aRow AND Column = aColumn
     */
    public BoardPosition(int aRow, int aColumn)
    {
        //parameterized constructor for BoardPosition
    }

    /**
     * returns the row number for BoardPosition
     *
     * @return The row number as an integer.
     *
     * @pre None
     * 
     * @post getRow = Row. Row = #Row AND Column = #Column
     */
    public int getRow()
    {
        //returns the row
    }

    /**
     * returns the column number for BoardPosition
     *
     * @return The column number as an integer.
     *
     * @pre None
     * 
     * @post getColumn = Column. Row = #Row AND Column = #Column
     */
    public int getColumn()
    {
        //returns the column
    }

    @Override
    public boolean equals(Object obj)
    {

    }

    @Override
    public String toString()
    {

    }
}