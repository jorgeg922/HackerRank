import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "([a-zA-Z]{1,1})([a-zA-Z0-9\\_]{7,29})";
}
public class username {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}