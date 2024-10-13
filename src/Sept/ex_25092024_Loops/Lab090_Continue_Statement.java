package Sept.ex_25092024_Loops;

public class Lab090_Continue_Statement {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
            System.out.println(i);
            if(i==5){
                continue; // when continue comes it will not come out of theloop, it will jump to line 5
            }
            System.out.println("After");
        }
    }
}
