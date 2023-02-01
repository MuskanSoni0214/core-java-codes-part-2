class Test implements Runnable
{
public void run()
{
int i =1;
while(true)
{
System.out.println(i+" Hiiiiii");
i++;
}
}
}
public class RunnableClass
{
public static void main(String[]args)
{
Test t = new Test();
Thread th = new Thread(t);
th.start();
int i =1;
while(true)
{
System.out.println(i+" Holaaaa");
i++;
}
}
}