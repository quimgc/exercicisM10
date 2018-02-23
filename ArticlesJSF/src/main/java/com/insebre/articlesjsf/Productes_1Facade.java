/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insebre.articlesjsf;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author quim
 */
@Stateless
public class Productes_1Facade extends AbstractFacade<Productes_1> {

    @PersistenceContext(unitName = "com.insebre_ArticlesJSF_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Productes_1Facade() {
        super(Productes_1.class);
    }
    
}
