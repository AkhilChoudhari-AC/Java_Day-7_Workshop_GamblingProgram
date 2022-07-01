package Day7WorkshopProgram;

import java.util.Random;

public class GamblingSimulator {
    public static int TotalStake = 100;
    public static int bit = 1;
    public static int Win = 0;
    public static int Loose = 0;
    public static int Month = 0;
    public static void main(String[] args) {
        for (Month = 1; Month <= 12; Month++){
            Win = 0;
            Loose = 0;
            int amount = 0;

      for ( int day = 0; day < 30; day++) {
          int stake = 100;

          while (stake > (0.5 * TotalStake) && stake < (1.5 * TotalStake)) {
              int bet = (int) (Math.floor(Math.random() * 10) % 2);
              if (bet == 1) {
                  stake++;
              } else if (bet == 0) {
                  stake--;
              }
          }
          if (stake > TotalStake) {
              Win++;
              amount = amount + 50;
          } else if (stake < TotalStake) {
              Loose++;
              amount = amount - 50;
          }
      }
      if (Win > Loose){
          System.out.println("Month " + Month + ", WON:" + Win + " times," + " LOSE:" + Loose + " times" + ", the total amount won is $" + amount);
          float percent = (((Win - Loose) / 30) * 100);
          System.out.println("Won by " + percent + "%");
      } else if (Loose > Win) {
          System.out.println("Month " + Month + ", WON:" + Win + " times," + " LOSE:" + Loose + " times" + ", the total amount lose is $" + amount);
          float percent = (((Loose - Win) / 30) * 100);
          System.out.println("Lose by " + percent + "%");
      } else
          System.out.println("Month " + Month + ", WON:" + Win + " times," + " LOSE:" + Loose + " times" + ", Neither Won nor Lose");
        }
    }
}
