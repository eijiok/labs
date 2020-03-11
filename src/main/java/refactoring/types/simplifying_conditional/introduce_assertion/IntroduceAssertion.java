package refactoring.types.simplifying_conditional.introduce_assertion;

/**
 * <h1></h1>
 * <p><strong>Problem</strong>: </p>
 * <p><strong>Solution</strong>: </p>
 * <br />
 * <p><strong>Task</strong>: </p>
 */
public class IntroduceAssertion {
    private static final double NULL_EXPENSE = 0.0;
    private double expenseLimit;
    private PrimaryProject primaryProject;

    double getExpenseLimit() {
        // Should have either expense limit or
        // a primary project.
        return (expenseLimit != NULL_EXPENSE) ?
                expenseLimit :
                primaryProject.getMemberExpenseLimit();
    }
}
