
package Controller;

import Service.Implementation.DeploymentServiceIMP;
import Service.Implementation.GuardServiceIMP;
import Service.Implementation.InstitutionServiceIMP;
import Service.Implementation.LoginServiceIMP;
import Service.Implementation.SiteManagerServiceIMP;
import Service.Implementation.SiteServiceIMP;
import Service.Implementation.StockServiceIMP;
import Service.InstitutionService;
import Service.SiteManagerService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(5001);
            theRegistry.rebind("siteM", new SiteManagerServiceIMP());
            theRegistry.rebind("guards", new GuardServiceIMP());
            theRegistry.rebind("sites", new SiteServiceIMP());
            theRegistry.rebind("stocks", new StockServiceIMP());
            theRegistry.rebind("institutions", new InstitutionServiceIMP());
            theRegistry.rebind("dep", new DeploymentServiceIMP());
            theRegistry.rebind("log", new LoginServiceIMP());
            System.out.println("Server is running on port 5001");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 
}
