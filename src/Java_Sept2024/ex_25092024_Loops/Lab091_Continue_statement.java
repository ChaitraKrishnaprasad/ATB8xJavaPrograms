package Java_Sept2024.ex_25092024_Loops;

public class Lab091_Continue_statement {
    public static void main(String[] args) {
        // print the values of even & odd number from 0 to 50
        for (int i =0; i<=50; i++){
            if (i%2 ==0){
                System.out.println("Even ->" + i);
                continue;
            }
            System.out.println("Odd ->" + i);

        }

    }
}
