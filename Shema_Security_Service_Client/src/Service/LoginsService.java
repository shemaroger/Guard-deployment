
package Service;

import Model.Login;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface LoginsService extends Remote{
    Login createAccount(Login log) throws RemoteException;
    Login adminLogin(String email, String password, String role) throws RemoteException;
}
