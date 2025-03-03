package dplusProblems;

public class PowerfulDigitSum {
    public static void main(String[] args) {
        /*
        A googol (10^100) is a massive number: one followed by one-hundred zeros;
        100^100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size,
        the sum of the digits in each number is only 1.
        Considering natural numbers of the form, a^b, where a,b<100, what is the maximum digital sum?
         */

//        int toplam = 0;
//        int maxDeger = 0;
//        for (int i = 2; i < 100; i++) {
//            for (int j = 1; j < 100; j++) {
//                int sonucInt = (int) Math.pow(i, j);
//                String sonucStr = String.valueOf(sonucInt);
////                System.out.println(sonucStr);
//                for (int k = 0; k < sonucStr.length(); k++) {
//                    int rakam = Character.getNumericValue(sonucStr.charAt(k));
//                    toplam += rakam;
//                    if ((maxDeger<toplam)){
//                        maxDeger = toplam;
//                    }
//                }
//                toplam =0;
//
//            }
//
//        }
//        System.out.println(maxDeger);

        System.out.println(Math.pow(25,88));


    }
}
