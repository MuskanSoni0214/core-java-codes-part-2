import java.util.*;
import java.util.Map.*;
public class MapDemo
{
public static void main(String[]args)
{
TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
tm.put(4,"E");
tm.put(6,"G");
System.out.println(tm.ceilingEntry(5).getValue());
System.out.println(tm.get(3));
System.out.println(tm);

Entry<Integer,String> e=tm.firstEntry();
System.out.println(e.getKey()+" "+e.getValue());
}
}