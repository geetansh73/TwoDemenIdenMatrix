import java.util.*;
class smatrex
{
  int identical(int arr[][],int arr1[][])
    {
int flag=0;
if (arr.length!=arr1.length)
{
System.out.println("row length not equal");
return 0;
}
for(int v=0;v<arr.length;v++)
{
if (arr[v].length!=arr1[v].length)
{
System.out.println("column length not equal");
return 0;
}
}
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
if (arr[i][j]==arr1[i][j])
{
flag=1;
}
else
{
    flag=0;
    return flag;
}
}
}
return flag;
}

public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=sc.nextInt();
}
}
for(int m=0;m<arr1.length;m++)
{
for(int n=0;n<arr1[m].length;n++)
{
arr1[m][n]=sc.nextInt();
}
}
smatrex obj=new smatrex();
int u=obj.identical(arr,arr1);
System.out.println(u);
}
}