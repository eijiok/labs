package leet.april_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

    @Test
    void isHappy100() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy(100));
    }

    @Test
    void isHappy68() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy(68));
    }
    @Test
    void isHappy82() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy(82));
    }
    @Test
    void isHappy19() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy(19));
    }
}