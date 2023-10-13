import java.util.Arrays;

public class GameFrame {
    protected char[][] borderOfGame = new char[3][3];
    protected Player player1;
    protected Player player2;


    public GameFrame(Player player1, Player player2) { // fyll varje rad av bräddan med tecknet -
        for (char[] chars : borderOfGame) {
            Arrays.fill(chars, '-');
        }
        this.player1 = player1;
        this.player2 = player2;


    }


    public void firstRow(char[] row) { // denna metode har jag använd array i argument för att passera vilken platser i spel bräddan
        System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
    }

    public void seperat() { // den är vilje som separerar varje rad i spelet
        System.out.println("-----------");
    }

    public void gameFramePrint() { // denna metod  skriver ut spel bräddan ut
        for (int i = 0; i < borderOfGame.length; i++) {
            firstRow(borderOfGame[i]);

            if (i != borderOfGame.length - 1) {
                seperat();
            }


        }

    }

    public void resetGameFrame() {
        for (char[] chars : borderOfGame) {
            Arrays.fill(chars, '-');
        }
    }

    public int playerMove(char player, int row, int col) {
        if (borderOfGame[row][col] == '-') { // om det finns en tom ruta som sinpolisras av - då kan spelare göra sin drag
            borderOfGame[row][col] = player;


        } else {// annars ska det skrivas ut en medellade som säger att det är upptaget
            System.out.println("this place is already taken.\uD83D\uDE05 you kan try again");
            borderOfGame[row][col] = player;

        }

        return 1;

    }

    public boolean rowCheck(char player) {
        for (int i = 0; i < 3; i++) {
            if (borderOfGame[i][0] == player && borderOfGame[i][1] == player && borderOfGame[i][2] == player) {
                System.out.println("Winner!!! Player: " + player);

                return true;
            }


        }
        return false;

    }

    public boolean colCheck(char player) {
        for (int i = 0; i < 3; i++) {
            if (borderOfGame[0][i] == player && borderOfGame[1][i] == player && borderOfGame[2][i] == player) {
                System.out.println("Winner!!! Player: " + player);

                return true;
            }


        }
        return false;
    }

    public boolean diagonalCheck(char player) {
        for (int i = 0; i < 3; i++) {
            if (borderOfGame[0][0] == player && borderOfGame[1][1] == player && borderOfGame[2][2] == player) {
                System.out.println("Winner!!! Player: " + player);

                return true;
            }
            if (borderOfGame[0][2] == player && borderOfGame[1][1] == player && borderOfGame[2][0] == player) {
                System.out.println("Winner!!! Player: " + player);

                return true;
            }


        }
        return false;

    }

    public boolean drawGame(char player) {
        if (!theWinnerOfTheGame('X') && !theWinnerOfTheGame('O')) {
            for (char[] chars : borderOfGame) {
                for (char aChar : chars) {
                    if (aChar == '-') { // går igenom rader och kollum på bräddan och kollar om det finns leidga rutor om jag return false
                        return false;
                    }

                }
            }


            System.out.println("DRAWW!!!"); // annars return true alltså alla rutor är upptagna och det finns inga vinnare.
            return true;
        }
        return false; // om det finns en vinnare hoppa över allt och return false
    }

    public boolean theWinnerOfTheGame(char player) {
        return rowCheck(player) || colCheck(player) || diagonalCheck(player);

    }

}
