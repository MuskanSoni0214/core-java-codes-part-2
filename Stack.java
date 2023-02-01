class StackOverFlow extends Exception
{
public String toString()
{
return "Stack is Full";
}
}
class StackUnderFlow extends Exception
{
public String toString()
{
return "Stack is Empty";
}
}

class Stackk
{
private int size;
private int top = -1;
private int s[];
public Stackk(int sz)
{
size=sz;
s=new int [sz];
}

public void push(int x) throws StackOverFlow
{
if(top==size-1)
  throw new StackOverFlow();
top++;
s[top]=x;
}

public int pop() throws StackUnderFlow
{
int x=-1;
if(top==-1)  
  throw new StackUnderFlow();
x=s[top];
top--;
return x;
}
}

public class Stack
{
public static void main(String[]args)
{
Stackk st = new Stackk(5);
try
{
st.push(10);
st.push(11);
st.push(12);
st.push(13);
st.push(14);
st.push(15);
}
catch(StackOverFlow s)
{
System.out.println(s);
}
}
}