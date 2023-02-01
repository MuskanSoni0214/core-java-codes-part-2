import java.util.Scanner;
class Prime
{

static void prime(int n)
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println("The given number is not Prime number.");
break;
}
else
{
System.out.println("The given number is Prime number.");
break;
}
}
}

public static void main(String[]args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n = sc.nextInt();
prime(n);
}
}