/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectpostgres;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author quim
 */
@Embeddable
public class PreusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Column(name = "clau")
    private int clau;

    public PreusPK() {
    }

    public PreusPK(String empresa, int clau) {
        this.empresa = empresa;
        this.clau = clau;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getClau() {
        return clau;
    }

    public void setClau(int clau) {
        this.clau = clau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresa != null ? empresa.hashCode() : 0);
        hash += (int) clau;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreusPK)) {
            return false;
        }
        PreusPK other = (PreusPK) object;
        if ((this.empresa == null && other.empresa != null) || (this.empresa != null && !this.empresa.equals(other.empresa))) {
            return false;
        }
        if (this.clau != other.clau) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "connectpostgres.PreusPK[ empresa=" + empresa + ", clau=" + clau + " ]";
    }
    
}
