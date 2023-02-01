class Super
{
public void display()
{
System.out.println("Hello");
}
}

class Sub extends Super
{
public void display()
{
System.out.println("Hello World");
}
}

class Overriding
{
public static void main(String[]args)
{
Super s1 = new Super();
s1.display();
Sub s2 = new Sub();
s2.display();
Super s3= new Sub();
s3.display();
}
}