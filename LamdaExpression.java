@FunctionalInterface
interface MyLamda
{
public void display(String s);
}

public class LamdaExpression
{

    public LamdaExpression(String s){
        System.out.println(s.toUpperCase());
    }

// public void reverse(String str)
// {
// StringBuffer sb = new StringBuffer(str);
// sb.reverse();
// System.out.println(sb);
// }
public static void main(String [] args)
{
// MyLamda m = System.out::println;
// m.display("Oooo its magic");

// MyLamda m1 = LamdaExpression::reverse;
// m1.display("inoS naksuM");

// LamdaExpression le = new LamdaExpression();
// MyLamda m3 = le::reverse;
// m3.display("Fuck Off!");

MyLamda m4 = LamdaExpression::new;
m4.display("muski chuski thuski");
}
}