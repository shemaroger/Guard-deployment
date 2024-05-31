
package Dao;

import Model.Deployment;
import java.util.List;
import org.hibernate.Session;


public class DeploymentDao {
    public Deployment recordDeployments(Deployment deploymentObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(deploymentObj);
            ss.beginTransaction().commit();
            ss.close();
            return deploymentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Deployment updateDeployments(Deployment deploymentObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(deploymentObj);
            ss.beginTransaction().commit();
            ss.close();
            return deploymentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Deployment deleteDeployments(Deployment deploymentObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(deploymentObj);
            ss.beginTransaction().commit();
            ss.close();
            return deploymentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Deployment searchDeployments(Deployment deploymentObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Deployment deployments = (Deployment) ss.get(Deployment.class, deploymentObj.getId());
            ss.close();
            return deployments;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Deployment> displayDeployments(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Deployment> theDeployments = ss.createQuery("SELECT deployment FROM Deployment deployment").list();
            ss.close();
            return theDeployments;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
