import java.io.*;
class Student
{
int rollno;
String name;
String dept;
}
public class PrintStreamDemo
{
public static void main(String[]args)throws Exception
{
FileOutputStream fos = new FileOutputStream("F:/Study/Abdul Bari/Student1.txt");
PrintStream ps = new PrintStream(fos);
Student s = new Student();
s.rollno = 51;
s.name = "Muskan";
s.dept = "CSE";
ps.println(s.rollno);
ps.println(s.name);
ps.println(s.dept);
ps.close();
fos.close();
}
}