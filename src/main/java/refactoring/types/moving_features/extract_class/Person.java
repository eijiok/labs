package refactoring.types.moving_features.extract_class;

public class Person {

    private String name;

    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    public void setOfficeNumber(String officeNumber) {
        telephoneNumber.setOfficeNumber(officeNumber);
    }

    public static void main(String[] args) {
        Person extractClass = new Person();
        extractClass.setOfficeAreaCode("11");
        extractClass.setOfficeNumber("1234-1234");
        extractClass.getTelephoneNumber();
    }

}
