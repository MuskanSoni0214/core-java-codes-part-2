import java.util.*;
public class ArrayDequeDemo
{
public static void main(String[]args)
{
ArrayDeque<Integer> dq=new ArrayDeque<>();
dq.offerLast(10);
dq.offerLast(20);
dq.offerLast(30);
dq.offerLast(40);
dq.offerLast(50);
dq.offerLast(60);

dq.forEach((x)->System.out.print(x+" "));
System.out.println();

dq.offerFirst(1);
dq.offerFirst(2);
dq.offerFirst(3);
dq.offerFirst(4);
dq.offerFirst(5);
dq.offerFirst(6);

dq.forEach((x)->System.out.print(x+" "));
System.out.println();

dq.pollFirst();
dq.pollFirst();
dq.pollFirst();

dq.forEach((x)->System.out.print(x+" "));
System.out.println();

dq.pollLast();
dq.pollLast();
dq.pollLast();

dq.forEach((x)->System.out.print(x+" "));
System.out.println();

}
}