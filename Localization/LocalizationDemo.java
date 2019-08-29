/**
 * LocalizationDemo
 */
import java.util.Locale;
public class LocalizationDemo {

    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();

        System.out.println(locale.getDisplayCountry());  
        System.out.println(locale.getDisplayLanguage());  
        System.out.println(locale.getDisplayName());  
        System.out.println(locale.getISO3Country());  
        System.out.println(locale.getISO3Language());  
        System.out.println(locale.getLanguage());  
        System.out.println(locale.getCountry());  

        Locale[] otherLocales = { new Locale("en", "US"), new Locale("es", "ES"), new Locale("it", "IT") };
        
        for (int i=0; i< otherLocales.length; i++) {   
            System.out.println("");
            String displayLanguage = otherLocales[i].getDisplayLanguage(otherLocales[i]);   
            String getDisplayCountry = otherLocales[i].getDisplayCountry(otherLocales[i]);   

            System.out.println(otherLocales[i].toString() + ": " + displayLanguage); 
            System.out.println(otherLocales[i].toString() + ": " + getDisplayCountry);   
        }   
    }
}