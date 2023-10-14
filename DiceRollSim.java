package DiceRollSim;

/**
 * DiceRollSim
 */
import java.util.Scanner;
import java.util.Random;

public class DiceRollSim {

    public static void main(String[] args) {
        int numDice;
        int numSides;
        int total = 0;
        int i;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Please enter the number of dice.");
        numDice = Integer.parseInt(in.nextLine());

        System.out.println("Please enter the number of sides.");
        numSides = Integer.parseInt(in.nextLine());

        for (i = 0; i < numDice; i++) {
            total = total + rand.nextInt(1, numSides);
        }

        System.out.println("Total = " + total);
    }
}
