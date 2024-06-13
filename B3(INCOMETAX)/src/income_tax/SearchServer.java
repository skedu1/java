package income_tax;

import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer {
    public static void main(String args[]) {
            try
            {           
                Tax obj = new SearchQuery();

                LocateRegistry.createRegistry(1900);

                Naming.rebind("rmi://localhost:1900" + "/udupi",obj);
                        
                System.out.println("Income Tax server is running...");
            }
            catch(Exception se)
            {
                System.out.println(se);
            }
}
}