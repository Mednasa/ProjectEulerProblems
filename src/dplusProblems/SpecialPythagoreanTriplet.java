package dplusProblems;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        /*
        A Pythagorean triplet is a set of three natural numbers, a<b<c, for which,
                             a'2+b'2=c'2
        For example, 3'2 + 4'2 + = 9+16 = 25 = 5'2.
        There exists exactly one Pythagorean triplet for which a + b +c = 1000.
        Find the product.
         */


        for (int a = 1; a < 500; a++) {
            for (int b = 1; b < 500; b++) {
                for (int c = 1; c < 500; c++) {

                    if (a < b && b < c && ((a * a) + (b * b) == (c * c)) && (a + b + c == 1000)) {

                        System.out.println("(" + a + " * " + b + " * " + c + ") = (" + a * b * c + ")");
                        break;


                    }

                }

            }

        }

    }
}
