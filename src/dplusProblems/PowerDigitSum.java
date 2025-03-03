package dplusProblems;

import java.math.BigInteger;

public class PowerDigitSum {
    public static void main(String[] args) {
        /*
        2^15 = 32768 and the sum of its digits is 3+2+7+6+8=26 .
        What is the sum of the digits of the number  2^100?
        */
        BigInteger example =BigInteger.valueOf(2).pow(1000);
        System.out.println(example);
        String exampleStr = String.valueOf(example);
        int total = 0;
        for (int i = 0; i <exampleStr.length(); i++) {
            char valueStr = exampleStr.charAt(i);
            int valueInt = Character.getNumericValue(valueStr);
            total +=valueInt;
        }
        System.out.println(total);
    }
}
