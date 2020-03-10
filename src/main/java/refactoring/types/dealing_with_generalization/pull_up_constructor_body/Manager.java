package refactoring.types.dealing_with_generalization.pull_up_constructor_body;

/**
 * <h1></h1>
 * <p><strong>Problem</strong>: Your subclasses have constructors with code that’s mostly identical.</p>
 * <p><strong>Solution</strong>: Create a superclass constructor and move the code that’s the same in the subclasses to it.
 *          Call the superclass constructor in the subclass constructors.</p>
 * <br />
 * <p><strong>Task</strong>: extract constructor with name and id</p>
 */
public class Manager extends Employee {
    public Manager(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}
