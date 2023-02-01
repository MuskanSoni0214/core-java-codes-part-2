import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
public class DateTimeFormat
{
public static void main(String[]args)
{
ZonedDateTime zdt = ZonedDateTime.now();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
System.out.println(dtf.format(zdt));
System.out.println(zdt.get(ChronoField.YEAR));
}
}