import java.util.*;

class My implements Comparator<Integer>
{
public int compare(Integer i1,Integer i2)
{
if(i1<i2)
return 1;
if(i1>i2)
return -1;
return 0;
}
}

public class ComparatorDemo
{
public static void main(String[]args)
{
/*int a[]={2,4,6,8,1,3,5,7};
int b[]={2,4,6,8,1,3,5,7};

System.out.println(Arrays.compare(a,b));

int c[]=Arrays.copyOf(a,a.length);
Arrays.fill(c,10);
Arrays.sort(c);
for(int x:c)
System.out.print(x+" ");
System.out.println(Arrays.binarySearch(c,2));*/

Integer a[]={2,4,8,1,3,5,7};
Arrays.sort(a,new My());
for(Integer x:a)
System.out.println(x);

}
}