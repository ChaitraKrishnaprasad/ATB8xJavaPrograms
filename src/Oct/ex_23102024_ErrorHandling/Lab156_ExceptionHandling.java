package Oct.ex_23102024_ErrorHandling;

public class Lab156_ExceptionHandling {
    public static void main(String[] args) {
        try {
            String ip = args[10]; //java.lang.ArrayIndexOutOfBoundsException
            int b = Integer.parseInt(ip);// NumberFormatExcepion
            int a =  100/b;//ArithmeticException
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }
    }
}
