
package Model;


import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Institution implements Serializable{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="institution_id")
 private Integer id;
 private String institutionName;
 @ManyToOne
 @JoinColumn(name="site_id")
 private Site site;
 @OneToMany(mappedBy = "institution")
 private List<Deployment> deployment;
 private Date created_date = new Date();

    public Institution() {
    }

    public Institution(Integer id) {
        this.id = id;
    }

    public Institution(Integer id, String institutionName, Site site, List<Deployment> deployment) {
        this.id = id;
        this.institutionName = institutionName;
        this.site = site;
        this.deployment = deployment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Deployment> getDeployment() {
        return deployment;
    }

    public void setDeployment(List<Deployment> deployment) {
        this.deployment = deployment;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
 
}
