enum Dept
{


/*CS,IT,CIVIL,ECE;
private Dept()
{
System.out.println(this.name());
}
public void display()
{
System.out.println(this.name()+" "+this.ordinal());
}*/

 CS("Believer","Block B"),IT("Smiley","Block S"),CIVIL("Rishabh","Block R"),ECE("Sakshi","Block K");
 String head;
String location;
 private Dept(String head,String loc)
{
this.head=head;
this.location=loc;
}
public String getHeadName()
{
return head;
}
public String getLocation()
{
return location;
}

}

public class EnumDemo
{
public static void main(String[]args)
{
Dept d = Dept.CIVIL; 
System.out.println(d.getHeadName());
System.out.println(d.getLocation());

/*System.out.println(d.ordinal());
System.out.println(Dept.valueOf("IT"));
Dept list[]=Dept.values();
for(Dept x:list)
System.out.println(x);

switch(d)
{
case CS:System.out.println("Head: Believer \nBlock: B");
        break;
case IT:System.out.println("Head: Smiley \nBlock: S");
        break;
case CIVIL:System.out.println("Head: Rishabh \nBlock: R");
        break;
case ECE:System.out.println("Head: Sakshi \nBlock: S");
        break;
}
d.display();*/


}
}