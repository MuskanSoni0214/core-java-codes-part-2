import java.io.*;
public class BufferDemo
{
public static void main(String[]args) throws Exception
{
/*FileInputStream fis = new FileInputStream("F:/Study/Abdul Bari/TumHum.txt");
BufferedInputStream bis = new BufferedInputStream(fis);*/
/*int x;
while((x=bis.read())!=-1)
{
System.out.print((char)x);
}*/

FileReader fis = new FileReader("F:/Study/Abdul Bari/TumHum.txt");
BufferedReader bis = new BufferedReader(fis);

/*System.out.print((char)bis.read());
System.out.print((char)bis.read());
System.out.print((char)bis.read());
bis.mark(10);
System.out.print((char)bis.read());
System.out.print((char)bis.read());
bis.reset();
System.out.print((char)bis.read());
System.out.print((char)bis.read());*/

System.out.println(bis.readLine());

}
}