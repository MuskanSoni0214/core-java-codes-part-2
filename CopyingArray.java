class CopyingArray
{
public static void main(String[]args)
{
int arr1[]={1,2,3,4,5,6,7,8,9,10};
int arr2[]=new int[10];
for(int i=arr1.length-1,j=0;i>=0;i--,j++)
{
arr2[j]=arr1[i];
}

for(int i : arr2)
{

    System.out.print(arr2[i]+",");
}

System.out.println();
}


}