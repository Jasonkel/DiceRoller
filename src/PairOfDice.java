
/**
 *
 * @author Jason
 */
public class PairOfDice {

    private Die die1;
    private Die die2;
    private int sum;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public void PairofDice(int sides) {
        die1.Die(sides);
        die2.Die(sides);
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int getValue1() {
        return die1.getValue();
    }

    public int getValue2() {
        return die2.getValue();
    }

    public int sum() {
        this.sum = this.getValue1() + this.getValue2();
        return sum;
    }
}
