import java.util.*;

@FunctionalInterface
interface MyMy
{
public void show();
//public void display();
}
class Parent
{
public void display(){}
}
class Child extends Parent
{
@Override
public void display(){}
}

class Dep
{
public void yo()
{
System.out.println("YO YO YO YO...");
}
@Deprecated
public void bhow()
{
System.out.println("YO YO YO YO...");
}
}

class My<T>
{
@SafeVarargs
private void show(T...arg)
{
for(T x:arg)
System.out.println(x);
}
}

public class Annotations
{

static List l;

//@SuppressWarnings("deprecation")
@SuppressWarnings("unchecked")
public static void main(String[]args)
{

//l.add(10);

/*Dep d = new Dep();
d.bhow();*/
}
}