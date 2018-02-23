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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author quim
 */
@Entity
@Table(catalog = "albums", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveidors.findAll", query = "SELECT p FROM Proveidors p")
    , @NamedQuery(name = "Proveidors.findByEmpresa", query = "SELECT p FROM Proveidors p WHERE p.empresa = :empresa")
    , @NamedQuery(name = "Proveidors.findByCredit", query = "SELECT p FROM Proveidors p WHERE p.credit = :credit")
    , @NamedQuery(name = "Proveidors.findByEfectiu", query = "SELECT p FROM Proveidors p WHERE p.efectiu = :efectiu")})
public class Proveidors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String empresa;
    private Boolean credit;
    private Boolean efectiu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveidors")
    private Collection<Preus> preusCollection;

    public Proveidors() {
    }

    public Proveidors(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Boolean getCredit() {
        return credit;
    }

    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    public Boolean getEfectiu() {
        return efectiu;
    }

    public void setEfectiu(Boolean efectiu) {
        this.efectiu = efectiu;
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
        return "com.insebre.articlesjsf.Proveidors[ empresa=" + empresa + " ]";
    }
    
}
