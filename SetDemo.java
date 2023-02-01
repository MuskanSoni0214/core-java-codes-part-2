import java.util.*;
public class SetDemo
{
public static void main(String[]args)
{
/*HashSet<Integer> hs= new HashSet<>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(10);
System.out.println(hs);*/

TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
ts.add(25);
System.out.println(ts.ceiling(55));
System.out.println(ts);

}
}