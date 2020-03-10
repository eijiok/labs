package refactoring.types.organizing_data.self_encapsulate_field;

/**
 * <h1>Self Encapsulate Field</h1>
 * <p><strong>Problem</strong>: You use direct access to private fields inside a class.</p>
 * <p><strong>Solution</strong>: Create a getter and setter for the field, and use only them for accessing the field.</p>
 * <br />
 * <p><strong>Task</strong>: Encapsulate fields low and high. Use them to access the field</p>
 */
public class Range {
    private int low, high;

    boolean includes(int arg) {
        return arg >= low && arg <= high;

    }
}
