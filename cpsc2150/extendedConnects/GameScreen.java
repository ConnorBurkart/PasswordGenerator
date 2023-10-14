package cpsc2150.extendedConnects;

import cpsc2150.extendedConnectX.models.BoardPosition;
import cpsc2150.extendedConnectX.models.GameBoard;
import java.util.Scanner;

/*GROUP MEMBER NAMES AND GITHUB USERNAMES SHOULD GO HERE
Jacob Colson (jccolso)
Warren Wasden (wwasden)
Steven Cabezas (scabeza)


 */

/**
 * This class GameScreen contains the helper functions and the main function for
 * the program.
 *
 * @invariant Column >= 0 AND Column <= 8
 *
 */
public class GameScreen {

    private static GameBoard playerBoard;
    private static boolean isPlayerXTurn = true;

    /**
     * Prints the board in current relation to the playerBoard object.
     *
     * @pre None
     *
     * @post [Prints the string created by calling toString] AND self = #self AND isPlayerXTurn = #isPlayerXTurn
     */
    public static void printBoard()
    {
        System.out.println(playerBoard.toString());
    }

    /**
     * Prints the winner of the game.
     *
     * @pre None
     *
     * @post [Prints the winner of the game to the terminal] AND self = #self AND isPlayerXTurn = #isPlayerXTurn
     */
    public static void printWinner()
    {
        if (isPlayerXTurn) {
            System.out.println("Player X Won!");
        }
        else {
            System.out.println("Player O Won!");
        }
    }

    /**
     * Ask player which column they want their token dropped in.
     *
     * @return the column in which the player wants the token dropped as an int
     *
     * @pre None
     *
     * @post [askPlayerForColumn = value for column provided by player] AND self = #self
     * AND isPlayerXTurn = #isPlayerXTurn
     */
    public static int askPlayerForColumn()
    {
        int column = 0;
        boolean invalidColumnNum = true;
        while (invalidColumnNum) {

            //Asks either player, X or O or their column number.
            if (isPlayerXTurn) {
                System.out.println("Player X, what column do you want to place your marker in?");
            }
            else {
                System.out.println("Player O, what column do you want to place your marker in?");
            }

            //Gets column number from player.
            Scanner in = new Scanner(System.in);
            column = in.nextInt();

            //Validates that column number is valid.
            if (column < 0) {
                System.out.println("Column cannot be less than 0");
            }
            else if (column > playerBoard.getNumColumns() - 1) {
                System.out.println("Column cannot be greater than 6");
            }
            //Validates that column is empty.
            else if (!playerBoard.checkIfFree(column)) {
                System.out.println("Column is full");
            }

            //Column determined to be valid.
            else {
                invalidColumnNum = false;
            }


        }

        return column;

    }

    /**
     * Driver for the ConnectX game
     *
     * @pre None
     *
     * @post [Returns which player won by the end of the game, either X or O, isPlayerName updates according to
     * which player's turn it is and GameBoard is populated with the values for each player]
     */
    public static void main(String[] args)
    {

        playerBoard = new GameBoard();

        int col = 0;
        char playerInput = 'y';

        //Allows game to continue if player chooses y
        while (playerInput == 'y')
        {
            isPlayerXTurn = true;
            printBoard();
            col = askPlayerForColumn();
            playerBoard.dropToken('X', col);

            //Check to see if a tie has occured
            if (playerBoard.checkTie())
            {
                printBoard();

                //validates the user's choice
                do {
                    System.out.println("Tie!");
                    System.out.println("Would you like to play again? Y/N");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');


                playerBoard = new GameBoard();
                continue;
            }

            //Checks if a win condition occurs
            if (playerBoard.checkForWin(col))
            {
                printBoard();
                printWinner();

                //Makes sure that input is valid entry
                do {
                    System.out.println("Would you like to play again? Y/N");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                playerBoard = new GameBoard();
                continue;
            }

            //Begins getting information from player O
            printBoard();
            isPlayerXTurn = false;
            col = askPlayerForColumn();
            playerBoard.dropToken('O', col);

            //Checks that tie has occured
            if (playerBoard.checkTie()) {
                printBoard();
                System.out.println("Tie!");

                //Validates user's choice for playing again.
                do {
                    System.out.println("Would you like to play again? Y/N");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                playerBoard = new GameBoard();
                continue;
            }

            //Checks that win condition has occurred
            if (playerBoard.checkForWin(col)) {
                printBoard();
                printWinner();

                //validates user's input for playing another game.
                do {
                    System.out.println("Would you like to play again? Y/N");
                    Scanner inputChar = new Scanner(System.in);
                    playerInput = inputChar.next().charAt(0);
                } while (playerInput != 'y' && playerInput != 'n');
                playerBoard = new GameBoard();
                continue;
            }

        }

    }

}