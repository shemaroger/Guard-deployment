
package Service.Implementation;

import Dao.LoginDao;
import Model.Login;
import Service.LoginsService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class LoginServiceIMP extends UnicastRemoteObject implements LoginsService{

    public LoginServiceIMP() throws RemoteException{
        
    }
    LoginDao dao = new LoginDao();
     
    @Override
    public Login adminLogin(String email, String password, String role) throws RemoteException {
        return dao.userLogin(email, password, role);
    }

    @Override
    public Login createAccount(Login log) throws RemoteException {
        return dao.makeAccount(log);
    }

}
