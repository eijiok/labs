package refactoring.types.composing_methods;

/**
 * <h1>Inline Method</h1>
 * <p><strong>Problem</strong>: When a method body is more obvious than the method itself, use this technique.</p>
 * <p><strong>Solution</strong>: Replace calls to the method with the method’s content and delete the method itself.</p>
 * <br />
 * <p><strong>Task</strong>: inline <i>moreThanFiveLateDeliveries()</p>
 **/
public class InlineMethod {
    private int numberOfLateDeliveries;

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
