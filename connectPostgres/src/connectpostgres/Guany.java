/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectpostgres;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "guany", catalog = "albums", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Guany.findAll", query = "SELECT g FROM Guany g")
    , @NamedQuery(name = "Guany.findByVenda", query = "SELECT g FROM Guany g WHERE g.venda = :venda")
    , @NamedQuery(name = "Guany.findByFactor", query = "SELECT g FROM Guany g WHERE g.factor = :factor")})
public class Guany implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "venda")
    private String venda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "factor")
    private BigDecimal factor;

    public Guany() {
    }

    public Guany(String venda) {
        this.venda = venda;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        String oldVenda = this.venda;
        this.venda = venda;
        changeSupport.firePropertyChange("venda", oldVenda, venda);
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        BigDecimal oldFactor = this.factor;
        this.factor = factor;
        changeSupport.firePropertyChange("factor", oldFactor, factor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venda != null ? venda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guany)) {
            return false;
        }
        Guany other = (Guany) object;
        if ((this.venda == null && other.venda != null) || (this.venda != null && !this.venda.equals(other.venda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "connectpostgres.Guany[ venda=" + venda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
