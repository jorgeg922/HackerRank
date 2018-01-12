import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        //System.out.println(testCases);
        for(int i=0; i<testCases; i++){
            String caseString = scan.next();
            //System.out.println(caseString);
            int stringLength = caseString.length();
            StringBuilder evenString = new StringBuilder();
            StringBuilder oddString = new StringBuilder();
            
            for(int j=0; j<stringLength; j++){
                if(j % 2 == 0){
                    evenString.append(caseString.charAt(j));
                }else{
                    oddString.append(caseString.charAt(j));
                }    
            }
           System.out.println(""+evenString+" "+oddString);               
        }
    }
}