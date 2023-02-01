import java.io.*;

public class IOClass
{
public static void main(String[]args)
{

try
{
FileOutputStream fos = new FileOutputStream("F:/Study/Abdul Bari/TumHum.txt");
String str = "My name is Muskan Soni.";
fos.write(str.getBytes());
fos.close();
}

catch(FileNotFoundException e)
{
System.out.println(e);
}

catch(IOException e)
{
System.out.println(e);
}

}
}
