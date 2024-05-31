
package Model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Site implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="site_id")
    private Integer id;
    private String siteName;
    @OneToOne
    @JoinColumn(name="manager_id")
    private SiteManager site_manager;
    @OneToMany(mappedBy = "site")
    private List<Institution> institution = new ArrayList<>();
    @OneToMany(mappedBy = "site")
    private List<Guard> guard = new ArrayList<>();
    private Date created_date = new Date();

    public Site() {
    }

    public Site(Integer id) {
        this.id = id;
    }

    public Site(Integer id, String siteName, SiteManager site_manager) {
        this.id = id;
        this.siteName = siteName;
        this.site_manager = site_manager;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public SiteManager getSite_manager() {
        return site_manager;
    }

    public void setSite_manager(SiteManager site_manager) {
        this.site_manager = site_manager;
    }

    public List<Institution> getInstitution() {
        return institution;
    }

    public void setInstitution(List<Institution> institution) {
        this.institution = institution;
    }

    public List<Guard> getGuard() {
        return guard;
    }

    public void setGuard(List<Guard> guard) {
        this.guard = guard;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    
}
