package Oct.ex_14102024_Abstraction_Interface.Example3Abstraction;

public class WagonR extends Engine{

    void drive(){
        startingEngine();
        StopingEngine();
    }


    @Override
    void startingEngine() {
        System.out.println("Starting the Car");
    }

    @Override
    void StopingEngine() {
        System.out.println("Stoping the Car");
    }
}
