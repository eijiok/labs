package refactoring.types.moving_features.extract_class;

public class Person {

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
        Person extractClass = new Person();
        extractClass.setOfficeAreaCode("11");
        extractClass.setOfficeNumber("1234-1234");
        extractClass.getTelephoneNumber();
    }

}
