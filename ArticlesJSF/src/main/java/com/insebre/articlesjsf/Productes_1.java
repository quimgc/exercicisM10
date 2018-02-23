/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insebre.articlesjsf;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author quim
 */
@Entity
@Table(name = "productes", catalog = "albums", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productes_1.findAll", query = "SELECT p FROM Productes_1 p")
    , @NamedQuery(name = "Productes_1.findByPart", query = "SELECT p FROM Productes_1 p WHERE p.part = :part")
    , @NamedQuery(name = "Productes_1.findByTipus", query = "SELECT p FROM Productes_1 p WHERE p.tipus = :tipus")
    , @NamedQuery(name = "Productes_1.findByEspecificacio", query = "SELECT p FROM Productes_1 p WHERE p.especificacio = :especificacio")
    , @NamedQuery(name = "Productes_1.findByPsuggerit", query = "SELECT p FROM Productes_1 p WHERE p.psuggerit = :psuggerit")
    , @NamedQuery(name = "Productes_1.findByClau", query = "SELECT p FROM Productes_1 p WHERE p.clau = :clau")})
public class Productes_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    private String part;
    @Size(max = 20)
    private String tipus;
    @Size(max = 20)
    private String especificacio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Float psuggerit;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer clau;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productes")
    private Collection<Preus> preusCollection;

    public Productes_1() {
    }

    public Productes_1(Integer clau) {
        this.clau = clau;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEspecificacio() {
        return especificacio;
    }

    public void setEspecificacio(String especificacio) {
        this.especificacio = especificacio;
    }

    public Float getPsuggerit() {
        return psuggerit;
    }

    public void setPsuggerit(Float psuggerit) {
        this.psuggerit = psuggerit;
    }

    public Integer getClau() {
        return clau;
    }

    public void setClau(Integer clau) {
        this.clau = clau;
    }

    @XmlTransient
    public Collection<Preus> getPreusCollection() {
        return preusCollection;
    }

    public void setPreusCollection(Collection<Preus> preusCollection) {
        this.preusCollection = preusCollection;
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
        if (!(object instanceof Productes_1)) {
            return false;
        }
        Productes_1 other = (Productes_1) object;
        if ((this.clau == null && other.clau != null) || (this.clau != null && !this.clau.equals(other.clau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.insebre.articlesjsf.Productes_1[ clau=" + clau + " ]";
    }
    
}
