import java.util.*;
import java.io.*;
public class TokenizerDemo
{
public static void main(String[]args)throws Exception
{
//String data="name=Muskan;address=Satna;country=India;department=cse";
//String data="name=Muskan\naddress=Satna\ncountry=India\ndepartment=cse";
//String data="name=Muskan address=Satna country=India department=cse";

FileInputStream fis = new FileInputStream("/F:/Study/Abdul Bari/Token.txt");
byte b[]=new byte[fis.available()];
fis.read(b);
String data=new String(b);
StringTokenizer stk = new StringTokenizer(data,"=");
String s;
while(stk.hasMoreTokens())
{
s=stk.nextToken();
System.out.println(s);
}
}
}