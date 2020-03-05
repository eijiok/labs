package refactoring.codesmells.dispensables.comments;

import java.util.Random;

/**
 * Comentários são usados como desodorante (escondem um cheiro ruim)
 *
 * Comments are usually created with the best of intentions,
 * when the author realizes that his or her code isn’t intuitive or obvious.
 *
 * In such cases, comments are like a deodorant masking the smell of fishy code that could be improved.
 *
 * The best comment is a good name for a method or class.
 *
 * Como Refatorar:
 * - Extraia os métodos em blocos com comentário
 * - Renomeie métodos que não estão claros
 * - Use asserção para comentários de regras
 *
 * Ignore when:
 * - When explaining WHY something is being implemented in a particular way.
 * - When explaining COMPLEX ALGORITHMS (when all other methods for simplifying the algorithm have been tried and come up short).
 */
public class Comments {

    private static final int NULL_EXPENSE = -1;
    private Random random = new Random();;

    /**
     * If a comment is intended to explain a complex expression,
     * the expression should be split into understandable subexpressions using Extract Variable.
     */
    void renderBanner(String platform, String browser, long resize) {
        // se é MacOS, é IE, foi inicializado e foi redimensionado
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }
    private boolean wasInitialized() {
        return random.nextBoolean();
    }

    /**
     * If a comment explains a section of code,
     * this section can be turned into a separate method via Extract Method.
     * The name of the new method can be taken from the comment text itself, most likely.
     *
     * @param name
     */
    void printOwing(String name) {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private String getOutstanding() {
        return "Outstanding";
    }

    private void printBanner() {
    }

    /**
     * This method does renameName
     *
     * If a method has already been extracted,
     * but comments are still necessary to explain what the method does,
     * give the method a self-explanatory name. Use Rename Method for this.
     *
     */
    private void rnmNm() {

    }


    /**
     *
     * If you need to assert rules about a state that’s necessary for the system to work, use Introduce Assertion.
     *
     * Drawbacks
     * When is an exception better than a simple assertion?
     * If the exception can be caused by actions of the user or system and you can handle the exception.
     * On the other hand, ordinary unnamed and unhandled exceptions are basically equivalent to simple assertions
     * – you don’t handle them and they’re caused exclusively as the result of a program bug that never should have occurred.
     */
    double getExpenseLimit(double expenseLimit, PrimaryProject primaryProject) {
        // Should have either expense limit or
        // a primary project.
        return (expenseLimit != NULL_EXPENSE) ?
                expenseLimit :
                primaryProject.getMemberExpenseLimit();
    }

    private class PrimaryProject {
        public double getMemberExpenseLimit() {
            return 0;
        }
    }
}
