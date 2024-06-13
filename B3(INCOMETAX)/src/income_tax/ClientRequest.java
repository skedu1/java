package income_tax;

import java.rmi.*;
import java.util.Scanner;
public class ClientRequest
{
public static void main(String args[])
{
String answer;
try
{
                    System.out.print("Please input salary : ");
                    Scanner sc=new Scanner(System.in);
                    int sal=sc.nextInt();
                    
Tax access =(Tax)Naming.lookup("rmi://localhost:1900" + "/udupi");
answer = access.query(sal);
System.out.println("The calculated tax for the salary of " + sal +" is " + answer+" ");
}
catch(Exception se)
{
System.out.println(se);
}
}
}