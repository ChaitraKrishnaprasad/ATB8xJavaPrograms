package Java_Sept2024.DailySepTasks;

public class ex_30092024_T2_PrimeNumber_1to100 {
    public static void main(String[] args) {
        System.out.println("Prime number for 1 to 100:");
        for(int num = 2; num <=100; num++){
            int count = 0;
            // Check divisibility from 1 up to the 100 itself
            for (int i = 1; i<=num; i++){
                if (num % i ==0){
                    count++;
                }
            }
            // If count is exactly 2, the number is prime (only divisible by 1 and itself)
            if (count == 2){
                System.out.println(num + " ");
            }
        }
    }
}
