package cpsc2150.extendedConnects;

import cpsc2150.extendedConnectX.models.GameBoard;
import java.util.Scanner;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)


 */
public class GameScreen {

    private static final GameBoard playerBoard = new GameBoard();
    public static boolean isPlayerXTurn = true;
    private static void printBoard()
    {
        System.out.println("|0|1|2|3|4|5|6|");

        for (int i = 0; i < playerBoard.getNumRows(); i++) {
            for (int j = 0; j < playerBoard.getNumColumns(); j++) {
                System.out.print('|');
                System.out.print(playerBoard.whatsAtPos(playerBoard.currentPos));
            }
            System.out.print('|');
            System.out.print('\n');
        }
    }

    private static void printWinner()
    {

    }

    private static int askPlayerForColumn()
    {

        if (isPlayerXTurn) {
            System.out.println("Player X, what column do you want to place your marker in?\n");
            isPlayerXTurn = false;
        }
        else {
            System.out.println("Player O, what column do you want to place your marker in?\n");
            isPlayerXTurn = true;
        }

        Scanner in = new Scanner(System.in);
        return in.nextInt();

    }

    public static void main(String[] args)
    {
        printBoard();

        //I just added to make sure askPlayerForColumn was working
        System.out.println(askPlayerForColumn());
        System.out.println(askPlayerForColumn());

    }

}