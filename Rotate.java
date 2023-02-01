c lass Rotate
{
public static void main(String[]args)
{
int arr[]={3,5,6,7,8,9,10,11,12};
for(int i:arr)
{
System.out.print(i+",");
}
System.out.println(); 

int temp = arr[arr.length-1];
for(int i=arr.length-1;i>0;i--)
{
arr[i]=arr[i-1];
}
arr[0]=temp;

for(int i:arr)
{
System.out.print(i+",");
}
}
}