import java.io.*;
import java.util.*;
public class stringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if(!scan.hasNext()) { System.out.print("0"); return;}
        
        String s = scan.nextLine();
        
        String [] stringArr = s.trim().split("[_\\@ !,?.']+"); 
        
        System.out.println(stringArr.length);
        
        for (String temp: stringArr){
            System.out.println(temp);
        }      
        scan.close();
    }
}
