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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "productes", catalog = "albums", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Productes.findAll", query = "SELECT p FROM Productes p")
    , @NamedQuery(name = "Productes.findByPart", query = "SELECT p FROM Productes p WHERE p.part = :part")
    , @NamedQuery(name = "Productes.findByTipus", query = "SELECT p FROM Productes p WHERE p.tipus = :tipus")
    , @NamedQuery(name = "Productes.findByEspecificacio", query = "SELECT p FROM Productes p WHERE p.especificacio = :especificacio")
    , @NamedQuery(name = "Productes.findByPsuggerit", query = "SELECT p FROM Productes p WHERE p.psuggerit = :psuggerit")
    , @NamedQuery(name = "Productes.findByClau", query = "SELECT p FROM Productes p WHERE p.clau = :clau")})
public class Productes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "part")
    private String part;
    @Column(name = "tipus")
    private String tipus;
    @Column(name = "especificacio")
    private String especificacio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "psuggerit")
    private Float psuggerit;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clau")
    private Integer clau;

    public Productes() {
    }

    public Productes(Integer clau) {
        this.clau = clau;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        String oldPart = this.part;
        this.part = part;
        changeSupport.firePropertyChange("part", oldPart, part);
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        String oldTipus = this.tipus;
        this.tipus = tipus;
        changeSupport.firePropertyChange("tipus", oldTipus, tipus);
    }

    public String getEspecificacio() {
        return especificacio;
    }

    public void setEspecificacio(String especificacio) {
        String oldEspecificacio = this.especificacio;
        this.especificacio = especificacio;
        changeSupport.firePropertyChange("especificacio", oldEspecificacio, especificacio);
    }

    public Float getPsuggerit() {
        return psuggerit;
    }

    public void setPsuggerit(Float psuggerit) {
        Float oldPsuggerit = this.psuggerit;
        this.psuggerit = psuggerit;
        changeSupport.firePropertyChange("psuggerit", oldPsuggerit, psuggerit);
    }

    public Integer getClau() {
        return clau;
    }

    public void setClau(Integer clau) {
        Integer oldClau = this.clau;
        this.clau = clau;
        changeSupport.firePropertyChange("clau", oldClau, clau);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clau != null ? clau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productes)) {
            return false;
        }
        Productes other = (Productes) object;
        if ((this.clau == null && other.clau != null) || (this.clau != null && !this.clau.equals(other.clau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "connectpostgres.Productes[ clau=" + clau + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
