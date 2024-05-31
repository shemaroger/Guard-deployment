
package Service.Implementation;

import Dao.SiteDao;
import Model.Site;
import Service.SiteService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class SiteServiceIMP extends UnicastRemoteObject implements SiteService{

    public SiteServiceIMP() throws RemoteException{
    }
    SiteDao dao = new SiteDao();
    @Override
    public Site addSite(Site sites) throws RemoteException {
        return dao.recordSites(sites);
    }

    @Override
    public Site editSite(Site sites) throws RemoteException {
        return dao.updateSites(sites);
    }

    @Override
    public Site removeSite(Site sites) throws RemoteException {
        return dao.deleteSites(sites);
    }

    @Override
    public Site findSite(Site sites) throws RemoteException {
       return dao.searchSites(sites);
    }

    @Override
    public List<Site> allSite() throws RemoteException {
        return dao.displaySites();
    }
}
