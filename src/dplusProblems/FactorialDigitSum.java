package dplusProblems;

import java.math.BigInteger;

public class FactorialDigitSum {
    public static void main(String[] args) {
        /*
        n! means n x( n-1)x..x3x2x1
        for example 10! = 10x9x8x7x6.....x3x2x1 = 3628800
        and the sum of the digits in the number 10! is 3+6+2+8+8+0+0 = 27
        Find the sum of the digits in the number 100!
         */

        FactorialDigitSuM(Factoriel(100));

    }

    public static void FactorialDigitSuM(BigInteger Factoriel) {
        String factStr = String.valueOf(Factoriel);
        int total = 0;
        for (int i = 0; i < factStr.length(); i++) {
            int numInt = Character.getNumericValue(factStr.charAt(i));
            total +=numInt;
        }
        System.out.println(total);

    }

    public static BigInteger Factoriel(int number) {

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
          fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
