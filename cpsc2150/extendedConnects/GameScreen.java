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
        /*
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

         */
        System.out.println(playerBoard.toString());
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
                System.out.println("Player X, what column do you want to place your marker in?");
            }
            else {
                System.out.println("Player O, what column do you want to place your marker in?");
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

        return column;

    }

    public static void main(String[] args)
    {
        playerBoard = new GameBoard();

        int col = 0;
        char playerInput = 'y';
        while (playerInput == 'y')
        {
            isPlayerXTurn = true;
            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('X', col);

            if (playerBoard.checkTie())
            {
                printBoard();
                do {
                    System.out.println("Tie!");
                    System.out.println("Would you like to play again? y/n");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');

                if (playerInput == 'n')
                {
                    break;
                }

                playerBoard = new GameBoard();
            }

            if (playerBoard.checkForWin(col))
            {
                printBoard();
                printWinner();
                do {
                    System.out.println("Would you like to play again? y/n");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                if (playerInput == 'n')
                {
                    break;
                }
                playerBoard = new GameBoard();
            }

            /*
            I'm thinking that since everything is in this while loop, we only need to have 3 if statements.
            1. check for a tie and if the game ends, we ask them if they want to play again, and they select 'y'
                then the game will continue. If they select 'n' then the game will end because the player input will
                no longer be 'y'.
            2. Another if statement and we ask them again, then the game will continue based on their response.
            3. The last if statement will be one that checks for an out-of-bounds response and require them to
                select a valid input, and the game will continue.
            I would say that above this comment we should have a bounds check if statement and below this if statement
            there should be no more code because anything else will go back to the beginning of the loop.

            Also, in the if statement for the playerInput == 'n' I am not sure if the **break;** statement will exit
            the while loop, but if it doesn't we have to figure out how to exit the while loop to end the game.

            Aside from these changes the game should be complete once we figure out the other functions
            that need fixing.
             */

            printBoard();
            isPlayerXTurn = false;
            col = askPlayerForColumn();
            playerBoard.dropToken('O', col);

            if (playerBoard.checkTie()) {
                printBoard();
                System.out.println("Tie!");
                do {
                    System.out.println("Would you like to play again? y/n");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                playerBoard = new GameBoard();
            }


            if (playerBoard.checkForWin(col)) {
                printBoard();
                printWinner();
                do {
                    System.out.println("Would you like to play again? y/n");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                playerBoard = new GameBoard();
            }


        }

    }

}