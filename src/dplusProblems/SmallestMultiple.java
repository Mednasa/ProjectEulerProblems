package dplusProblems;

public class SmallestMultiple {
    public static void main(String[] args) {

        /*
        2520 is the smallest number that can be divided by
        each of the numbers from 1 to 10 without any reminder
        What is the smallest positive number that is evenly
        divisible by all of the numbers from 1 to 20 ?
         */
        int number = 1;

        while (number % 7 != 0 || number % 8 != 0 || number % 9 != 0
                || number % 11 != 0 || number % 13 != 0 || number % 15 != 0
                || number % 16 != 0 || number % 17 != 0 || number % 18 != 0
                || number % 19 != 0 || number % 20 != 0) {
            number++;
        }

        System.out.println(number);


    }
}
