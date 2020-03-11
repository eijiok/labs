package refactoring.types.organizing_data.encapsulate_collection;

import java.util.HashSet;

public class EncapsulteCollection {
    public static void main(String[] args) {
        Person person = new Person();
        person.setCourses(new HashSet<>());
        person.getCourses().add(new Course());
    }
}
