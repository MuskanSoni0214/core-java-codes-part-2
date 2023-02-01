class CommandPromp
{
public static void main(String[]args)
{
double s=0;
for(int i=0;i<args.length;i++)
{
s+=Double.parseDouble(args[i]);
}
System.out.println(s);
}
}