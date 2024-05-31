
package Service;

import Model.Institution;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface InstitutionService extends Remote{
    Institution addInstitution(Institution institutions) throws RemoteException;
    Institution editInstitution(Institution institutions) throws RemoteException;
    Institution removeInstitution(Institution institutions) throws RemoteException;
    Institution findInstitution(Institution institutions) throws RemoteException;
    List<Institution> allInstitution() throws RemoteException;
    
}
