import java.io.*;
public class ByteInput
{
public static void main(String[]args) throws Exception
{
byte b[]={'a','b','c','d','e','f','g','h','i','j'};
ByteArrayInputStream bis = new ByteArrayInputStream(b);
int x;
while((x=bis.read())!=-1)
{
System.out.println((char)x);
}
bis.close();

}
}