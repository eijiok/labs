package refactoring.types.dealing_with_generalization.form_template_method;

/**
 * <h1></h1>
 * <p><strong>Problem</strong>: Your subclasses implement algorithms that contain similar steps in the same order.</p>
 * <p><strong>Solution</strong>: Move the algorithm structure and identical steps to a superclass,
 *      and leave implementation of the different steps in the subclasses.</p>
 * <br />
 * <p><strong>Task</strong>: </p>
 */
public abstract class Site {
    protected double taxRate;

    public double getBillableAmount() {
        return getBase() * getTax(getBase());
    }

    protected abstract double getTax(double base);

    protected abstract double getBase();
}
