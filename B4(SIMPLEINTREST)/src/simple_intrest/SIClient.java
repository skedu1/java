package simple_intrest;

import java.rmi.*;
import java.util.Scanner;

public class SIClient {
    public static void main(String[] args) {
        try {
            SI simpleInterest = (SI) Naming.lookup("rmi://localhost/SimpleInterestService");
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter rate of interest: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter time period (in years): ");
            double time = scanner.nextDouble();
            
            double interest = simpleInterest.calculateSimpleInterest(principal, rate, time);
            
            System.out.println("Simple Interest: " + interest);
        } catch (Exception e) {
            System.err.println("Simple Interest client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}