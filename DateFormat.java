import java.util.*;
class DateFormat
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
String n = sc.next();
System.out.println(n.matches("[0123][0-9]/[01][0-9]/[0-9]{4}"));
}
}