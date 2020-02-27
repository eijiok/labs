package refactoring.example.refactoring.extract_class;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }

}
