package cpsc2150.extendedConnectX.tests;

import cpsc2150.extendedConnectX.models.BoardPosition;
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

        for (int i = numRows - 1; i >= 0; i--) {
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
    public void test_MaxSize_MaxNumToWin_GameBoard() {
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
        char[][] expectedBoard = new char[numRows][numColums];
        String blankBoard = makeExpectedGameBoard(expectedBoard, numRows, numColums);

        assertTrue(gb.checkIfFree(ColumnToDrop));
        assertTrue(gb.toString().equals(blankBoard));
    }

    @Test
    public void test_0_half_CheckIfFree() {
        int numRows = 4;
        int numColums = 10;
        int numToWin = 5;

        int ColumnToDrop = 0;
        IGameBoard gb = GameBoardFactory(numRows, numColums, numToWin);
        char[][] expectedBoard = new char[numRows][numColums];

        for (int i = 0; i < (numRows / 2); i++) {
            if (i % 2 == 0) {
                gb.dropToken('O', ColumnToDrop);
                expectedBoard[i][ColumnToDrop] = 'O';
            }
            else {
                gb.dropToken('X', ColumnToDrop);
                expectedBoard[i][ColumnToDrop] = 'X';
            }
        }

        String expectedString = makeExpectedGameBoard(expectedBoard, numRows, numColums);

        assertTrue(gb.checkIfFree(ColumnToDrop));
        assertTrue(gb.toString().equals(expectedString));

    }

    @Test
    public void test_2_fullBoard_CheckIfFree() {
        int numRows = 4;
        int numColums = 10;
        int numToWin = 5;

        int ColumnToCheck = 2;
        IGameBoard gb = GameBoardFactory(numRows, numColums, numToWin);
        char[][] expectedBoard = new char[numRows][numColums];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                if (i % 2 == 0) {
                    gb.dropToken('O', j);
                    expectedBoard[i][j] = 'O';
                }
                else {
                    gb.dropToken('X', j);
                    expectedBoard[i][j] = 'X';
                }
            }
        }

        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColums);

        assertTrue(!gb.checkIfFree(ColumnToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));

    }

    //checkHorizWin tests
    @Test
    public void test_0_5_checkHorizWin() {
        int numRows = 25;
        int numColumns = 25;
        int numToWin = 5;

        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        for (int i = 0; i < numToWin; i++) {
            gb.dropToken('X', i);
            expectedBoard[0][i] = 'X';
        }
        BoardPosition positionToCheck = new BoardPosition(0, 5);
        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);


        assertTrue(gb.checkHorizWin(positionToCheck, 'X'));
        assertTrue(gb.toString().equals(expectedBoardString));
    }

    //whatsAtPos tests
    @Test
    public void test_MinRow_MinCol_whatsAtPos() {
        int numRows = 3;
        int numColumns = 3;
        int numToWin = 3;

        int ColumnToDrop = 0;
        int RowToDrop = 0;
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        gb.dropToken('X', ColumnToDrop);
        expectedBoard[RowToDrop][ColumnToDrop] = 'X';
        BoardPosition positionToCheck = new BoardPosition(RowToDrop, ColumnToDrop);

        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals('X', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));


    }

    @Test
    public void test_25_4_FULLBOARD_whatsAtPos() {
        int numRows = 30;
        int numColumns = 25;
        int numToWin = 10;

        int RowToCheck = 25;
        int ColumnToCheck = 4;
        BoardPosition positionToCheck = new BoardPosition(RowToCheck, ColumnToCheck);
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (j % 2 == 0) {
                    gb.dropToken('O', j);
                    expectedBoard[i][j] = 'O';
                }
                else {
                    gb.dropToken('X', j);
                    expectedBoard[i][j] = 'X';
                }
            }
        }

        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals('O', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));
    }

    @Test
    public void test_75_99_BLANK_whatsAtPos() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;

        int RowToCheck = 75;
        int ColumnToCheck = 99;
        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        BoardPosition positionToCheck = new BoardPosition(RowToCheck, ColumnToCheck);
        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals(' ', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));

    }

    @Test
    public void test_MaxCol_MaxROW_FULLBOARD_whatsAtPos() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;

        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (j % 2 == 0) {
                    gb.dropToken('P', j);
                    expectedBoard[i][j] = 'P';
                }
                else {
                    gb.dropToken('J', j);
                    expectedBoard[i][j] = 'J';
                }
            }
        }

        BoardPosition positionToCheck = new BoardPosition(numRows - 1, numColumns - 1);
        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals('J', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));

    }

    @Test
    public void test_ExactCenter_FULLBOARD_whatsAtPos() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;

        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (j % 2 == 0) {
                    gb.dropToken('P', j);
                    expectedBoard[i][j] = 'P';
                }
                else {
                    gb.dropToken('J', j);
                    expectedBoard[i][j] = 'J';
                }
            }
        }

        BoardPosition positionToCheck = new BoardPosition(numRows / 2, numColumns / 2);
        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals('P', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));
    }

    @Test
    public void test_ExactCenter_QuarterFull_whatsAtPos() {
        int numRows = 100;
        int numColumns = 100;
        int numToWin = 25;

        IGameBoard gb = GameBoardFactory(numRows, numColumns, numToWin);
        char[][] expectedBoard = new char[numRows][numColumns];


        for (int i = 0; i < (numRows / 4); i++) {
            for (int j = 0; j < (numColumns / 4); j++) {
                if (j % 2 == 0) {
                    gb.dropToken('P', j);
                    expectedBoard[i][j] = 'P';
                }
                else {
                    gb.dropToken('J', j);
                    expectedBoard[i][j] = 'J';
                }
            }
        }

        BoardPosition positionToCheck = new BoardPosition(numRows / 2, numColumns / 2);
        String expectedBoardString = makeExpectedGameBoard(expectedBoard, numRows, numColumns);

        assertEquals(' ', gb.whatsAtPos(positionToCheck));
        assertTrue(gb.toString().equals(expectedBoardString));
    }



}
