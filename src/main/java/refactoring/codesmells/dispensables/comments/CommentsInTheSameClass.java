package refactoring.codesmells.dispensables.comments;

public class CommentsInTheSameClass {
    private String name;

    void printOwing() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    void printHistorical() {
        printPaid();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private void printPaid() {

    }


    private String getOutstanding() {
        return "123.12";
    }

    private void printBanner() {
        System.out.println("banner");
    }
}
