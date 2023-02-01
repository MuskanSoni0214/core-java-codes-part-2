import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class DateTimeClasses
{
public static void main(String []args)
{
ZonedDateTime zdt = ZonedDateTime.now();
System.out.println(zdt);
OffsetDateTime odt = OffsetDateTime.now();
System.out.println(odt);
ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
System.out.println(zdt1);
MonthDay md = MonthDay.now();
System.out.println(zdt);
YearMonth ym = YearMonth.now();
System.out.println(ym);
Year y = Year.now();
System.out.println(y);
Period p =Period.of(2,2,10);
System.out.println(p.addTo(LocalDate.now()));
Instant i = Instant.now();
System.out.println(i);

}
}