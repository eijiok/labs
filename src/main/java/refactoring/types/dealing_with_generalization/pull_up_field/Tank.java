package refactoring.types.dealing_with_generalization.pull_up_field;

public class Tank extends Unit {
    private int tankHealth;

    public int getHealth() {
        return tankHealth;
    }
}
