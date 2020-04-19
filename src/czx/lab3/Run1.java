package czx.lab3;

import java.time.LocalDateTime;
import java.util.Date;

public class Run1 {
    public static void main(String[] args)
    {
        Date today=new Date();
        System.out.println(today.toString());
        LocalDateTime mydate =LocalDateTime.now();
        System.out.println(mydate.getMonthValue());
        System.out.println(mydate.getYear());
    }
}
