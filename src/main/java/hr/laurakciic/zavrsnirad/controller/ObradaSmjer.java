/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.controller;

import hr.laurakciic.zavrsnirad.utility.ZavrsniException;
import hr.laurakciic.zavrsnirad.model.Smjer;
import java.math.BigDecimal;

/**
 *
 * @author Laura
 */
public class ObradaSmjer extends Obrada<Smjer>{
    
    public ObradaSmjer(Smjer smjer) {
        super(smjer);
    }
    
    @Override
    protected void kontrolaCreate() throws ZavrsniException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniException {

    }
    
    private void kontrolaNaziv() throws ZavrsniException{
        kontrolaNull(entitet.getNaziv(), "Naziv nije definiran");

        if(entitet.getNaziv().isEmpty()){
            throw new ZavrsniException("Naziv nije postavljen, unijeti naziv");
        }
        boolean broj=false; //testiranje
        try {
            new BigDecimal(entitet.getNaziv());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new ZavrsniException("Naziv ne može biti broj, unijeti naziv");
        }

        if(entitet.getNaziv().length()>200){
            throw new ZavrsniException("Dužina naziva ne može biti veća od 200 znakova");
        }
    }

    private void kontrolaNull(Object o, String poruka) throws ZavrsniException{
        if(o == null){
            throw new ZavrsniException(poruka);
        }
    }
    
}
