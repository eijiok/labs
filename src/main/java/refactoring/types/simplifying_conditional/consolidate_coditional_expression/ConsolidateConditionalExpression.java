package refactoring.types.simplifying_conditional.consolidate_coditional_expression;

/**
 * <h1></h1>
 * <p><strong>Problem</strong>: </p>
 * <p><strong>Solution</strong>: </p>
 * <br />
 * <p><strong>Task</strong>: extract isNotEligableForDisability</p>
 */
public class ConsolidateConditionalExpression {
    private int seniority;
    private double monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }

        return calculateDisabilitAmount();
    }

    private double calculateDisabilitAmount() {
        return 42.0;
    }
}
