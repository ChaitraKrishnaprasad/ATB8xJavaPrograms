package Java_Sept2024.ex_20092024_TernarryOperator_Conditional_Loops;

public class Lab064_Conditional_IF_Else_loop_Assignment1 {
    public static void main(String[] args) {
        // Grade calculator
        // Write a program that calculates and displays
        //based on the following grading scale
        // A : 90-100
        // B : 80-89
        // C : 70-79
        // D : 60-69
        // F : 0 -59

        //1. Find user Input

        int score = 75;
        char grade;

        if (score >= 90 && score<100){
            grade = 'A';
        } else if (score >=80 && score<89){
            grade = 'B';
        } else if (score >=70 && score<79) {
            grade = 'C';
        } else if (score >=60 && score<69) {
            grade = 'D';
        }else if (score >=50 && score<59) {
            grade = 'E';
        }else if (score >=0 && score<49) {
            grade = 'F';
        }else if (score <=0 || score<100) {
            System.out.println("LOL!!, are you a god");
            grade = 'G';
        }else{
            grade = 'F';
        }
        System.out.println("Your Grade is --> " + grade);
    }
}
