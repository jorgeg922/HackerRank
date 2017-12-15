import java.util.Scanner;

public class outputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String string_formatted = String.format("%-15s", s1);
                String num_formatted = String.format("%03d", x);
                System.out.println(string_formatted + num_formatted);
            }
            System.out.println("================================");

    }
}
