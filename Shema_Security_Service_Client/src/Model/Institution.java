
package Model;


import java.io.Serializable;
import java.util.*;
public class Institution implements Serializable{
 private static final long serialVersionUID = 945780011117015692L;
 private Integer id;
 private String institutionName;
 
 private Site site;

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

    @Override
    public String toString() {
        return institutionName;
    }
 
}
