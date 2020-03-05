package refactoring.types.composing_methods;

/**
 * <h1>Inline Temp</h1>
 * <p><strong>Problem</strong>: You have a temporary variable that’s assigned the result of a simple expression and nothing more.</p>
 * <p><strong>Solution</strong>: Replace the references to the variable with the expression itself.</p>
 * <br />
 * <p><strong>Task</strong>: Inline <i>basePrice</i> temp variable</p>
 */
public class InlineTemp {
    boolean hasDiscount(Order order) {
        double basePrice = order.basePrice();
        return basePrice > 1000;
    }

    private class Order {
        public double basePrice() {
            return 0;
        }
    }
}
