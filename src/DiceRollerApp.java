
/**
 *
 * @author Jason
 */
import java.util.Scanner;

public class DiceRollerApp {

    public static void main(String[] args) {

        PairOfDice dice = new PairOfDice();
        int count = 0;
        Scanner sc = new Scanner(System.in);

        String input;

        System.out.println("Welcome to the LIT Roller application\n");
        System.out.println("Roll the dice? (y/n)");
        input = sc.next();

        while (input.equalsIgnoreCase("y")) {
            count++;

            System.out.println("Roll " + count + ":");
            dice.roll();
            System.out.println(dice.getValue1());
            System.out.println(dice.getValue2());

            if (dice.sum() == 7) {
                System.out.println("Craps!");
            } else if (dice.sum() == 12) {
                System.out.println("Box cars!");
            } else if (dice.sum() == 2) {
                System.out.println("Snake eyes!");
            }

            System.out.println("\n");

            System.out.println("Roll the dice? (y/n)");

            input = sc.next();

        }
    }

}
