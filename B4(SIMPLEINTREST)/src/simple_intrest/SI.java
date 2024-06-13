package simple_intrest;

import java.rmi.*;
public interface SI extends Remote 
{
    double calculateSimpleInterest(double principal, double rate, double time) throws RemoteException;
}