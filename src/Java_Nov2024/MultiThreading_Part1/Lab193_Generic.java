package Java_Nov2024.MultiThreading_Part1;

public class Lab193_Generic {
    public static void main(String[] args) {
        //Max of three numbers
        //34, 54, 76
        //4.2, 3.4, 1.2
        // chaitra, sunil, pruthvi

        // Example of INT  //34, 54, 76
//        int maxoutput = maxmiumnumberof(34, 54,76);
//        System.out.println(maxoutput);

//Example of  DOUBLE 4.2, 3.4, 1.2
//        double maxoutput1 = maxmiumnumberof(4.2, 3.4, 1.2);
//        System.out.println(maxoutput1);

        // Example of INT  //chaitra, sunil, pruthvi


    }
// Example of INT  //34, 54, 76
//    public static int maxmiumnumberof(int a, int b, int c){
//        int max = a;
//        if(b>max) {
//            max = b;
//        }
//        if (c>max){
//            max =c;
//        }
//
//        return max;
//    }

//    public static double maxmiumnumberof(double a, double b, double c) {
//        double max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }

    public int compareTo(String chaitra, String sunil, String pruthvi) {
        String max = chaitra;
        if (sunil.compareTo(max) > 0) {
            max = sunil;
        }
        if (pruthvi.compareTo(max) > 0) {
            max = pruthvi;
        }
//        return max;
        return 0;
    }
}