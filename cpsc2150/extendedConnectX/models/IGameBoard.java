package cpsc2150.extendedConnectX.models;

public interface IGameBoard {
    public default boolean checkIfFree(int c) {
        //returns true if the column can accept another token; false otherwise.
        BoardPosition pos = new BoardPosition(0, c);
        if (whatsAtPos(pos) == 'X' || whatsAtPos(pos) == 'O') {
            return false;
        }

        return true;
    }

    public void dropToken(char p, int c);

    public boolean checkForWin(int c);

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

    public boolean checkHorizWin(BoardPosition pos, char p);

    public boolean checkVertWin(BoardPosition pos, char p);

    public boolean checkDiagWin(BoardPosition pos, char p);

    public char whatsAtPos(BoardPosition pos);

    public boolean isPlayerAtPos(BoardPosition pos, char player);

    public String toString();

    public int getNumRows();

    public int getNumColumns();

    public int getNumToWin();

}
