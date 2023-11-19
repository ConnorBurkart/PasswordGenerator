package cpsc2150.extendedConnectX.tests;

import cpsc2150.extendedConnectX.models.BoardPosition;
import cpsc2150.extendedConnectX.models.GameBoard;
import org.junit.Test;
import static org.junit.Assert.*;
import cpsc2150.extendedConnectX.models.IGameBoard;
import cpsc2150.extendedConnectX.models.GameBoardMem;

import java.util.HashMap;
import java.util.List;

public class TestGameBoardMem {

    private IGameBoard GameBoardMemFactory(int aRow, int aColumn, int numWin) {
        return new GameBoardMem(aRow, aColumn, numWin);
    }

    // Maybe needs to be a Hash Map
    private String makeExpectedGameBoardMem(HashMap<Character, List<BoardPosition>> map, int numRows, int numColumns) {
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

                if (!map.containsKey((char) ('A' + j)) || i >= map.get((char) ('A' + j)).size()) {
                    expectedBoard += "  ";
                }
                else {
                    expectedBoard += map.get((char) ('A' + j)).get(i);
                    expectedBoard += ' ';
                }
            }
            expectedBoard += "|\n";
        }

        return expectedBoard;
    }


    // Constructor tests
    @Test
    public void test_5_10_5_GameBoardMem() {

        int numRows = 5;
        int numColumns = 10;
        int numToWin = 5;

        HashMap<Character, List<BoardPosition>> map = new HashMap<>();
        IGameBoard gb = GameBoardMemFactory(numRows, numColumns, numToWin);

        String board = makeExpectedGameBoardMem(map, numRows, numColumns);

    }

}
