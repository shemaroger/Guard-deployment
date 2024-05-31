
package Service;

import Model.Guard;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface GuardService extends Remote{
     Guard addGuard(Guard guards) throws RemoteException;
    Guard editGuard(Guard guards) throws RemoteException;
    Guard removeGuard(Guard guards) throws RemoteException;
    Guard findGuard(Guard guards) throws RemoteException;
    List<Guard> allGuard() throws RemoteException;
    
}
