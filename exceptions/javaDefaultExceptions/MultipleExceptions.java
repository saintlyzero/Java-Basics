/**
 * MultipleExceptions
 */
public class MultipleExceptions {

    public static void main(String[] args) {
        
        String inputNumber = "100";
        String inputDivisor = "abc";
    
        int result;

        try {
            // convert string to int
            int number = Integer.parseInt(inputNumber);
            int divisor = Integer.parseInt(inputDivisor);

            result = divide(number, divisor);
            System.out.println("Result: "+result);
        } 
        catch (ArithmeticException arithmeticException) {
            System.out.println("Cannot divide by 0");
            System.out.println(arithmeticException.getMessage());
        }
        catch(NumberFormatException numberFormatException){
            System.out.println("Invalid numbers. Enter a Integer");
            System.out.println(numberFormatException.getMessage());
        }
    }

    public static int divide(int number, int divisor) {
        return number / divisor;  
    }
}