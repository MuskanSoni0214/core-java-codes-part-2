
class VariableArgs
{

static int max(int...args)
{
int max=args[0];
for(int i=1;i<args.length;i++)
{
if(args[i]>max)
max=args[i];
}
return max;
}

static int sum(int...args)
{
int sum=0;
for(int i=0;i<args.length;i++)
{
sum+=args[i];
}
return sum;
}

public static void main(String[]args)
{
System.out.println(max(2,3,21,345,454,323));
System.out.println(sum(1,2,3));
}
}