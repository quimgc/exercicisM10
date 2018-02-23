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
@Table(name = "usuarisvideo", catalog = "albums", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Usuarisvideo.findAll", query = "SELECT u FROM Usuarisvideo u")
    , @NamedQuery(name = "Usuarisvideo.findById", query = "SELECT u FROM Usuarisvideo u WHERE u.id = :id")
    , @NamedQuery(name = "Usuarisvideo.findByNom", query = "SELECT u FROM Usuarisvideo u WHERE u.nom = :nom")
    , @NamedQuery(name = "Usuarisvideo.findByCognoms", query = "SELECT u FROM Usuarisvideo u WHERE u.cognoms = :cognoms")
    , @NamedQuery(name = "Usuarisvideo.findByTelefon", query = "SELECT u FROM Usuarisvideo u WHERE u.telefon = :telefon")})
public class Usuarisvideo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "cognoms")
    private String cognoms;
    @Column(name = "telefon")
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
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        String oldCognoms = this.cognoms;
        this.cognoms = cognoms;
        changeSupport.firePropertyChange("cognoms", oldCognoms, cognoms);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        String oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
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
        return "connectpostgres.Usuarisvideo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
