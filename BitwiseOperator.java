import java.util.*;
class BitwiseOperator    
{
public static void main(String[]args)
{
int x=0b00101;
int y=0b10011;
int z1=x|y;
int z2=x&y;
int z3=x^y;
System.out.println(z1);
System.out.println(z2);
System.out.println(z3);
System.out.println(x<<1);
System.out.println(y<<1);
System.out.println(x>>1);
System.out.println(y>>1);
}
}