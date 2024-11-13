package Oct.ex_09102024_Polymorphism.MethodOverWriting.Ex2;

public class Son extends Father {  // Son class should extend Father
    @Override
    void bhk() {// This overrides the bhk method in Father
        //super.bhk();
        System.out.println("3BHK");
    }
}