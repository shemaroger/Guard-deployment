
package Service;

import Model.Stock;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface StockService extends Remote{
     Stock addStock(Stock stocks) throws RemoteException;
    Stock editStock(Stock stocks) throws RemoteException;
    Stock removeStock(Stock stocks) throws RemoteException;
    Stock findStock(Stock stocks) throws RemoteException;
    List<Stock> allStock() throws RemoteException;
    
}
