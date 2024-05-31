
package Dao;

import Model.Institution;
import java.util.List;
import org.hibernate.Session;


public class InstitutionDao {
    public Institution recordInstitutions(Institution institutionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(institutionObj);
            ss.beginTransaction().commit();
            ss.close();
            return institutionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Institution updateInstitutions(Institution institutionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(institutionObj);
            ss.beginTransaction().commit();
            ss.close();
            return institutionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Institution deleteInstitutions(Institution institutionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(institutionObj);
            ss.beginTransaction().commit();
            ss.close();
            return institutionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Institution searchInstitutions(Institution institutionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Institution institutions = (Institution) ss.get(Institution.class, institutionObj.getId());
            ss.close();
            return institutions;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Institution> displayInstitutions(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Institution> theInstitutions = ss.createQuery("SELECT intitution FROM Institution intitution").list();
            ss.close();
            return theInstitutions;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
