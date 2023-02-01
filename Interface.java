interface A
{
void meth1();
void meth2();
}
class B implements A
{
public void meth1()
{
System.out.println("This is method one of B class");
}
public void meth2()
{
System.out.println("This is method two of B class");
}
public void meth3()
{
System.out.println("This is method three of B class");
}
}
public class Interface
{
public static void main(String[]args)
{
A a = new B();
a.meth1();
a.meth2();
}
}