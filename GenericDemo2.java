
@SuppressWarnings("unchecked")
public class GenericDemo2
{
static <E> void show(E...list)
{
for(E x:list)
{
System.out.println(x);
}
}
public static void main(String[]args)
{
show("Hi","Go","Bye");
show(new Integer[]{19,20,30,40});
}
}