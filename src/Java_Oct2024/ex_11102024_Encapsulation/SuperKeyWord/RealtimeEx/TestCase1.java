package Java_Oct2024.ex_11102024_Encapsulation.SuperKeyWord.RealtimeEx;

public class TestCase1 extends BaseClass {
// TestCase is A type of BaseClass - Single inheritance
    TestCase1(){
        super();//Default constructor for my parent
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browsername, boolean isAuth) {
        super.setBrowser(browsername, isAuth);
    }
}
