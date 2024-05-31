
package Dao;

import Model.Login;
import org.hibernate.Query;
import org.hibernate.Session;


public class LoginDao {
    
    public Login userLogin(String email, String password, String role){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM Login WHERE email= :email AND password= :password AND role= :role";
            Query query = ss.createQuery(hql);
            query.setParameter("email", email);
            query.setParameter("password", password);
            query.setParameter("role", role);
            Login user = (Login) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
 public Login makeAccount(Login loginObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(loginObj);
            ss.beginTransaction().commit();
            ss.close();
            return loginObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
