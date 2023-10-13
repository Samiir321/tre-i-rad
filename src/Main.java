import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        GameFrame gameframe1 = new GameFrame(player1, player2);

        Scanner sc = new Scanner(System.in);

        int rad;
        int kol;
        String Again = "Yes";
        boolean stopTheGame = true;
        while (Again.equalsIgnoreCase("yes")) {
            gameframe1.resetGameFrame();
            while (true) {

                System.out.println("Welcome to tic tac toe");
                gameframe1.gameFramePrint();
                System.out.println("Write a which line (0-2 / ) player " + player1.getPlayersName());
                rad = sc.nextInt();
                sc.nextLine();
                System.out.println("Write a which column (0-2 ) player " + player1.getPlayersName());
                kol = sc.nextInt();
                sc.nextLine();
                gameframe1.playerMove('X', rad, kol);

                gameframe1.gameFramePrint();
                if (gameframe1.theWinnerOfTheGame('X') || gameframe1.drawGame('X')) { // om spelare har fått tre i rad ska
                    stopTheGame = false;

                    break;

                }

                System.out.println("Write a which line (0-2 ) player " + player2.getPlayersName());
                rad = sc.nextInt();
                sc.nextLine();
                System.out.println("Write a which column (0-2 ) player " + player2.getPlayersName());
                kol = sc.nextInt();
                sc.nextLine();
                gameframe1.playerMove('O', rad, kol);
                gameframe1.gameFramePrint();
                if (gameframe1.theWinnerOfTheGame('O') || gameframe1.drawGame('O')) {
                    stopTheGame = false;
                    break;
                }


            }
            stopTheGame = true;
            System.out.println("You Want To Play Again ( Yes or no )");
            Again = sc.nextLine();


        }

    }
}