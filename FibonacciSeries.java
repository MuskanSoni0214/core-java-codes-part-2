import java.util.Scanner;
class FibonacciSeries
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many terms you want to print");
int n = sc.nextInt();
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=n;i++)
{
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}