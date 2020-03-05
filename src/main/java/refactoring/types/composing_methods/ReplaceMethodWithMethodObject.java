package refactoring.types.composing_methods;

/**
 * <h1>Replace Method with Method Object</h1>
 * <p><strong>Problem</strong>: You have a long method in which the local variables are so intertwined that you can’t apply Extract Method.</p>
 * <p><strong>Solution</strong>: Transform the method into a separate class so that the local variables become fields of the class. Then you can split the method into several methods within the same class.</p>
 * <br />
 * <p><strong>Task</strong>: Delegate to <i>PriceCalculator</i> the calculation of price</p>
 */
public class ReplaceMethodWithMethodObject {
    double primaryBasePrice;
    double secondaryBasePrice;
    double tertiaryBasePrice;


    public double price() {
        // Perform long computation.
        return primaryBasePrice * secondaryBasePrice + tertiaryBasePrice;
    }

}
