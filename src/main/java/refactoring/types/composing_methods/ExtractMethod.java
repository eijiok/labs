package refactoring.types.composing_methods;

/**
 * <h1>Extract Method</h1>
 * <p><strong>Problem</strong>: You have a code fragment that can be grouped together.</p>
 * <p><strong>Solution</strong>Move this code to a separate new method (or function) and replace the old code with a call to the method.</p>
 * <br />
 * <p><strong>Task</strong>: Remove comment <i>print details</i> extracting <i>printDetails</i> method</p>
 */
public class ExtractMethod {
    private String name;

    void printOwing() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private String getOutstanding() {
        return null;
    }

    private void printBanner() {

    }
}
