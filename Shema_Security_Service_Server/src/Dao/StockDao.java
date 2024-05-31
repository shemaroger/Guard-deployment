
package Dao;

import Model.Stock;
import java.util.List;
import org.hibernate.Session;


public class StockDao {
    public Stock recordStocks(Stock stockObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(stockObj);
            ss.beginTransaction().commit();
            ss.close();
            return stockObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Stock updateStocks(Stock stockObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(stockObj);
            ss.beginTransaction().commit();
            ss.close();
            return stockObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Stock deleteStocks(Stock stockObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(stockObj);
            ss.beginTransaction().commit();
            ss.close();
            return stockObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Stock searchStocks(Stock stockObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Stock stocks = (Stock) ss.get(Stock.class, stockObj.getStockId());
            ss.close();
            return stocks;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Stock> displayStocks(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Stock> theStocks = ss.createQuery("SELECT stock FROM Stock stock").list();
            ss.close();
            return theStocks;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
