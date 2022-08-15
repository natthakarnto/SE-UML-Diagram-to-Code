import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayer = 0;
        while (true){
            System.out.printf("Input the number of players [2-8]: ");
            numPlayer = input.nextInt();

            if(numPlayer >= 2 && numPlayer <= 8){
                break;
            }
        }
        MGame mGame = new MGame(numPlayer,10,30,2);
        mGame.playGame();
    }
}
