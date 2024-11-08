package Oct.ex_04102024_OOPs;

public class Lab109_OOPs {
   String eye_colour;
   String names;
   long aadhar_card_number;

   void walk(){
       System.out.println("No Return Type | No argument");
   }

   int talk(){
       System.out.println("Return Type with No Argument");
       return 10;
   }

   String sleep(String names){
       System.out.println("Sleeping");
       System.out.println("Return Type with Argument");
       return "I am sleeping";
   }

    void eat(String names){
        System.out.println("Eat");
        System.out.println("No Return Type with Argument");

    }

    public static void main(String[] args) {
       Lab109_OOPs name = new Lab109_OOPs();

       name.eye_colour = "Brown";
       name.names = "Chaitra";
       name.aadhar_card_number = 1234567890L;

       name.walk();
       name.talk();
       name.sleep(name.names);
       name.eat(name.names);

    }
}
