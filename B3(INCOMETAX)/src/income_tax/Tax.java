package income_tax;

import java.rmi.*;
public interface Tax extends Remote
{
public String query(int search) throws RemoteException;
}