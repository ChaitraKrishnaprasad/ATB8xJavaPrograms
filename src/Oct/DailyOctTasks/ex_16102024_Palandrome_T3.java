package Oct.DailyOctTasks;

public class ex_16102024_Palandrome_T3 {
    public static void main(String[] args) {
//        Palindrome
//
//        Input : str = "abba"
//        Output: Yes
//
//        Input : str = "pramod"
//        Output: No
        String str = "abba";
        boolean isPalandrom = true;
        for (int i = 0; i<=str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalandrom = false;
                break;
                }
            if (isPalandrom) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");

            }
        }
    }
}
