package refactoring.types.composing_methods;

/**
 * <h1>Replace Temp with Query</h1>
 * <p><strong>Problem</strong>: You place the result of an expression in a local variable for later use in your code.</p>
 * <p><strong>Solution</strong>: Move the entire expression to a separate method and return the result from it.
 * Query the method instead of using a variable.
 * Incorporate the new method in other methods, if necessary.</p>
 * <br />
 * <p><strong>Task</strong>: Replace <i>basePrice</i> variable for a method</p>
 */
public class ReplaceTempWithQuery {
    private int quantity;
    private double itemPrice;

    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }
}
