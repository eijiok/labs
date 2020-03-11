package refactoring.types.dealing_with_generalization.pull_up_method;

public class Tank extends Unit{
    public double health;

    public String getStatus() {
        return "Health: "  + health;
    }
}
