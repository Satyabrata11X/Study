import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        boolean playerXTurn = true;

        Scanner scanner = new Scanner(System.in);

        while (!isGameOver(board)) {
            System.out.println("Player " + (playerXTurn ? "X" : "O") + "'s turn:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(board, row, col)) {
                makeMove(board, row, col, playerXTurn ? 'X' : 'O');
                printBoard(board);

                if (isWinner(board, playerXTurn ? 'X' : 'O')) {
                    System.out.println("Player " + (playerXTurn ? "X" : "O") + " wins!");
                    break;
                }

                playerXTurn = !playerXTurn;
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        if (!isGameOver(board)) {
            System.out.println("It's a tie!");
        }
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    private static void makeMove(char[][] board, int row, int col, char player) {
        board[row][col] = player;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isGameOver(char[][] board) {
        return isWinner(board, 'X') || isWinner(board, 'O') || isBoardFull(board);
    }

    private static boolean isWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
