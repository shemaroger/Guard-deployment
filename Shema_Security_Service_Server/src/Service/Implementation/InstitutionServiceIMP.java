
package Service.Implementation;

import Dao.InstitutionDao;
import Model.Institution;
import Service.InstitutionService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import sun.rmi.server.UnicastRef2;

public class InstitutionServiceIMP extends UnicastRemoteObject implements InstitutionService{

    public InstitutionServiceIMP() throws RemoteException{
    }
     InstitutionDao dao = new InstitutionDao();
    @Override
    public Institution addInstitution(Institution institutions) throws RemoteException {
       return dao.recordInstitutions(institutions);
    }

    @Override
    public Institution editInstitution(Institution institutions) throws RemoteException {
    return dao.updateInstitutions(institutions);
    }

    @Override
    public Institution removeInstitution(Institution institutions) throws RemoteException {
       return dao.deleteInstitutions(institutions);
    }

    @Override
    public Institution findInstitution(Institution institutions) throws RemoteException {
        return dao.searchInstitutions(institutions);
    }

    @Override
    public List<Institution> allInstitution() throws RemoteException {
      return dao.displayInstitutions();
    }
    
}
