import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateDemo
{
public static void main(String[]args)
{
//LocalDate dt = LocalDate.now(ZoneId.of("Asia/Calcutta"));
//LocalDate dt = LocalDate.now(Clock.systemDefaultZone());
//LocalDate dt = LocalDate.now();
//LocalDate dt = LocalDate.of(2020,Month.MARCH,10);
//LocalDate dt = LocalDate.ofEpochDay(1000);
//LocalDate dt = LocalDate.ofEpochDay(1);
/*LocalDate dt = LocalDate.parse("2020-01-03");
LocalDate dt1 = dt.plusMonths(6);
System.out.println(dt1);*/

LocalTime t = LocalTime.now();
System.out.println(t);
LocalTime t1=t.minusHours(3);
System.out.println(t1);

LocalDateTime ldt = LocalDateTime.now();
System.out.println(ldt);

}
}
