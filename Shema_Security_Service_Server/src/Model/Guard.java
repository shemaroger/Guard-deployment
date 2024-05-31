
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Guard implements Serializable{
@Id
@Column(name="guard_id")
private String guardId;
private String guard_name;
private String birth_date;
private String gender;
private String phone_number; 
@ManyToOne
@JoinColumn(name="site_id")
private Site site;
@OneToOne(mappedBy = "guard")
private Deployment depoyment;
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
      name = ("guard_stock"),
      joinColumns = @JoinColumn(name = "guard_id"),
      inverseJoinColumns = @JoinColumn(name = "stock_id")
)
private Set<Stock> stock;
private Date createdDate = new Date();

    public Guard() {
    }

    public Guard(String guardId) {
        this.guardId = guardId;
    }

    public Guard(String guardId, String guard_name, String birth_date, String gender, String phone_number, Site site, Deployment depoyment, Set<Stock> stock) {
        this.guardId = guardId;
        this.guard_name = guard_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.phone_number = phone_number;
        this.site = site;
        this.depoyment = depoyment;
        this.stock = stock;
    }

    public String getGuardId() {
        return guardId;
    }

    public void setGuardId(String guardId) {
        this.guardId = guardId;
    }

    public String getGuard_name() {
        return guard_name;
    }

    public void setGuard_name(String guard_name) {
        this.guard_name = guard_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Deployment getDepoyment() {
        return depoyment;
    }

    public void setDepoyment(Deployment depoyment) {
        this.depoyment = depoyment;
    }

    public Set<Stock> getStock() {
        return stock;
    }

    public void setStock(Set<Stock> stock) {
        this.stock = stock;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
