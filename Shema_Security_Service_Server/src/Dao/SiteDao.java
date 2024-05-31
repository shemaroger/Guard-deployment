
package Dao;

import Model.Site;
import java.util.List;
import org.hibernate.Session;


public class SiteDao {
    public Site recordSites(Site siteObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(siteObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Site updateSites(Site siteObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(siteObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Site deleteSites(Site siteObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(siteObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Site searchSites(Site siteObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Site sites = (Site) ss.get(Site.class, siteObj.getId());
            ss.close();
            return sites;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Site> displaySites(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Site> theSites = ss.createQuery("SELECT site FROM Site site").list();
            ss.close();
            return theSites;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
