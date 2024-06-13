package income_tax;

import java.rmi.*;
import java.rmi.server.*;
public class SearchQuery extends UnicastRemoteObject
                         implements Tax
{

    SearchQuery() throws RemoteException
    {
        super();
    }
 
    public String query(int salary) throws RemoteException {
    double result = 0.0;

    if (salary <= 300000) {
        result = 0;
    } else if (salary >= 300001 && salary <= 600000) {
        result = (salary) * 0.05;
    } else if (salary >= 600001 && salary <= 900000) {
        result =(salary) * 0.10;  
    } else if (salary >= 900001 && salary <= 1200000) {
        result =(salary) * 0.15;
    } else if (salary >= 1200001 && salary <= 1500000) {
        result =(salary) * 0.20;
    } else {
        result =(salary) * 0.30;
    }

    return Double.toString(result);
}
}