
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class SiteManager implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="manager_id")
private Integer id;
private String name;
@OneToOne(mappedBy = "site_manager")
private Site site;
private Date created_date = new Date();

    public SiteManager() {
    }

    public SiteManager(Integer id) {
        this.id = id;
    }

    public SiteManager(Integer id, String name, Site site) {
        this.id = id;
        this.name = name;
        this.site = site;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

  
    
}
