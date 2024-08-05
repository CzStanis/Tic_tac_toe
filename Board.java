public class Board {
    static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                         {'-', '+', '-', '+', '-'},
                         {' ', '|', ' ', '|', ' '},
                         {'-', '+', '-', '+', '-'},
                         {' ', '|', ' ', '|', ' '}};
    public static boolean fillBoard(int position, int ruch) {
        char tictactoe = ' ';
            if(ruch%2==0){
                tictactoe='x';
            } else {
                tictactoe='o';
            }
            if (position == 1) {
                if(Character.isWhitespace(gameBoard[0][0])) {
                    gameBoard[0][0] = tictactoe;
                    Main.ruchy--;
                }

                displayBoard(gameBoard);
            }
            if (position == 2) {
                if(Character.isWhitespace(gameBoard[0][2])) {
                    gameBoard[0][2] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 3) {
                if(Character.isWhitespace(gameBoard[0][4])) {
                    gameBoard[0][4] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 4) {
                if(Character.isWhitespace(gameBoard[2][0])) {
                    gameBoard[2][0] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 5) {
                if(Character.isWhitespace(gameBoard[2][2])) {
                    gameBoard[2][2] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 6) {
                if(Character.isWhitespace(gameBoard[2][4])) {
                    gameBoard[2][4] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 7) {
                if(Character.isWhitespace(gameBoard[4][0])){
                gameBoard[4][0]=tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 8) {
                if(Character.isWhitespace(gameBoard[4][2])) {
                    gameBoard[4][2] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if (position == 9) {
                if(Character.isWhitespace(gameBoard[4][4])) {
                    gameBoard[4][4] = tictactoe;
                    Main.ruchy--;
                }
                displayBoard(gameBoard);
            }
            if(Main.ruchy<5) {
                boolean win = Main.winCheck(gameBoard);
                if(win){
                    System.out.println("Wygrałeś");
                    return true;
                } else if(!win && ruch==0) {
                    System.out.println("Remis");
                }

            } return false;

        }

    public static void displayBoard(char[][] board) {

        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
