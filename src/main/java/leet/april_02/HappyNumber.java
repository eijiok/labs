package leet.april_02;

public class HappyNumber {
    /**
     * A happy number is a number defined by the following process:
     * Starting with any positive integer, replace the number by the sum of the squares of its digits,
     * and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in
     * a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
     * @return
     */
    public boolean isHappy(int n) {
        int val = n;
        while (true) {
            if (val < 10)
                return val == 1 || val == 7;
            int soma = 0;
            while (val > 0) {
                int lastDigit = (int) Math.round(val % 10);
                val = val / 10;
                soma += lastDigit * lastDigit;
            }
            val = soma;
        }
    }
}
