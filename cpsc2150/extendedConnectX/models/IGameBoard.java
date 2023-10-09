package cpsc2150.extendedConnectX.models;

public interface IGameBoard {
    public boolean checkIfFree(int c);
    public void dropToken(char p, int c);
    public boolean checkForWin(int c);
    public boolean checkTie();
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
