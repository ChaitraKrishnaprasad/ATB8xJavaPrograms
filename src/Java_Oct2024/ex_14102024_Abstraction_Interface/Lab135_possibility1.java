package Java_Oct2024.ex_14102024_Abstraction_Interface;

public class Lab135_possibility1 {
}
interface I1{} //Possible
interface I2{}//Possible
class A{}//Possible
class B{}//Possible
class test1 extends A{}//Possible
//class test2 extends A,B{} // Not Possible
class test3 implements I1{}//Possible
class test4 implements I2{}//Possible
class test5 implements I1,I2{}//Possible
class test6 extends A implements I1{}//Possible
class test7 extends A implements I1, I2{}//Possible
//class test8  implements I1, I2 extends A{} //Not Possible

