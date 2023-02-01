import java.io.*;
public class FileHandling
{
public static void main(String[]args)throws Exception
{
File f = new File("F://Study//Abdul Bari//TumHum.txt");
// f.setReadOnly();
f.setWritable(true);
FileOutputStream fos = new FileOutputStream("F://Study//Abdul Bari//TumHum.txt");


/*
File f = new File("F://Study//Abdul Bari");
System.out.println(f.isDirectory());

String list[]=f.list();
for(String x:list)
{
System.out.println(x);
}

File list[]=f.listFiles();
for(File x:list)
{
System.out.print(x.getName()+" ");
System.out.println(x.getPath());
}*/

}
}