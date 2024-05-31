
package Service.Implementation;

import Dao.StockDao;
import Model.Stock;
import Service.StockService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class StockServiceIMP extends UnicastRemoteObject implements StockService{

    public StockServiceIMP() throws RemoteException{
    }
    StockDao dao = new StockDao();
    @Override
    public Stock addStock(Stock stocks) throws RemoteException {
       return dao.recordStocks(stocks);
    }

    @Override
    public Stock editStock(Stock stocks) throws RemoteException {
        return dao.updateStocks(stocks);
    }

    @Override
    public Stock removeStock(Stock stocks) throws RemoteException {
        return dao.deleteStocks(stocks);
    }

    @Override
    public Stock findStock(Stock stocks) throws RemoteException {
       return dao.searchStocks(stocks);
    }

    @Override
    public List<Stock> allStock() throws RemoteException {
        return dao.displayStocks();
    }
    
}
