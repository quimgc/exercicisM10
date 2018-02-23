/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectpostgres;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author quim
 */
@Entity
@Table(name = "proveidors", catalog = "albums", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Proveidors.findAll", query = "SELECT p FROM Proveidors p")
    , @NamedQuery(name = "Proveidors.findByEmpresa", query = "SELECT p FROM Proveidors p WHERE p.empresa = :empresa")
    , @NamedQuery(name = "Proveidors.findByCredit", query = "SELECT p FROM Proveidors p WHERE p.credit = :credit")
    , @NamedQuery(name = "Proveidors.findByEfectiu", query = "SELECT p FROM Proveidors p WHERE p.efectiu = :efectiu")})
public class Proveidors implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "credit")
    private Boolean credit;
    @Column(name = "efectiu")
    private Boolean efectiu;

    public Proveidors() {
    }

    public Proveidors(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public Boolean getCredit() {
        return credit;
    }

    public void setCredit(Boolean credit) {
        Boolean oldCredit = this.credit;
        this.credit = credit;
        changeSupport.firePropertyChange("credit", oldCredit, credit);
    }

    public Boolean getEfectiu() {
        return efectiu;
    }

    public void setEfectiu(Boolean efectiu) {
        Boolean oldEfectiu = this.efectiu;
        this.efectiu = efectiu;
        changeSupport.firePropertyChange("efectiu", oldEfectiu, efectiu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresa != null ? empresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveidors)) {
            return false;
        }
        Proveidors other = (Proveidors) object;
        if ((this.empresa == null && other.empresa != null) || (this.empresa != null && !this.empresa.equals(other.empresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "connectpostgres.Proveidors[ empresa=" + empresa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
