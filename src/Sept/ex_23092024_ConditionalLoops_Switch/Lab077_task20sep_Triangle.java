package Sept.ex_23092024_ConditionalLoops_Switch;

public class Lab077_task20sep_Triangle {
    public static void main(String[] args) {
        int side1 = 10;
        int side2 = 10;
        int side3 = 20;

        if (side1 == side2 && side2 == side3 && side3 == side1){
            System.out.println("triangle is equilateral");
        }
        else if (side1 == side2 && side2 == side3 && side3 != side1 ){
            System.out.println("isosceles");
        }
        else {
            System.out.println("no sides are equal");
        }
    }
}
