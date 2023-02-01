import java.util.*;
public class OldTimeDate
{
public static void main(String[]args)
{
/*System.out.println(System.currentTimeMillis()/1000/60/60/24/365); 
Date d = new Date();
System.out.println(d);
System.out.println(d.getMonth());
System.out.println(d.getDay());
System.out.println(d.getYear()+1900);*/

GregorianCalendar gc = new GregorianCalendar();
System.out.println(gc.isLeapYear(2023));
System.out.println(gc.get(Calendar.DATE));
System.out.println(gc.get(Calendar.MONTH));
System.out.println(gc.get(Calendar.DAY_OF_WEEK));
System.out.println(gc.get(Calendar.DAY_OF_YEAR));

gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
TimeZone tz = gc.getTimeZone();
System.out.println(tz);
System.out.println(tz.getDisplayName());
System.out.println(tz.getID());
}
}