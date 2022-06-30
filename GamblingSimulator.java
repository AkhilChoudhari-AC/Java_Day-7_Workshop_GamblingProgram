package Day7WorkshopProgram;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String[] args) {
       // Every day stakes = 100$
        int Stake = 100;
       // Every game bet = 1$
        int bet = 1;
        Random rand = new Random();
        bet = rand.nextInt(2);
        System.out.println(bet);
    if (bet == 1){
        System.out.println("Game Win , Gambler makes 1$");
    }
    else {
        System.out.println("Game Losses ,Gambler losses 1$");
        }
    }
}
