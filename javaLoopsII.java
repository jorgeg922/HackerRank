import java.util.*;
import java.io.*;

class javaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<=t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //System.out.println("this is a:"+a);
            int S0 = 0;
            for(int j=0; j<n; j++){
                //System.out.println("n ="+i);
                S0 = S0 + (((int)Math.pow((double)2,(double)j)) * b);
                if(j == 0){
                    S0 = S0 + a;
                }
                System.out.print(S0 + " ");
            }
           System.out.println();
        }
        in.close();
    }
}
