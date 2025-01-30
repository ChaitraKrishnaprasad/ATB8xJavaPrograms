package Java_Oct2024.ex_04102024_Constructor;

public class Lab112_Dog {
    public static void main(String[] args) {
        Dog GS = new Dog();

        Dog BD = new Dog("GS", "AA", 1, 4);
        System.out.println(BD.breed);
        System.out.println(BD.name);
        System.out.println(BD.age);
        System.out.println(BD.legs);

        Dog BD1 = new Dog("BD");
    }

}
