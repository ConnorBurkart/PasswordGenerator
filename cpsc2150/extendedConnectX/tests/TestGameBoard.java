package cpsc2150.extendedConnectX.tests;

import cpsc2150.extendedConnectX.models.GameBoard;
import cpsc2150.extendedConnectX.models.IGameBoard;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestGameBoard {

    private IGameBoard GameBoardFactory(int aRow, int aColumn, int numWin) {
        return new GameBoard(aRow, aColumn, numWin);
    }

    private String makeExpectedGameBoard(char[][] aArray, int numRows, int numColumns) {
        String expectedBoard = "";
        int DoubleDigit = 10;

        for (int i = 0; i < numColumns; i++) {
            if (i < DoubleDigit) {
                expectedBoard += "| ";
            }
            else {
                expectedBoard += '|';
            }
            expectedBoard += i;
        }

        expectedBoard += "|\n";

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                expectedBoard += '|';

                if (!Character.isLetter(aArray[i][j])) {
                    expectedBoard += "  ";
                }
                else {
                    expectedBoard += aArray[i][j];
                    expectedBoard += ' ';
                }
            }
            expectedBoard += "|\n";
        }

        return expectedBoard;
    }

    //Constructor Tests

    @Test
    public void test_5_10_5_GameBoard() {

        int numRows = 5;
        int numColumns = 10;
        int numToWin = 5;

        char[][] expectedBoard = new char[numRows][numColumns];
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);

        String blankBoard = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals(numRows, gb.getNumRows());
        assertEquals(numColumns, gb.getNumColumns());
        assertTrue(gb.toString().equals(blankBoard));
    }


    @Test
    public void test_75_4_75_GameBoard() {
        int numRows = 75;
        int numColumns = 4;
        int numToWin = 75;

        char[][] expectedBoard = new char[numRows][numColumns];
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);

        String blankBoard = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals(numRows, gb.getNumRows());
        assertEquals(numColumns, gb.getNumColumns());
        assertTrue(gb.toString().equals(blankBoard));
    }

    @Test
    public void test_100_100_25_GameBoard() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;

        char[][] expectedBoard = new char[numRows][numColumns];
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);

        String blankBoard = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals(numRows, gb.getNumRows());
        assertEquals(numColumns, gb.getNumColumns());
        assertTrue(gb.toString().equals(blankBoard));
    }

    //CheckIfFree tests
    @Test
    public void test_3_empty_CheckIfFree() {
        int numRows = 4;
        int numColums = 10;
        int numToWin = 5;

        int ColumnToDrop = 3;
        IGameBoard gb = GameBoardFactory(numRows, numColums, numToWin);

        assertTrue(gb.checkIfFree(ColumnToDrop));
    }

    @Test
    public void test_0_half_CheckIfFree() {
        int numRows = 4;
        int numColums = 10;
        int numToWin = 5;

        int ColumnToDrop = 0;
        IGameBoard gb = GameBoardFactory(numRows, numColums, numToWin);

        for (int i = 0; i < (numRows / 2); i++) {
            gb.dropToken('X', ColumnToDrop);
        }

        assertTrue(gb.checkIfFree(ColumnToDrop));
    }

    @Test
    public void test_2_fullBoard_CheckIfFree() {
        int numRows = 4;
        int numColums = 10;
        int numToWin = 5;

        int ColumnToDrop = 2;
        IGameBoard gb = GameBoardFactory(numRows, numColums, numToWin);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                gb.dropToken('X', j);
            }
        }

        assertTrue(!gb.checkIfFree(ColumnToDrop));

    }

    //checkHorizWin tests



}
