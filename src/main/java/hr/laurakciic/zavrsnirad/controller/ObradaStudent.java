/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.controller;

import hr.laurakciic.zavrsnirad.model.Student;
import hr.laurakciic.zavrsnirad.utility.Oib;
import hr.laurakciic.zavrsnirad.utility.ZavrsniException;
import java.util.List;

/**
 *
 * @author Laura
 */
public abstract class ObradaStudent<T extends Student> extends Obrada<T> {
 
    @Override
    protected void kontrolaCreate() throws ZavrsniException {
     kontrolaIme();
     kontrolaOib();

     //dođu sve ostale kontrole na razini osobe
    }
     
    @Override
    protected void kontrolaUpdate() throws ZavrsniException{
        
    }

    protected void kontrolaOib() throws ZavrsniException{
     if(entitet.getOib()==null || entitet.getOib().isEmpty()){
         throw new ZavrsniException("OIB obavezno");
     }

     if(!Oib.isValjan(entitet.getOib())){
         throw new ZavrsniException("OIB nije valjan");
     }
    }

    protected void kontrolaIme() throws ZavrsniException{
       if(entitet.getIme()==null || entitet.getIme().isEmpty()){
         throw new ZavrsniException("Ime obavezno");
     }
    }
    
}

