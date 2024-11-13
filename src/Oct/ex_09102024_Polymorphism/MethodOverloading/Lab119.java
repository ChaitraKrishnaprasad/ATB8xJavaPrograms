package Oct.ex_09102024_Polymorphism.MethodOverloading;

public class Lab119 {
    public static void main(String[] args) {
        MathOperator m = new MathOperator();
        int result = m.add(3,4);
        System.out.println("Integer Value "+result);

        String n = m.add("Chaitra", "Sunil");
        System.out.println("String Value "+n);

       m.add(10, 3, 7);
       System.out.println("direct parameter for calling 3rd operator");

        double d = m.add(10.5, 3.5);
        System.out.println("4th operator " + d);

        double d1 = m.add(12, 10, 1.5f);
        System.out.printf("5th Operator " + d1);



    }
}
