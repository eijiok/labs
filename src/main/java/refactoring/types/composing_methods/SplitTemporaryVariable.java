package refactoring.types.composing_methods;

/**
 * <h1>Split Temporary Variable</h1>
 * <p><strong>Problem</strong>: You have a local variable that’s used to store various intermediate values inside a method (except for cycle variables).</p>
 * <p><strong>Solution</strong>: Use different variables for different values. Each variable should be responsible for only one particular thing.</p>
 * <br />
 * <p><strong>Task</strong>: split temporary variable <i>temp</i> for the variables in comments</p>
 */
public class SplitTemporaryVariable {
    private double height;
    private double width;

    public void test() {
        double temp = 2 * (height + width);
        System.out.println("Perimeter:" + temp);
        temp = height * width;
        System.out.println("Area:" + temp);
    }
}
