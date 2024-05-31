
package Service;

import Model.SiteManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface SiteManagerService extends Remote{
    SiteManager addSiteManager(SiteManager siteM) throws RemoteException;
    SiteManager editSiteManager(SiteManager siteM) throws RemoteException;
    SiteManager removeSiteManager(SiteManager siteM) throws RemoteException;
    SiteManager findSiteManager(SiteManager siteM) throws RemoteException;
    List<SiteManager> allSiteManager() throws RemoteException;
    
}
