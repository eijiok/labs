package refactoring.types.composing_methods;

/**
 * <h1>Substitute Algorithm</h1>
 * <p><strong>Problem</strong>: So you want to replace an existing algorithm with a new one?</p>
 * <p><strong>Solution</strong>: Replace the body of the method that implements the algorithm with a new algorithm.</p>
 * <br />
 * <p><strong>Task</strong>: substitute the verification of ifs by list verification</p>
 */
public class SubstituteAlgorithm {
    String foundPerson(String[] people){
        /**
         * return a person if he is Don, John or Kent
         * tip: use list.contains()
         *
         */
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "";
    }
}
