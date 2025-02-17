package RevisionPlan_15days.Operator;

public class RL006_InstanceOf_Object_Diff {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Instance
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
       //System.out.println(d instanceof RL006_InstanceOf_Object_Diff);

        // Object
        Object obj = "Hello";
        System.out.println(obj.toString());

    }
}

class Animal
{
    }
    class Dog extends Animal{
    }


