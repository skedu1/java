package simple_intrest;

import java.rmi.*;
import java.rmi.registry.*;

public class SIServer {
    public static void main(String[] args) {
        try {
            SI simpleInterest = new SIQuery();
            
            LocateRegistry.createRegistry(1099);
            
            Naming.rebind("SimpleInterestService", simpleInterest);
            
            System.out.println("Simple Interest server is running...");
        } catch (Exception e) {
            System.err.println("Simple Interest service exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}