package refactoring.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void notNullTest() {
        Customer customer = new Customer("Eiji");
        assertNotNull(customer);
    }

    @Test
    void basicTest() {
        Customer customer = new Customer("Eiji");
        assertEquals("Rental Record for Eiji\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", customer.statement());
    }

    private void executeTest(TestBuilder testBuilder) {
        Customer customer = testBuilder.getCustomer();

        assertEquals(testBuilder.resultFirstLine() +
                testBuilder.resultFilmsPrice() +
                testBuilder.resultAmountOwed() +
                testBuilder.resultPointsEarned(), customer.statement());
    }

    @Test
    void regularTest1() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 1, "2.0");
        testBuilder.setTotal("2.0");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }


    @Test
    void regularTest2() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 2, "2.0");
        testBuilder.setTotal("2.0");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }
    @Test
    void regularTest3() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 3, "3.5");
        testBuilder.setTotal("3.5");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }


    @Test
    void regularTest1Day2Movies() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 1, "2.0");
        testBuilder.addFilm("Matrix", Movie.REGULAR, 1, "2.0");
        testBuilder.setTotal("4.0");
        testBuilder.setPointsEarned("2");

        executeTest(testBuilder);
    }

    @Test
    void newReleaseTest1() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Parasite", Movie.NEW_RELEASE, 1, "3.0");
        testBuilder.setTotal("3.0");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }
    @Test
    void newReleaseTest2() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Parasite", Movie.NEW_RELEASE, 2, "6.0");
        testBuilder.setTotal("6.0");
        testBuilder.setPointsEarned("2");

        executeTest(testBuilder);
    }

    @Test
    void newReleaseTest3() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Parasite", Movie.NEW_RELEASE, 3, "9.0");
        testBuilder.setTotal("9.0");
        testBuilder.setPointsEarned("2");

        executeTest(testBuilder);
    }


    @Test
    void childrensTest1() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 1, "1.5");
        testBuilder.setTotal("1.5");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }
    @Test
    void childrensTest2() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 2, "1.5");
        testBuilder.setTotal("1.5");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }

    @Test
    void childrensTest3() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 3, "1.5");
        testBuilder.setTotal("1.5");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }

    @Test
    void childrensTest4() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 4, "3.0");
        testBuilder.setTotal("3.0");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }

    @Test
    void childrensTest5() {
        TestBuilder testBuilder = new TestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 5, "4.5");
        testBuilder.setTotal("4.5");
        testBuilder.setPointsEarned("1");

        executeTest(testBuilder);
    }

    private void executeTestHtml(HTMLTestBuilder testBuilder) {
        Customer customer = testBuilder.getCustomer();

        assertEquals(testBuilder.resultFirstLine() +
                testBuilder.resultFilmsPrice() +
                testBuilder.resultAmountOwed() +
                testBuilder.resultPointsEarned(), customer.htmlStatement());
    }

    @Test
    void htmlRegularTest1() {
        HTMLTestBuilder testBuilder = new HTMLTestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 1, "2.0");
        testBuilder.setTotal("2.0");
        testBuilder.setPointsEarned("1");

        executeTestHtml(testBuilder);
    }


    @Test
    void htmlRegularTest1Day2Movies() {
        HTMLTestBuilder testBuilder = new HTMLTestBuilder("Eiji");
        testBuilder.addFilm("Back to the Future", Movie.REGULAR, 1, "2.0");
        testBuilder.addFilm("Matrix", Movie.REGULAR, 1, "2.0");
        testBuilder.setTotal("4.0");
        testBuilder.setPointsEarned("2");

        executeTestHtml(testBuilder);
    }


    @Test
    void htmlchildrensTest5() {
        HTMLTestBuilder testBuilder = new HTMLTestBuilder("Eiji");
        testBuilder.addFilm("Toy Story", Movie.CHILDRENS, 5, "4.5");
        testBuilder.setTotal("4.5");
        testBuilder.setPointsEarned("1");

        executeTestHtml(testBuilder);
    }

}