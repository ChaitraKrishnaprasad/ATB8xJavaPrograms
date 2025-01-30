package Java_Sept2024.ex_25092024_Loops;

public class Lab092_Break_Continue_Statement  {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println("Post Increment" + i); //pre & post increment are same
        }
        for (int i=0; i<10; ++i){
            System.out.println("Pre Increment" + i);
        }

        for (char i = 'A'; i<='Z'; i++){
            if (i =='P'){
                break;
            }
            System.out.println(i);
        }
    }
}
