import java.io.*;
import java.util.*;

public class anagrams {
 static boolean isAnagram(String a, String b) {
        // Complete the function
        int aSize = a.length();
        int bSize = b.length();
        String [] aArr = new String [aSize];
        String [] bArr = new String [bSize];
        String check;
        
        if(aSize != bSize)return false;
        
        for(int i=0; i<aSize; i++){
            aArr[i]=a.substring(i,i+1).toUpperCase();
            bArr[i]=b.substring(i,i+1).toUpperCase();
        }
        
        for(int j=0; j<aSize; j++){
            check = aArr[j];
            for(int k=0; k<bSize; k++){
                if(check.equals(bArr[k])){
                    bArr[k]="found";
                    break;
                }
            }
        }
        
        for(int l=0; l<bSize; l++){
            if(bArr[l] != "found"){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
