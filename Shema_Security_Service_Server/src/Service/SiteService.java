
package Service;

import Model.Site;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface SiteService extends Remote{
     Site addSite(Site sites) throws RemoteException;
    Site editSite(Site sites) throws RemoteException;
    Site removeSite(Site sites) throws RemoteException;
    Site findSite(Site sites) throws RemoteException;
    List<Site> allSite() throws RemoteException;
}
