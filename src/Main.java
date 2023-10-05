import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        Game game = new Game();
        Gameframe gameframe1 = new Gameframe();

        Scanner sc = new Scanner( System.in);
        System.out.println("Welcome to tic tac toe");
        gameframe1.gameFramePrint();
        System.out.println("Skriv en vilen rad (1-3) ");
        int rad = sc.nextInt();
        System.out.println("Skriv en vilen kolumm (1-3) ");
        int kol = sc.nextInt();
        gameframe1.playerMove('X',rad, kol);
        gameframe1.gameFramePrint();












    }
}