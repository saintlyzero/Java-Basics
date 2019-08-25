/**
 * DivideByZeroEx
 */
public class SingleException {

    public static void main(String[] args) {
        
        int number = 100;
        int divisor = 0;
        int result;

        System.out.println(number+" / "+divisor);

        try {
            result = divide(number, divisor);
            System.out.println("Result: "+result);

        } 
        catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace(); //Use this => Shows line number and the function name
        }
    }

    public static int divide(int number, int divisor) {
        return number / divisor;  
    }
}