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

    private static GameBoard playerBoard;
    private static boolean isPlayerXTurn = true;
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
        int column = 0;
        boolean invalidColumnNum = true;
        while (invalidColumnNum) {

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
            else if (!playerBoard.checkIfFree(column)) {
                System.out.println("Column is full");
            }
            else {
                invalidColumnNum = false;
            }


        }

        if (isPlayerXTurn) { isPlayerXTurn = false; }
        else { isPlayerXTurn = true; }


        return column;

    }

    public static void main(String[] args)
    {
        playerBoard = new GameBoard();

        int col = 0;
        char playerInput = 'y';
        while (playerInput == 'y') {
            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('X', col);

            if (playerBoard.checkTie()) {
                System.out.println("Tie!");
                System.out.println("Would you like to play again? y/n");
                Scanner inputChar = new Scanner(System.in);
                playerInput = inputChar.next().charAt(0);

                if (playerInput == 'n') {
                    break;
                }

                isPlayerXTurn = true;
                playerBoard = new GameBoard();
            }

            if (playerBoard.checkForWin(col)) {
                printWinner();
                System.out.println("Would you like to play again? y/n");
                Scanner inputChar = new Scanner(System.in);
                playerInput = inputChar.next().charAt(0);
                playerBoard = new GameBoard();
            }

            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('O', col);

            if (playerBoard.checkTie()) {
                System.out.println("Tie!");
                System.out.println("Would you like to play again? y/n");
                Scanner inputChar = new Scanner(System.in);
                playerInput = inputChar.next().charAt(0);
                playerBoard = new GameBoard();
            }

            if (playerBoard.checkForWin(col)) {
                printWinner();
                System.out.println("Would you like to play again? y/n");
                Scanner inputChar = new Scanner(System.in);
                playerInput = inputChar.next().charAt(0);
                playerBoard = new GameBoard();
            }


        }

    }

}