import java.util.Scanner;
public class Arraysearch
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System .out.print("Enter the number of elements in the array:");
int n=scanner.nextInt();
int[] array=new int[n];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
array[i]=scanner.nextInt();
}
System.out.print("Enter the elements to search for:");
int target=scanner.nextInt();
int index=-1;
for(int i=0;i<array.length;i++)
{
if(array[i]==target)
{
index=i;
break;
}
}
if(index!=-1)
{
System.out.println("Enter found at index"+index);
}
else
{
System.out.println("Element not foun d in the array");
}
scanner.close();
}
}
