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
     * @param
     * @param
     * @pre
     * aRow > 0 and aRow <= 9
     * aColumn > 0 and aColumn <= 7
     * @post
     */
    public BoardPosition(int aRow, int aColumn)
    {
        //parameterized constructor for BoardPosition
    }

    public int getRow()
    {
        //returns the row
    }

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