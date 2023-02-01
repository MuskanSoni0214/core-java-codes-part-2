
import java.lang.reflect.*;
class My
{
private int a;
protected int b;
public int c;
int d;

public My(){}

public My(int x,int y){}

public void display(String s1,String s2){}

public int show(int x,int y){return 0;}
}

public class ReflectDemo
{
public static void main(String[]args)
{
Class c = My.class;

/*My m=new My();
class c1 = m.getClass();*/

System.out.println(c.getName());
 
Field field[]=c.getDeclaredFields();
for(Field f:field)
  System.out.println(f);

Constructor con[]=c.getConstructors();
for(Constructor ct:con)
  System.out.println(ct);

Method m[]=c.getMethods();
for(Method meth:m)
  System.out.println(meth);

Parameter p[]=m[0].getParameters();
for(Parameter para:p)
  System.out.println(para);

}
}