import java.util.*;
public class ListDemo
{
public static void main(String[]args)
{
// ArrayList<Integer> ar1 = new ArrayList<>(20);
// ArrayList<Integer> ar2 = new ArrayList<>(List.of(500,600,700,800,900));

LinkedList<Integer> ar1 = new LinkedList<>();
LinkedList<Integer> ar2 = new LinkedList<>(List.of(500,600,700,800,900));
ar1.add(10);
ar1.add(0,5);
ar1.addAll(1,ar2);
ar1.add(1,10);
System.out.println(ar1.contains(50));
System.out.println(ar1.contains(500));
System.out.println(ar1.get(5));
System.out.println(ar1.indexOf(10));
System.out.println(ar1.lastIndexOf(10));
ar1.set(6,1000);
//System.out.println(ar1);

/*Iterator<Integer> it=ar1.iterator();
ListIterator<Integer> it=ar1.listIterator();

while(it.hasNext())
{
System.out.println(it.next());
}

for(ListIterator<Integer> it=ar1.listIterator();it.hasNext();)
{
System.out.println(it.next());
}

ar1.forEach(n->System.out.println(n));
ar1.forEach(System.out::println);*/

ar1.addFirst(3);
ar1.addLast(300);
ar1.forEach(n->show(n));


}

static void show(int n)
{
//if(n>500)
System.out.println(n);
}
}