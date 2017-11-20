import java.util.Scanner;
import java.util.Calendar;

public class dateTime {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        int xferDay = Integer.parseInt(day);
        int xferMonth = Integer.parseInt(month)-1;
        int xferYear = Integer.parseInt(year);
        
        Calendar myCalendar = Calendar.getInstance();
        
        myCalendar.set(Calendar.DAY_OF_MONTH, xferDay);
        myCalendar.set(Calendar.MONTH, xferMonth);
        myCalendar.set(Calendar.YEAR, xferYear);
           
        int spelledDay = myCalendar.get(Calendar.DAY_OF_WEEK);
        
        String [] daysofWeek = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        return daysofWeek[spelledDay-1];
    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}