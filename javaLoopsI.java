import java.io.*;
import java.util.*;

public class javaLoopsI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        
        for(int i=1; i<=10; i++){
            int product = d*i;
            System.out.println(d + " x " + i + " = " + product);
        }
    }
}