/**
 * GeneralizedException
 * 
 * Use generalized exception when you are not sure which exceptions might get raised
 * 
 */
public class GeneralizedException {

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
        catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static int divide(int number, int divisor) {
        return number / divisor;  
    }
}