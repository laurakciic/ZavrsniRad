/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.controller;

import hr.laurakciic.zavrsnirad.model.Izostanak;
import hr.laurakciic.zavrsnirad.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Laura
 */
public class ObradaIzostanak extends ObradaStudent<Izostanak>{

    @Override
    public List<Izostanak> getPodaci() {
        return session.createQuery("from Izostanak").list();
    }
    
    @Override
    protected void kontrolaCreate() throws ZavrsniException {
     super.kontrolaCreate();

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {
    }
    
}
