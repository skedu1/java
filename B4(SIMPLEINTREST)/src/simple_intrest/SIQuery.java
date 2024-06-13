SIQuery:
package simple_intrest;

import java.rmi.*;
import java.rmi.server.*;

public class SIQuery extends UnicastRemoteObject implements SI {
    public SIQuery() throws RemoteException {
        super();
    }

    @Override
    public double calculateSimpleInterest(double principal, double rate, double time) throws RemoteException {
        return (principal * rate * time) / 100.0;
    }
}