
package Service.Implementation;

import Dao.DeploymentDao;
import Model.Deployment;
import Service.DeploymentService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class DeploymentServiceIMP extends UnicastRemoteObject implements DeploymentService{

    public DeploymentServiceIMP() throws RemoteException{
    }
    DeploymentDao dao = new DeploymentDao();
    @Override
    public Deployment addDeployment(Deployment dep) throws RemoteException {
       return dao.recordDeployments(dep);
    }

    @Override
    public Deployment editDeployment(Deployment dep) throws RemoteException {
        return dao.updateDeployments(dep);
    }

    @Override
    public Deployment removeDeployment(Deployment dep) throws RemoteException {
    return dao.deleteDeployments(dep);
    }

    @Override
    public Deployment findDeployment(Deployment dep) throws RemoteException {
       return dao.searchDeployments(dep);
    }

    @Override
    public List<Deployment> allDeployment() throws RemoteException {
       return dao.displayDeployments();
    }
    
}
