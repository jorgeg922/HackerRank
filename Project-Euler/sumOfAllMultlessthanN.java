import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//formulas derived from: An = A1 + d(n-1) where:
//A1 is the first value of the sequence
//d= difference between the value of the terms
//n= the position of the term

//For the sum: (n/2)(A1-An) = sum of all terms up to the nth term
public class sumOfAllMultlessthanN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long a=0, b=0, d=0;
            //finds the highest term divisible by 3 and less than the constraint
            a=(n-1)%3;
            a=n-1-a; //this is the highest number divisible by 3 less than the contraint and your last term
            a=a/3; //this finds what term in the arithmetic series the highest number is located in 
            b=(n-1)%5;
            b=n-1-b;
            b=b/5;
            d=(n-1)%15;
            d=n-1-d;
            d=d/15;
           //formula for the sum of a series: (#term/2)*(a1 + value of last term). In code
           // the division is performed last to avoid rounding of possible fractions
            long c = (a*3*(1+a))/2 + (b*5*(1+b))/2 - (d*15*(1+d))/2;
            System.out.println(c);
            
        }
    }
}
