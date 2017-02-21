import java.util.*;

public class Runner {

   public static void main(String[] args) {
     

   // create a currency object with specified locale
   Locale locale = Locale.GERMANY;
   Currency curr = Currency.getInstance(locale);

   // print currency's code
   System.out.println("Locale's currency code:" + curr.getCurrencyCode());
 }
}

// The java.util.Currency.getInstance() method returns the Currency instance for the given locale's country.

