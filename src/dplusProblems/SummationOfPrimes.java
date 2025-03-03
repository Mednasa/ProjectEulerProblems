package dplusProblems;

public class SummationOfPrimes {
    public static void main(String[] args) {

        /*
        The sum of the primes below 10 is 2+3+5+7 = 17
        Find the sum of all the primes below two million.
         */

        long count=0;

        for (long i = 2; i <2000000 ; i++) {
            boolean prime = true;
            for (long j = 2; j <i ; j++) {
                if (i%j ==0){
                    prime=false;
                    break;
                }
            }
            if (prime){
                System.out.println(i);
            }

        }
    }
}
