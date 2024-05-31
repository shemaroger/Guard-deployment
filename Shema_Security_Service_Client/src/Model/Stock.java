
package Model;

import java.io.Serializable;
import java.util.*;

public class Stock implements Serializable{
private static final long serialVersionUID = -5931468759365329245L;
private Integer stockId;
private String name;
private Integer quantity;
private Set<Guard> guard = new HashSet<>();
private Date deployDate = new Date();

    public Stock() {
    }

    public Stock(Integer stockId) {
        this.stockId = stockId;
    }

    public Stock(Integer stockId, String name, Integer quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Guard> getGuard() {
        return guard;
    }

    public void setGuard(Set<Guard> guard) {
        this.guard = guard;
    }

    public Date getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }

    @Override
    public String toString() {
        return name;
    }

}
