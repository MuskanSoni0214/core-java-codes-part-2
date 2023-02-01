abstract class Super
{
public Super()
{
System.out.println("Super class Constructor");
}
 public void meth1()
{
System.out.println("Super Method one");
}
abstract public void meth2();
}

class Sub extends Super
{
 public void meth2()
{
System.out.println("Sub Method two");
}
}

public class AbstractClass
{
public static void main(String[]args)
{
Super s = new Sub();
s.meth1();
s.meth2();
}
}