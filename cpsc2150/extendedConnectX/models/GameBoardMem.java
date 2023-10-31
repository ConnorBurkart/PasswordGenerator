package cpsc2150.extendedConnectX.models;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class GameBoardMem extends AbsGameBoard implements IGameBoard {

    private static HashMap<Character, List<BoardPosition>> gameMap;
    private int ROWS;
    private int COLUMNS;
    private static int numToWin;


    public GameBoardMem(int aRow, int aCol, int numWin) {
        gameMap = new HashMap<>();
        ROWS = aRow;
        COLUMNS = aCol;
        numToWin = numWin;
    }

    public void addEntry(char key, BoardPosition value) {
        if (!gameMap.containsKey(key)) {
            gameMap.put(key, new ArrayList<>());
        }
        gameMap.get(key).add(value);
    }

    @Override
    public char whatsAtPos(BoardPosition pos) {

        for (char c : gameMap.keySet()) {
            for (BoardPosition p : gameMap.get(c)) {
                if (p.equals(pos)) {
                    return c;
                }
            }
        }

        return ' ';

    }

    @Override
    public void dropToken(char p, int c) {

        /*
            Loop through key values for gameMap.
            call checkIfFree for each key value to see if token for any key value is in that column.
            if p == gameMap.key.

         */
    }

    @Override
    public int getNumRows() {
        return ROWS;
    }

    @Override
    public int getNumColumns() {
        return COLUMNS;
    }

    @Override
    public int getNumToWin() {
        return numToWin;
    }
}
