import java.util.*;
class CheckHexaNo
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
String n = sc.next();
System.out.println(n.matches("[0-9ABCDEF]+"));
}
}