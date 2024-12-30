package Oct.ex_09102024_Polymorphism.MethodOverWriting.Ex2;

public class Lab121 {
    public static void main(String[] args) {

        Son s = new Son();
        s.bhk();// Son have access to both Father and Son classes

        Father f = new Father();
        f.bhk(); // Father have access to only Father class

        //Dynamic Class
        Father object = new Son();
        object.bhk();
        //It will print son class info, suppose sun class do not have any info can extended from Father will print only Father info

        //WebDriver driver = new ChromeDriver();
        //This above code is Dynamic class, we can see this in selenium
        //WebDriver is Father
        //ChromeDriver is child
    }
}

//when we use super key it seems to be print both Father and son. Override means, it will override both 2 & 3 bhk