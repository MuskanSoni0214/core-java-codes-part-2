//Nested Inner Class
class Outer
{
int x=10;
abstract class My
{
abstract void anonymous();
}
interface MyMy
{
void anonymous1();
}
class Inner
{
int y=20;
 void display()
{
System.out.println(x);
System.out.println(y);
}
}
void outerDisplay()
{
Inner i = new Inner();
i.display();
System.out.println(i.y);
//Local Inner class
class LocalInner
{
void localDisplay()
{
System.out.println("Hello");
}
}
LocalInner li = new LocalInner();
li.localDisplay();
}

public void meth()
{
My m = new My()
{
public void anonymous()
{
System.out.println("Hi I am anonymous abstract class");
}
};

MyMy m1 = new MyMy()
{
public void anonymous1()
{
System.out.println("Hi I am anonymous interface");
}
};

}

}
class InnerClasses
{
public static void main(String[]args)
{
Outer o = new Outer();
o.outerDisplay();
Outer.Inner i = new Outer().new Inner();
o.meth();
}
}