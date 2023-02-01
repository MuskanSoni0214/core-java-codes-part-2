class FinalKeyword
{
final int N = 1;
final int N1;
static final int N2;
final int N3;
{
N1=10;
}
static
{
N2=15;
}
public FinalKeyword()
{
N3=16;
}
public void print()
{
System.out.println(this.N+" "+this.N1+" "+N2+" "+this.N3);
}
public static void main(String[]args)
{
FinalKeyword f = new FinalKeyword();
f.print();
}
}