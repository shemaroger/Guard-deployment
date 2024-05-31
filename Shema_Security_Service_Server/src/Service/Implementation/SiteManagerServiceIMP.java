
package Service.Implementation;

import Dao.SiteManagerDao;
import Model.SiteManager;
import Service.SiteManagerService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class SiteManagerServiceIMP extends UnicastRemoteObject implements SiteManagerService{

    public SiteManagerServiceIMP() throws RemoteException{
    }
   SiteManagerDao dao = new SiteManagerDao();
    @Override
    public SiteManager addSiteManager(SiteManager siteM) throws RemoteException {
        return dao.recordSiteManagers(siteM);
    }

    @Override
    public SiteManager editSiteManager(SiteManager siteM) throws RemoteException {
        return dao.updateSiteManagers(siteM);
    }

    @Override
    public SiteManager removeSiteManager(SiteManager siteM) throws RemoteException {
       return dao.deleteSiteManagers(siteM);
    }

    @Override
    public SiteManager findSiteManager(SiteManager siteM) throws RemoteException {
        return dao.searchSiteManagers(siteM);
    }

    @Override
    public List<SiteManager> allSiteManager() throws RemoteException {
        return dao.displaySiteManagers();
    }
    
    
}
