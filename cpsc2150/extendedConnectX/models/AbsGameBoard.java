package cpsc2150.extendedConnectX.models;

public abstract class AbsGameBoard implements IGameBoard
{
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
