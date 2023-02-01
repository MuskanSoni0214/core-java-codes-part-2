import java.io.*;
import java.util.*;
public class ResourceDemo
{
static FileInputStream fi;
static Scanner sc;
static void Divide() throws Exception
{
fi = new FileInputStream("F:/Study/Abdul Bari/TryWithResources");
sc = new Scanner(fi);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println(a/b);
fi.close();
//sc.close();
}
public static void main(String[]args) throws Exception
{
Divide();
int x= sc.nextInt();
System.out.println(x);
}
}