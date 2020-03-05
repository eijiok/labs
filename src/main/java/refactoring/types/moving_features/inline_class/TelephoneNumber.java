package refactoring.types.moving_features.inline_class;

class TelephoneNumber {
    private String officeAreaCode;
    private String officeNumber;
    public String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
