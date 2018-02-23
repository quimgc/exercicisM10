/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insebre.articlesjsf;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quim
 */
@Entity
@Table(catalog = "albums", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preus.findAll", query = "SELECT p FROM Preus p")
    , @NamedQuery(name = "Preus.findByEmpresa", query = "SELECT p FROM Preus p WHERE p.preusPK.empresa = :empresa")
    , @NamedQuery(name = "Preus.findByClau", query = "SELECT p FROM Preus p WHERE p.preusPK.clau = :clau")
    , @NamedQuery(name = "Preus.findByPreu", query = "SELECT p FROM Preus p WHERE p.preu = :preu")})
public class Preus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PreusPK preusPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Float preu;
    @JoinColumn(name = "clau", referencedColumnName = "clau", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productes_1 productes;
    @JoinColumn(name = "empresa", referencedColumnName = "empresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proveidors proveidors;

    public Preus() {
    }

    public Preus(PreusPK preusPK) {
        this.preusPK = preusPK;
    }

    public Preus(String empresa, int clau) {
        this.preusPK = new PreusPK(empresa, clau);
    }

    public PreusPK getPreusPK() {
        return preusPK;
    }

    public void setPreusPK(PreusPK preusPK) {
        this.preusPK = preusPK;
    }

    public Float getPreu() {
        return preu;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }

    public Productes_1 getProductes() {
        return productes;
    }

    public void setProductes(Productes_1 productes) {
        this.productes = productes;
    }

    public Proveidors getProveidors() {
        return proveidors;
    }

    public void setProveidors(Proveidors proveidors) {
        this.proveidors = proveidors;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preusPK != null ? preusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preus)) {
            return false;
        }
        Preus other = (Preus) object;
        if ((this.preusPK == null && other.preusPK != null) || (this.preusPK != null && !this.preusPK.equals(other.preusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.insebre.articlesjsf.Preus[ preusPK=" + preusPK + " ]";
    }
    
}
