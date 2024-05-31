
package Model;

import java.io.Serializable;
import java.util.Date;
public class SiteManager implements Serializable{

private static final long serialVersionUID = -6533824695884450820L;

private Integer id;
private String name;
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
