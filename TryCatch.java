import java.util.*;
import java.io.*;

class TryCatch
{
public static void main(String[]args) 
{
/*int a,b,c=0;
try
{
a=10;
b=0;
c=a/c;
System.out.println("Result is "+c);
}
catch(ArithmeticException e)
{
System.out.println("Division by zero "+e);
}*/


try
{
int [] arr={4,2,5,0,6};
int c = arr[0]/arr[3];
System.out.println("Result is "+c);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println("Division by zero "+e);
}
finally
{
System.out.println("what the fuck man");
}
}
}