
package Service;

import Model.Deployment;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface DeploymentService extends Remote{
     Deployment addDeployment(Deployment dep) throws RemoteException;
    Deployment editDeployment(Deployment dep) throws RemoteException;
    Deployment removeDeployment(Deployment dep) throws RemoteException;
    Deployment findDeployment(Deployment dep) throws RemoteException;
    List<Deployment> allDeployment() throws RemoteException;
    
}
