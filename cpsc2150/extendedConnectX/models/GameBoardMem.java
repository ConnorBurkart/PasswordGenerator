package cpsc2150.extendedConnectX.models;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public abstract class GameBoardMem extends AbsGameBoard implements IGameBoard {

    private static HashMap<Character, List<BoardPosition>> gameMap;




    public GameBoardMem() {
        gameMap = new HashMap<>();
    }

    public void addEntry(char key, BoardPosition value) {
        if (!gameMap.containsKey(key)) {
            gameMap.put(key, new ArrayList<>());
        }
        gameMap.get(key).add(value);
    }


}
