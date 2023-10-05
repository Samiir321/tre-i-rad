public class Gameframe {
     protected char [][] borderOfGame = new char[3][3];
    protected boolean isPlayerTurn;



    public void firstRow(char [] row) {
        System.out.println(row[0]  +"|" +  row[1] + "|" + row[2]);
    }
    public void seperat(){
        System.out.println("-----------");
    }

    public void gameFramePrint(){
        for (int i = 0; i < borderOfGame.length; i++){
            firstRow(borderOfGame[i]);

            if (i !=  borderOfGame.length - 1){
                seperat();
            }


        }

    }

    public void playerMove (char player , int row , int col){
        if (borderOfGame[row][col] == '-'){
            borderOfGame[row][col] = player;

        }else {
            System.out.println("this place is already taken.\uD83D\uDE05");
        }

    }
    ///public Player TheCurrentPLayer (){
       // if (isPlayerOneTurn){

       // }

   // }


}
