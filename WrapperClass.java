public class WrapperClass
{
public static void main(String[]args)
{
int m1=15;
Integer m2=m1;
int m3=m2;
Integer m4=Integer.valueOf("15");
System.out.println(m4.equals(m3));
System.out.println(m2.equals(m1));
//binary number
Integer i = Integer.valueOf("11111111",2);
System.out.println(i);
//hexadecimal number
Integer i1 = Integer.valueOf("A7",16);
System.out.println(i1);
Integer i2 = Integer.decode("0xA7");
System.out.println(i2);
System.out.println(Integer.parseInt("234"));
System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
System.out.println(Integer.reverse(456));
System.out.println(Integer.toBinaryString(4));
}
}