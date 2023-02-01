import java.util.Scanner;
class APSeries
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter starting number, common difference and how many terms you want to print");
int a = sc.nextInt();
int d = sc.nextInt();
int n = sc.nextInt();
System.out.println(a);
for(int i=1;i<=n;i++)
{
a+=d;
System.out.println(a);
}
}
}