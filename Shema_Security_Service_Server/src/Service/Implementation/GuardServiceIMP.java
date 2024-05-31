
package Service.Implementation;

import Dao.GuardDao;
import Model.Guard;
import Service.GuardService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class GuardServiceIMP extends UnicastRemoteObject implements GuardService{

    public GuardServiceIMP() throws RemoteException{
    }
     GuardDao dao = new GuardDao();
    @Override
    public Guard addGuard(Guard guards) throws RemoteException {
       return dao.recordGuards(guards);
    }

    @Override
    public Guard editGuard(Guard guards) throws RemoteException {
        return dao.updateGuards(guards);
    }

    @Override
    public Guard removeGuard(Guard guards) throws RemoteException {
       return dao.deleteGuards(guards);
    }

    @Override
    public Guard findGuard(Guard guards) throws RemoteException {
        return dao.searchGuards(guards);
    }

    @Override
    public List<Guard> allGuard() throws RemoteException {
       return dao.displayGuards();
    }
    
}
