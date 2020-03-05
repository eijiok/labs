package refactoring.types.moving_features.extract_class;

/**
 * <h1>Extract Class</h1>
 * <p><strong>Problem</strong>: When one class does the work of two, awkwardness results.</p>
 * <p><strong>Solution</strong>: Instead, create a new class and place the fields and methods responsible for the relevant functionality in it.</p>
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Extract%20Class%20-%20Before.png">
 * <br />
 * <p>-></p>
 * <img src="https://refactoring.guru/images/refactoring/diagrams/Extract%20Class%20-%20After.png">
 * <br />
 * <p><strong>Task</strong>: Create a class TelephoneNumber and delegate <i>getTelephoneNumber()</i> to it</p>
 */
public class ExtractClass {

    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return officeAreaCode + "-" + officeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }


    public static void main(String[] args) {
        ExtractClass extractClass = new ExtractClass();
        extractClass.setOfficeAreaCode("11");
        extractClass.setOfficeNumber("1234-1234");
        extractClass.getTelephoneNumber();
    }

}
