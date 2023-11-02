package cpsc2150.extendedConnectX.models;

import java.util.*;
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
    public boolean isPlayerAtPos(BoardPosition pos, char player) {
        if (gameMap.containsKey(player)) {
            if (gameMap.get(player).contains(pos)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void dropToken(char p, int c) {

        //Initializes a BoardPosition object and List for key,value pair
        BoardPosition pos = new BoardPosition(0, c);

        //Updates pos until blank space is found.
        if (whatsAtPos(pos) != ' ') {
            while (whatsAtPos(pos) != ' ') {
                pos = new BoardPosition(pos.getRow() + 1, c);
            }
        }

        List<BoardPosition> positList = new ArrayList<BoardPosition>();

        //Makes sure position is not already on the list.
        if (gameMap.get(p) == null) {
            positList.add(pos);
            gameMap.put(p, positList);
        }
        else {
            gameMap.get(p).add(pos);
        }


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
