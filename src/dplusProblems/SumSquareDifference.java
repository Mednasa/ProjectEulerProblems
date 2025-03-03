package dplusProblems;

public class SumSquareDifference {
    public static void main(String[] args) {

        /*
        Sum Square Difference
        The sum of the squares of the first ten natural numbers is,
        1^2 + 2^2+....+10^2 = 385
        The square of the sum of the first ten natural numbers is,
        (1+2+.....+10)^2 = 55^2 = 3025.
        Hence the difference between the sum of the squares of the first ten natural numbers
        and the square of the sum is  3025-385= 2640.
        Find the difference between the sum of the squares of the first
        one hundred natural numbers and the square of the sum.
         */

        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <=100 ; i++) {
            sumOfSquares+= (int)Math.pow(i,2);
            squareOfSum = (int)Math.pow(((i*(i+1))/2),2);

        }
        System.out.println("The sum of the squares of the first one hundred natural numbers = "+sumOfSquares);
        System.out.println("The square of the first one hundred natural numbers= "+squareOfSum);

        System.out.println("The difference between the sum of the squares of the first " +
                "one hundred natural numbers and the square of the sum is= "+(squareOfSum-sumOfSquares));


    }
}
