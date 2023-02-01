import java.io.*;
public class OutputStream
{
public static void main(String[]args)
{
/*try(FileInputStream fis = new FileInputStream("F:/Study/Abdul Bari/TumHum.txt"))
{
byte b[]=new byte[fis.available()];
fis.read(b);
String str= new String(b);
System.out.println(str);
}*/

/*try(FileInputStream fis = new FileInputStream("F:/Study/Abdul Bari/TumHum.txt"))
{
int x;
do
{
x=fis.read();
if(x!=-1)
System.out.print((char)x);
}while(x!=-1);
}*/


try(FileReader fr = new FileReader("F:/Study/Abdul Bari/TumHum.txt"))
{
int x;
do
{
x=fr.read();
if(x!=-1)
System.out.print((char)x);
}while(x!=-1);
}

catch(Exception e)
{
System.out.println(e);
}

}
}