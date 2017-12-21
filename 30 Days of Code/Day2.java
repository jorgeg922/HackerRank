import java.util.*;
import java.math.*;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = (tipPercent*mealCost)/100;
        double tax = (mealCost*taxPercent)/100;
        double tcost = tip + tax + mealCost;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tcost);
       
      
        // Print your result
        System.out.printf("The total meal cost is %d dollars.",totalCost);
    }
}