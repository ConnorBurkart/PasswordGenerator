package cpsc2150.extendedConnects;

import cpsc2150.extendedConnectX.models.BoardPosition;
import cpsc2150.extendedConnectX.models.GameBoard;
import cpsc2150.extendedConnectX.models.GameBoardMem;
import cpsc2150.extendedConnectX.models.IGameBoard;

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

    private static IGameBoard playerBoard;
    private static char winningChar = 'a';
    public static final int maxPlayers = 10;
    public static final int minPlayers = 3;
    public static final int maxRowsCol = 100;
    public static final int minRowsCol = 3;

    /**
     * Prints the board in current relation to the playerBoard object.
     *
     * @pre None
     * @post [Prints the string created by calling toString] AND self = #self AND isPlayerXTurn = #isPlayerXTurn
     */
    public static void printBoard() {
        System.out.println(playerBoard.toString());
    }

    /**
     * Prints the winner of the game.
     *
     * @pre None
     * @post [Prints the winner of the game to the terminal] AND self = #self AND isPlayerXTurn = #isPlayerXTurn
     */
    public static void printWinner() {
        System.out.println("Player " + winningChar +" Won!");
    }

    /**
     * Ask player which column they want their token dropped in.
     *
     * @return the column in which the player wants the token dropped as an int
     * @pre None
     * @post [askPlayerForColumn = value for column provided by player] AND self = #self
     * AND isPlayerXTurn = #isPlayerXTurn
     */
    public static int askPlayerForColumn() {
        int column = 0;
        //Gets column number from player.
        Scanner in = new Scanner(System.in);
        column = in.nextInt();

        return column;

    }

    /**
     * Driver for the ConnectX game
     *
     * @pre None
     * @post [Returns which player won by the end of the game, either X or O, isPlayerName updates according to
     * which player's turn it is and GameBoard is populated with the values for each player]
     */
    public static void main(String[] args) {
        // Input validation for the amount of players
        char playerInput = 'y';
        do {
            boolean valid = true;
            int numOfPlayers = 0;
            while (valid) {
                System.out.println("How many players?");
                Scanner playerAmount = new Scanner(System.in);
                numOfPlayers = playerAmount.nextInt();
                if (numOfPlayers > maxPlayers) {
                    System.out.println("Must be 10 players or fewer");
                } else if (numOfPlayers < minPlayers) {
                    System.out.println("Must be at least 2 players");
                } else {
                    valid = false;
                }
            }
            // Assigning character values to each player
            char[] playerCharacters = new char[numOfPlayers];
            for (int i = 0; i < numOfPlayers; i++) {
                char playerChar;

                do {
                    valid = true;
                    System.out.println("Enter the character to represent player " + (i + 1));
                    Scanner scan = new Scanner(System.in);
                    playerChar = scan.next().charAt(0);
                    playerChar = Character.toUpperCase(playerChar);
                    for (int j = 0; j <= i; j++) {
                        if (playerChar == playerCharacters[j]) {
                            System.out.println(playerChar + "is already taken as a player token!");

                            break;
                        }
                        valid = false;
                    }
                } while (valid);
                playerCharacters[i] = playerChar;
            }
            // Determine number of rows, columns, and number of tokens in a row to win for the game
            int numOfRows = 0;
            int numOfColumns = 0;
            int numberToWin = 0;
            valid = true;

            System.out.println("How many rows should be on the board?");
            Scanner input = new Scanner(System.in);
            numOfRows = input.nextInt();
            while (valid) {
                if (numOfRows > maxRowsCol || numOfRows < minRowsCol) {
                    System.out.println("Amount of rows must be between 3 - 100");
                    numOfRows = input.nextInt();
                }
                valid = false;
            }
            valid = true;
            System.out.println("How many columns should be on the board?");
            numOfColumns = input.nextInt();
            while (valid) {
                if (numOfColumns > maxRowsCol || numOfColumns < minRowsCol) {
                    System.out.println("Amount of columns must be between 3 - 100");
                }
                valid = false;
            }
            valid = true;
            System.out.println("How many in a row to win?");
            numberToWin = input.nextInt();
            while (valid) {
                if (numberToWin > 25 || numberToWin < 3) {
                    System.out.println("Number of tokens in a row to win must be between 3 - 25");
                }
                valid = false;
            }
            // Ask user if they want speed or efficiency
            valid = true;
            char efficiency;
            while (valid) {
                System.out.println("Would you like a Fast Game (F/f) or a Memory Efficient Game (M/m)?");
                Scanner speed = new Scanner(System.in);
                efficiency = speed.next().charAt(0);
                if (efficiency == 'F' || efficiency == 'f') {
                    playerBoard = new GameBoard(numOfRows, numOfColumns, numberToWin);
                    valid = false;
                } else if (efficiency == 'M' || efficiency == 'm') {
                    playerBoard = new GameBoardMem(numOfRows, numOfColumns, numberToWin);
                    valid = false;
                } else {
                    System.out.println("Invalid option! Choice must be (F/f) or (M/m)");
                }
            }

            boolean gameNotOver = true;
            while (gameNotOver) {

                for (int i = 0; i < numOfPlayers; i++) {

                    boolean validCol = false;
                    printBoard();
                    System.out.println("Player " + playerCharacters[i] + ", what column do you want to place your marker in?");
                    int col = askPlayerForColumn();

                    if (col < 0) {
                        System.out.println("Column cannot be less than 0");
                    } else if (col > playerBoard.getNumColumns() - 1) {
                        System.out.println("Column cannot be greater than " + (playerBoard.getNumColumns() - 1));
                    }
                    //Validates that column is empty.
                    else if (!playerBoard.checkIfFree(col)) {
                        System.out.println("Column is full");
                    } else {
                        validCol = true;
                    }

                    while (!validCol) {
                        col = askPlayerForColumn();
                        if (col < 0) {
                            System.out.println("Column cannot be less than 0");
                        } else if (col > playerBoard.getNumColumns() - 1) {
                            System.out.println("Column cannot be greater than " + (playerBoard.getNumColumns() - 1));
                        }
                        //Validates that column is empty.
                        else if (!playerBoard.checkIfFree(col)) {
                            System.out.println("Column is full");
                        } else {
                            validCol = true;
                        }
                    }

                    playerBoard.dropToken(playerCharacters[i], col);

                    if (playerBoard.checkTie()) {
                        printBoard();

                        //validates the user's choice
                        do {
                            System.out.println("Tie!");
                            System.out.println("Would you like to play again? Y/N");
                            Scanner inputChar = new Scanner(System.in);
                            playerInput = inputChar.next().charAt(0);
                        } while (playerInput != 'y' && playerInput != 'n');
                        gameNotOver = false;
                        break;
                    }

                    if (playerBoard.checkForWin(col)) {
                        printBoard();
                        winningChar = playerCharacters[i];
                        printWinner();
                        do {
                            System.out.println("Would you like to play again? Y/N");
                            Scanner inputChar = new Scanner(System.in);
                            playerInput = inputChar.next().charAt(0);
                        } while (playerInput != 'y' && playerInput != 'n');
                        gameNotOver = false;
                        break;
                    }

                }
            }
        } while (playerInput == 'y');
    }
}
