import java.io.*;
public class CopyingFiles
{
public static void main(String[]args) throws Exception
{
FileInputStream fis = new FileInputStream("F:/Study/Abdul Bari/FileReader.txt");
FileOutputStream fos = new FileOutputStream("F:/Study/Abdul Bari/Extract.txt");

int b;
while((b=fis.read())!=-1)
{
if(b>=65 && b<=90)fos.write(b+32);
else fos.write(b);
}
fis.close();
fos.close();
}
}