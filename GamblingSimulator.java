package Day7WorkshopProgram;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String[] args) {
       // Every day stakes = 100$
        int TotalStake = 100;
       // Every game bet = 1$

      int stake = 100;
        while (stake > (0.5 * TotalStake) && stake < (1.5 * TotalStake)) {
            int bet = (int) (Math.floor(Math.random() * 10) % 2);
            if (bet == 1) {
                System.out.println("Won $1");
                System.out.println("Initial Stake is $" + stake + ", won $1 and total is $"+(stake + bet));
                stake++;
            } else if (bet == 0) {
                System.out.println("Loss $1");
                System.out.println("Initial Stake is $" + stake + ", lost $1 and total is $"+(stake - bet));
                stake--;
            }
        }
}}
