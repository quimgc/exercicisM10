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
    @NamedQuery(name = "Usuarisvideo.findAll", query = "SELECT u FROM Usuarisvideo u")
    , @NamedQuery(name = "Usuarisvideo.findById", query = "SELECT u FROM Usuarisvideo u WHERE u.id = :id")
    , @NamedQuery(name = "Usuarisvideo.findByNom", query = "SELECT u FROM Usuarisvideo u WHERE u.nom = :nom")
    , @NamedQuery(name = "Usuarisvideo.findByCognoms", query = "SELECT u FROM Usuarisvideo u WHERE u.cognoms = :cognoms")
    , @NamedQuery(name = "Usuarisvideo.findByTelefon", query = "SELECT u FROM Usuarisvideo u WHERE u.telefon = :telefon")})
public class Usuarisvideo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Size(max = 20)
    private String nom;
    @Size(max = 20)
    private String cognoms;
    @Size(max = 20)
    private String telefon;

    public Usuarisvideo() {
    }

    public Usuarisvideo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarisvideo)) {
            return false;
        }
        Usuarisvideo other = (Usuarisvideo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.insebre.articlesjsf.Usuarisvideo[ id=" + id + " ]";
    }
    
}
