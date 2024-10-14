public class ex_20092024_Task4_leapyear {
    public static void main(String[] args) {
        int year = 2024;
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("Leap year");
//                } else {
//                    System.out.println("Not a leap year");
//                }
//            } else {
//                System.out.println("Leap year");
//            }
//        } else {
//            System.out.println("Not a leap year");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");

        }
    }
}
