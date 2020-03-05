package refactoring.types.moving_features.hide_delegate;

class Person {
    Department department;
    final String name;

    public Person(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
