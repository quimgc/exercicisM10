/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insebre.articlesjsf;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quim
 */
@Entity
@Table(catalog = "albums", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productes.findAll", query = "SELECT p FROM Productes p")
    , @NamedQuery(name = "Productes.findByPart", query = "SELECT p FROM Productes p WHERE p.part = :part")
    , @NamedQuery(name = "Productes.findByTipus", query = "SELECT p FROM Productes p WHERE p.tipus = :tipus")
    , @NamedQuery(name = "Productes.findByEspecificacio", query = "SELECT p FROM Productes p WHERE p.especificacio = :especificacio")
    , @NamedQuery(name = "Productes.findByPsuggerit", query = "SELECT p FROM Productes p WHERE p.psuggerit = :psuggerit")
    , @NamedQuery(name = "Productes.findByClau", query = "SELECT p FROM Productes p WHERE p.clau = :clau")})
public class Productes implements Serializable {

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

    public Productes() {
    }

    public Productes(Integer clau) {
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
        return "com.insebre.articlesjsf.Productes[ clau=" + clau + " ]";
    }
    
}
