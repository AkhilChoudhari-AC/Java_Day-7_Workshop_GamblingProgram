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
        for(int i = 100; i<=150; i++){
            System.out.println(i);
        }
       System.out.println("Gambler win 50 percent stakes that is 150\n Resign the game for the day ");
    }
    else {
       System.out.println("Game Losses ,Gambler losses 1$");
       for (int i = 100; i >= 50; i--) {
           System.out.println(i);
       }
       System.out.println("Gambler Losses 50 percent stakes that is 50\n Resign the game for the day ");
   }
    }
}
