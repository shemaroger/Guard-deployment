
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Deployment implements Serializable{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="deployment_id")
 private Integer id;
 @OneToOne
 @JoinColumn(name="guard_id")
 private Guard guard;
 @ManyToOne
 @JoinColumn(name="institution_id")
 private Institution institution;
 
 private Date deployDate = new Date();

    public Deployment() {
    }

    public Deployment(Integer id) {
        this.id = id;
    }

    public Deployment(Integer id, Guard guard, Institution institution) {
        this.id = id;
        this.guard = guard;
        this.institution = institution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Date getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }
 
}
