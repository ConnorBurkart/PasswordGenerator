package cpsc2150.extendedConnects;

import cpsc2150.extendedConnectX.models.BoardPosition;
import cpsc2150.extendedConnectX.models.GameBoard;
import java.util.Scanner;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)


 */
public class GameScreen {

    private static final GameBoard playerBoard = new GameBoard();
    private static boolean isPlayerXTurn = true;
    private static boolean isGameOver = false;
    public static void printBoard()
    {
        System.out.println("|0|1|2|3|4|5|6|");

        for (int i = 0; i < playerBoard.getNumRows(); i++) {
            for (int j = 0; j < playerBoard.getNumColumns(); j++) {
                BoardPosition currentPos = new BoardPosition(i, j);
                System.out.print('|');
                System.out.print(playerBoard.whatsAtPos(currentPos));
            }
            System.out.print('|');
            System.out.print('\n');
        }
    }

    public static void printWinner()
    {
        if (isPlayerXTurn) {
            System.out.println("Player X Won!");
        }
        else {
            System.out.println("Player O Won!");
        }
    }

    public static int askPlayerForColumn()
    {
        int column;
        do {
            if (isPlayerXTurn) {
                System.out.println("Player X, what column do you want to place your marker in?\n");
            }
            else {
                System.out.println("Player O, what column do you want to place your marker in?\n");
            }

            Scanner in = new Scanner(System.in);
            column = in.nextInt();

            if (column < 0) {
                System.out.println("Column cannot be less than 0");
            }
            else if (column > playerBoard.getNumColumns() - 1) {
                System.out.println("Column cannot be greater than 6");
            }

        } while (column < 0 || column > playerBoard.getNumColumns() - 1);

        if (isPlayerXTurn) { isPlayerXTurn = false; }
        else { isPlayerXTurn = true; }

        if (playerBoard.checkForWin(column)) {
            isGameOver = true;
        }

        return column;

    }

    public static void main(String[] args)
    {
        while (!isGameOver)
        {
            int col = 0;
            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('X', col);
            playerBoard.checkTie();
            playerBoard.checkForWin(col);
            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('O', col);
            playerBoard.checkTie();
            playerBoard.checkForWin(col);
        }

        printWinner();

    }

}