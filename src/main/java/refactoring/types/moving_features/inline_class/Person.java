package refactoring.types.moving_features.inline_class;

class Person {
    private TelephoneNumber telephoneNumber;
    private String name;

    public Person(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}
