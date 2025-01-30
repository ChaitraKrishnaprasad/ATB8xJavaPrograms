package Java_Sept2024.DailySepTasks;

public class ex_25092024_Task2_prime_number {
    public static void main(String[] args) {
//Prime Number from 1 to 100. (for loop)

        System.out.println("Prime numbers between 1 and 100 are:");

        // Iterate from 1 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number other than 1 and itself
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;  // num is divisible by i, so it's not prime
                    break;
                }
            }

            // If isPrime remains true, num is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
