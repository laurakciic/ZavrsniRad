/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.controller;

import hr.laurakciic.zavrsnirad.model.Smjer;
import hr.laurakciic.zavrsnirad.utility.ZavrsniException;

/**
 *
 * @author Laura
 */
public class ObradaSmjer {
    
    public ObradaSmjer(Smjer smjer) {
        super(smjer);
    }
    
    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        if(entitet.getNaziv()==null){
            throw new ZavrsniException("Naziv nije postavljen");
        }
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {

    }
    
}
