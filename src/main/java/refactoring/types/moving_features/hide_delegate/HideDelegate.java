package refactoring.types.moving_features.hide_delegate;

/**
 * <h1>Hide Delegate</h1>
 * <p><strong>Problem</strong>: The client gets object B from a field or method of object А. Then the client calls a method of object B.</p>
 * <p><strong>Solution</strong>: Create a new method in class A that delegates the call to object B. Now the client doesn’t know about, or depend on, class B.</p>
 * <br />
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Hide%20Delegate%20-%20Before.png" />
 * <br />
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Hide%20Delegate%20-%20After.png" />
 * <br />
 * <p>Oposite of Remove the middle man</p>
 * <p><strong>Task</strong>: call staf.getManager() directly instead of staf.getDepartment().getManager() </p>
 */
public class HideDelegate {

    public static void main(String[] args) {
        Person manager = new Person("José");
        Person staf = new Person("João");
        Department department = new Department();
        department.manager = manager;
        staf.department = department;

        System.out.println("O gerente da minha área é: " + staf.getDepartment().getManager().getName());
    }

}
