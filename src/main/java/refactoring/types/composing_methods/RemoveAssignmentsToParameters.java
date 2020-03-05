package refactoring.types.composing_methods;

/**
 * <h1>Remove Assignments to Parameters</h1>
 * <p><strong>Problem</strong>: Some value is assigned to a parameter inside method’s body.</p>
 * <p><strong>Solution</strong>: Use a local variable instead of a parameter.</p>
 * <br />
 * <p><strong>Task</strong>: Use a local variable instead of a parameter</p>
 */
public class RemoveAssignmentsToParameters {
    int discount(int inputVal, int quantity) {
        if (inputVal > 50) {
            inputVal -= 2;
        }
        return inputVal * quantity;
    }
}
