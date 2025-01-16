package Oct.ex_23102024;

public class Lab161_CustomException {
    public static void main(String[] args) {
        Lab161_Bank_CustExcep sbi = new Lab161_Bank_CustExcep("INR", 100);
        Lab161_Bank_CustExcep icici = new Lab161_Bank_CustExcep("INR", 123);
        Lab161_Bank_CustExcep JP_Chase = new Lab161_Bank_CustExcep("USD", 100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(JP_Chase));
    }
}
