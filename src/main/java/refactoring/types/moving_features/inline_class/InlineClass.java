package refactoring.types.moving_features.inline_class;

/**
 * <h1></h1>
 * <p><strong>Problem</strong>: A class does almost nothing and isn’t responsible for anything, and no additional responsibilities are planned for it.</p>
 * <p><strong>Solution</strong>: Move all features from the class to another one.</p>
 * <br />
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Inline%20Class%20-%20Before.png"/>
 * <br />
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Inline%20Class%20-%20After.png"/>
 * <p><strong>Task</strong>: </p>
 */
public class InlineClass {
    public static void main(String[] args) {
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setOfficeAreaCode("11");
        telephoneNumber.setOfficeNumber("1234-6789");

        Person eiji = new Person(telephoneNumber);
        System.out.println(eiji.getTelephoneNumber());
    }

}
