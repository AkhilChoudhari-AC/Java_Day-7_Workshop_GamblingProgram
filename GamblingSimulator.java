package Day7WorkshopProgram;

import java.util.Random;

public class GamblingSimulator {
    public static int TotalStake = 100;
    public static int bit = 1;
    public static int Won = 0;
    public static int Loose = 0;
    public static void main(String[] args) {
       double amount = 0;
       int day;
      for (day = 0; day < 20; day++) {
          int stake = 100;

          while (stake > (0.5 * TotalStake) && stake < (1.5 * TotalStake)) {
              int bet = (int) (Math.floor(Math.random() * 10) % 2);
              if (bet == 1) {
                  Won++;
                  stake++;
              } else if (bet == 0) {
                  Loose++;
                  stake--;
              }
          }
          if (stake > TotalStake) {
              Won++;
              amount = amount + 50;
          } else if (stake < TotalStake) {
              Loose++;
              amount = amount - 50;
          }
      }
      if (Won > Loose){
          System.out.println("After Day " + day + ", the total amount won is $" + amount);
      } else if (Loose > Won) {
          System.out.println("After Day " + day + ", the total amount lose is $" + amount);
      } else System.out.println("Neither Won nor Lose");
    }
}
