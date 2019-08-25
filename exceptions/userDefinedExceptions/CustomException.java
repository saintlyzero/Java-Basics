
/**
 * CustomException
 */
class PasswordException extends Exception {

    public PasswordException(String s){
        super(s);
    }
}
public class CustomException {

    public static void main(String[] args) {
        
        String userInputPassword = "abcde";

        try {
            
            //Checks for at least 5 characters
            if(userInputPassword.length() < 5){
                throw new PasswordException("Password should have at least 5 characters");
            }

            //Checks whether at least one char is Special character
            if (userInputPassword.matches("[A-Za-z0-9 ]*")) {
                throw new PasswordException("Password should have at least 1 Special character");
            }

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}