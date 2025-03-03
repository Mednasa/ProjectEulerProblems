package dplusProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestCollatzSequence {
    public static void main(String[] args) {
        /*
        The following iterative sequence is defined for the set of positive integers:
        n > n/2(n is even)
        n > 3n+1(n is odd)
        Using the rule above and starting with 13, we generate the following sequence:

        13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.

        It can be seen that this sequence (starting at 13 and finishing at 1 ) contains
        10 terms. Although it has not been proved yet (Collatz Problem), it is thought that
        all starting numbers finish at 1.

        Which starting number, under one million, produces the longest chain?
        NOTE: Once the chain starts the terms are allowed to go above one million.
         */

        Map<Long, Integer> Collatz = new HashMap<>();
        int maxLength = 0;
        int startingNumber=0;
        for (int num = 2; num < 1000000; num++) {
            long temp = num;
            int count = 0;

            while (temp != 1 && !Collatz.containsKey(temp)) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = (3 * temp) + 1;
                }
                count++;
            }

            count += Collatz.getOrDefault(temp, 0);
            Collatz.put((long) num, count);

            if (count > maxLength) {
                maxLength = count;
                startingNumber=num;
            }
        }

        System.out.println(startingNumber);
        System.out.println(maxLength);



    }
}
