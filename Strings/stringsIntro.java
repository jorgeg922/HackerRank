import java.io.*;
import java.util.*;

public class stringsIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        int size = A.compareTo(B);
        if(size < 0 || size == 0)System.out.println("No");
        else System.out.println("Yes");
        
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}