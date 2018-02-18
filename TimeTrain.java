import java.time.*;
import java.util.Date;

public class TimeTrain {
    public static void main (String [] args){
        
    System.out.println(new Date());
    System.out.println();
    
    String str1 = new Date().toString();
    System.out.println(str1.substring(0, 10));
    System.out.println();
    
    LocalDate myBirthday = LocalDate.of(1973, 3, 26);
    System.out.println(myBirthday);
    System.out.println();
    
    int myYear = myBirthday.getYear();
    int myMonth = myBirthday.getMonthValue();
    int myDay = myBirthday.getDayOfMonth();
    System.out.println(myYear);
    System.out.println(myMonth);
    System.out.println(myDay);
    System.out.println();
    
    LocalDate myBirthday1 = myBirthday.plusDays(10000);
    
    int myYear1 = myBirthday1.getYear();
    int myMonth1 = myBirthday1.getMonthValue();
    int myDay1 = myBirthday1.getDayOfMonth();
    System.out.println(myYear1);
    System.out.println(myMonth1);
    System.out.println(myDay1);
    System.out.println();
    
    System.out.println("Point 1");
    Date date1 = new Date(2018, 01, 15);
    Date date2 = new Date(2018, 01, 18);
    System.out.println(date1.before(date2));
    System.out.println();
    
    System.out.println("Point 2");
    Date date3 = new Date();
    Object date4 = date3.clone();
    System.out.println((Date)date4);
    System.out.println();
    
    System.out.println("Point 3");
    System.out.println(date3.getTime());
    System.out.println(date1.getTime());
    System.out.println(date2.getTime());
    System.out.println();
    
    }
    
}
