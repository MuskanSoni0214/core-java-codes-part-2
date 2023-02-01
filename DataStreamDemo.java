 import java.io.*;

class Student
{
int rollno;
String name;
String dept;
}

public class DataStreamDemo
{
public static void main(String[]args)throws Exception
{
/*
FileOutputStream fos=new FileOutputStream("F:\\Study\\Abdul Bari\\Student2.txt");
DataOutputStream dos=new DataOutputStream(fos);
Student s =new Student();
s.rollno=10;
s.name="JOHN";
s.dept="CSE";

dos.writeInt(s.rollno);
dos.writeUTF(s.name);
dos.writeUTF(s.dept);*/

FileInputStream fis=new FileInputStream("F:\\Study\\Abdul Bari\\Student2.txt");
DataInputStream dis=new DataInputStream(fis);
Student s = new Student();

s.rollno = dis.readInt();
s.name = dis.readUTF();
s.dept=dis.readUTF();

System.out.println("Roll no "+s.rollno);

System.out.println("Name "+s.name);

System.out.println("Department "+s.dept);

dis.close();
fis.close();

}
}