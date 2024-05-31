
package Model;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Date;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JTable;

public class Deployment implements Serializable{

    
 
 private Integer id;

 private Guard guard;

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
