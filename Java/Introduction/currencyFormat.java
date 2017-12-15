import java.util.*;
import java.text.*;

public class currencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String us = currencyFormatter.format(payment);   
        
        currencyFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = currencyFormatter.format(payment);   
        
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatter.format(payment);
        
       currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatter.format(payment);
           
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}