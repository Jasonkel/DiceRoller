
/**
 *
 * @author Jason
 */
public class Die {

    private int sides;
    private int value;

    public Die() {
        sides = 6;

    }

    public void Die(int sides) {
        this.sides = 6;

    }

    public void roll() {
        value = 1 + (int) (Math.random() * sides);
    }

    public int getValue() {
        return value;
    }
}
