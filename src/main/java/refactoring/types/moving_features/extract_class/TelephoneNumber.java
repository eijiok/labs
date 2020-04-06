package refactoring.types.moving_features.extract_class;

public class TelephoneNumber {
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return getOfficeAreaCode() + "-" + getOfficeNumber();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}
