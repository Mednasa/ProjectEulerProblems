package dplusProblems;

public class LargestPalindromeProduct {
    public static void main(String[] args) {

        /*
        A palindromic number reads the same both ways.
        The largest palindrome made from the product of two
        2-digit numbers is 9009 = 91x99
        Find the largest palindrome made from the product of two  3-digit numbers.
         */

        String reverseStrCarpim;
        int maxProduct = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int carpim = i * j;
                String strCarpim = String.valueOf(carpim);
                reverseStrCarpim = "";

                for (int k = strCarpim.length() - 1; k >= 0; k--) {
                    reverseStrCarpim += strCarpim.charAt(k);
                }

                if (strCarpim.equals(reverseStrCarpim)) {

                    if (carpim > maxProduct) {
                        maxProduct = carpim;
                    }
                }


            }
        }

        System.out.println("Larges Palindrome Product: " + maxProduct);


    }
}
