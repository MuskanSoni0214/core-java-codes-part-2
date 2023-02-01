class SingletonClass
{
private float coffeeQty;
private float waterQty;
static private SingletonClass our = null;
private SingletonClass()
{
coffeeQty = 1;
waterQty = 1;
}
static public SingletonClass getInstance()
{
if(our==null)
our= new SingletonClass();
return our;
}
public static void main(String[]args)
{
SingletonClass c = SingletonClass.getInstance();
System.out.println(c);
}
}