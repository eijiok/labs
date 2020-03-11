package refactoring.types.dealing_with_generalization.pull_up_field;

/**
 * <h1>Pull Up Field</h1>
 * <p><strong>Problem</strong>: Two classes have the same field.</p>
 * <p><strong>Solution</strong>: Remove the field from subclasses and move it to the superclass.</p>
 * <br />
 * <p><strong>Task</strong>: </p>
 */
public class PullUpField {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        Tank tank = new Tank();

        System.out.println(soldier.getHealth());
        System.out.println(tank.getHealth());
    }
}
