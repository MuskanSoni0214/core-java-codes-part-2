import java.io.*;
class Customer implements Serializable
{
String custID;
String name;
String phno;

static int count=1;
Customer(){}
Customer(String n,String p)
{
custID="C"+count;
count++;
name=n;
phno=p;
}

public String toString()
{
return "Customer ID: "+custID+
       " Customer name: "+name+
       " Customer phno: "+phno;
}
}

public class ObjectStreamEx
{


/*public static void main(String[]args)throws Exception
{

Customer list[]={new Customer("Smith","7541237541"),new Customer("John","8541238541"),new Customer("Alice","9541239541"),new Customer("Shaen","7841237841")};

FileOutputStream fos = new FileOutputStream("F:/Study/Abdul Bari/ObjectEx.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);

oos.writeInt(list.length);
for(Customer c:list)
    oos.writeObject(c);
fos.close();
oos.close();
}*/

public static void main(String[]args)throws Exception
{

java.util.Scanner sc  = new java.util.Scanner(System.in);

FileInputStream fis = new FileInputStream("F:/Study/Abdul Bari/ObjectEx.txt");
ObjectInputStream ois = new ObjectInputStream(fis);

int length=ois.readInt();
Customer list[]=new Customer[length];

for(int i=0;i<length;i++)
{
list[i]=(Customer)ois.readObject();
}
System.out.println("Enter Name of Customer");
String name=sc.nextLine();
for(int i=0;i<length;i++)
{
if(name.equalsIgnoreCase(list[i].name))
    System.out.println(list[i]);
}
fis.close();
ois.close();
}

}