import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char [] sArr = A.toLowerCase().toCharArray();
        char [] tmpArr = new char[sArr.length];
        int count = 0;
        if(sArr.length == 1){
            System.out.println("Yes");
        }else{
        for(int i=0; i< sArr.length; i++){
            tmpArr[i]=sArr[sArr.length-1-i];
            if(sArr[i] != tmpArr[i]){
                System.out.println("No");
                break;
            }
        count++;
            if(count == sArr.length-1){
                System.out.println("Yes");
            }
            
        }
        } 
   }
}
