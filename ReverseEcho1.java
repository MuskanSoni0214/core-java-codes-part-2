package reverseecho;

import java.net.*;
import java.io.*;
public class ReverseEcho1 extends Thread
{
Socket stk;
public ReverseEcho1(Socket st)
{
stk=st;
}
public void run()
{
try
{
BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
PrintStream ps=new PrintStream(stk.getOutputStream());
String msg;
do{
msg=br.readLine();
StringBuilder sb = new StringBuilder(msg);
sb.reverse();
msg=sb.toString();
ps.println(msg);
}while(!msg.equals("dne"));
stk.close();
}
catch(Exception e){}
}
public static void main(String []args) throws Exception
{
ServerSocket ss = new ServerSocket(2000);
Socket stk;
int count=1;
ReverseEcho1 re;
do{
stk=ss.accept();
System.out.println("Client connected :"+count++);
re=new ReverseEcho1(stk);
re.start();

}while(true);

}
}

class Client1
{
public static void main(String []args) throws Exception
{
Socket stk =new Socket("localhost",2000);
BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
PrintStream ps=new PrintStream(stk.getOutputStream());
String msg;
do{
msg=keyb.readLine();
ps.println(msg);
msg=br.readLine();
System.out.println("From Server "+msg);
}while(!msg.equals("dne"));
stk.close();
}
}