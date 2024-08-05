import java.util.Scanner;

public class Main {
    public static int ruchy = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board.displayBoard(gameBoard);
        boolean win = false;

        while (!win && ruchy>0) {
            System.out.println("Wybierz wiersz od 1 do 3");
            int wiersz = scanner.nextInt();
            if(wiersz<1 || wiersz>3)
                continue;
            System.out.println("Wybierz kolumnę od 1 do 3");
            int kolumna = scanner.nextInt();
            while(kolumna<1 || kolumna>3) {
                System.out.println("Wybierz kolumnę od 1 do 3");
                kolumna = scanner.nextInt();
            }
            int pozycja = Position.position(wiersz,kolumna);
            win = Board.fillBoard(pozycja, ruchy);
        }

    }
        static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        public static boolean winCheck(char[][] gameBoard) {
            if(!Character.isWhitespace(gameBoard[0][0]) && gameBoard[0][0]==gameBoard[0][2]
                    && gameBoard[0][4]==gameBoard[0][2]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[2][0]) && gameBoard[2][0]==gameBoard[2][2]
                    && gameBoard[2][4]==gameBoard[2][2]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[4][0]) && gameBoard[4][0]==gameBoard[4][2]
                    && gameBoard[4][4]==gameBoard[4][2]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[0][0]) && gameBoard[0][0]==gameBoard[2][0]
                    && gameBoard[4][0]==gameBoard[2][0]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[0][2]) && gameBoard[0][2]==gameBoard[2][2]
                    && gameBoard[4][2]==gameBoard[2][2]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[0][4]) && gameBoard[0][4]==gameBoard[2][4]
                    && gameBoard[4][4]==gameBoard[2][4]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[0][0]) && gameBoard[0][0]==gameBoard[2][2]
                    && gameBoard[4][4]==gameBoard[2][2]) {
                return true;
            }
            if(!Character.isWhitespace(gameBoard[0][4]) && gameBoard[0][4]==gameBoard[2][2]
                    && gameBoard[4][0]==gameBoard[2][2]) {
                return true;
            }

            return false;
        }

}
