package cpsc2150.extendedConnectX.tests;

import cpsc2150.extendedConnectX.models.GameBoard;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestGameBoard {

    private GameBoard GameBoardFactory(int aRow, int aColumn, int numWin) {
        return new GameBoard(aRow, aColumn, numWin);
    }

    @Test
    public void test_5_10_5_GameBoard() {

        int numRows = 5;
        int numColumns = 10;
        int numToWin = 5;
        GameBoard testBoard = GameBoardFactory(numRows, numColumns, numToWin);

        assertTrue(testBoard.getNumRows() == numRows && testBoard.getNumColumns() == numColumns && testBoard.getNumToWin() == numToWin);
    }

    @Test
    public void test_75_4_75_GameBoard() {
        int numRows = 75;
        int numColumns = 4;
        int numToWin = 75;
        GameBoard testBoard = GameBoardFactory(numRows, numColumns, numToWin);

        assertTrue(testBoard.getNumRows() == numRows && testBoard.getNumColumns() == numColumns && testBoard.getNumToWin() == numToWin);
    }

    @Test
    public void test_100_100_25_GameBoard() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;
        GameBoard testBoard = GameBoardFactory(numRows, numColumns, numToWin);

        assertTrue(testBoard.getNumRows() == numRows && testBoard.getNumColumns() == numColumns && testBoard.getNumToWin() == numToWin);
    }

    //Constructor tests above

}
