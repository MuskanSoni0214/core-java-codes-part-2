 @FunctionalInterface
interface MyLamda
{
public void display();
}

class Demo
{
int temp =10;
public void method1()
{
int count =0;
MyLamda ml =()->{
int x=0;
System.out.println("Hiii "+count);
System.out.println("Bye "+(++temp));
};

ml.display();

}
}

 @FunctionalInterface
interface MyLamda1
{
public void display1(String s);
}

 @FunctionalInterface
interface MyLamda2
{
public int add(int a,int b);
}

public class LamdaDemo
{
public static void main(String[]args)
{
MyLamda m=()->{System.out.println("Hello World!");};
m.display();

MyLamda1 m1=(s)->{System.out.println(s);};
m1.display1("My name is Muskan Soni");

MyLamda2 m2=(a,b)->{return a+b;};
System.out.println(m2.add(2,2));

MyLamda2 m3=(a,b)->a+b;
System.out.println(m3.add(20,20));

Demo d = new Demo();
d.method1();

}
}