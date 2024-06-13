import java.util.*;
class parta2
{
    public static void main(String args[]) 
    {
    System.out.println("Enter number of element:");
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    Integer[] numbers=new Integer[n];
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++)
    numbers[i]=sc.nextInt();
    Arrays.sort(numbers);
    System.out.println("second largest number is :"+ numbers[n-2]);
    System.out.println("second smallest number is :"+ numbers[1]);

    }
}